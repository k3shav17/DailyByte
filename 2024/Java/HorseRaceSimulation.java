import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class HorseRaceSimulation {

    public static void main(String[] args) throws InterruptedException {

        int noOfHorses = 10;
        Map<String, Integer> leaderBoard = new HashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        CyclicBarrier barrier = new CyclicBarrier(noOfHorses);
        CountDownLatch latch = new CountDownLatch(noOfHorses);

        for (int i = 1; i <= noOfHorses; i++) {
            executor.submit(new Horse(barrier, leaderBoard, latch));
        }

        latch.await();

        System.out.println(leaderBoard);

        System.out.println(leaderBoard.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()))
                .limit(3)
                .collect(Collectors.toList()));

        executor.shutdownNow();

    }

}

class Horse implements Runnable {

    private CyclicBarrier barrier;
    private Map<String, Integer> leaderBoard;
    private CountDownLatch latch;

    public Horse(CyclicBarrier barrier, Map<String, Integer> leaderBoard, CountDownLatch latch) {
        this.barrier = barrier;
        this.leaderBoard = leaderBoard;
        this.latch = latch;
    }

    @Override
    public void run() {

        try {

            System.out.println("starting point of the race");
            barrier.await();

            // simulate the race
            //
            System.out.println("horses started running");
            Random score = new Random();
            int timeTakenToFinish = 1 + score.nextInt(10);
            Thread.sleep(timeTakenToFinish);
            latch.countDown();
            System.out.println("horse finished the race");
            leaderBoard.put(Thread.currentThread().getName(), timeTakenToFinish);

        } catch (Exception e) {
            System.out.println("horse failed to complete the race " + e.getMessage());
            e.printStackTrace();
        }
    }

}
