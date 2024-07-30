package main

import (
	"fmt"
)

type DayOne struct{}

func (one *DayOne) LongestSubSequence() {

	nums := []int{10, 9, 2, 5, 3, 7, 101, 18}
	dp := make([]int, len(nums))

	for i := 1; i < len(nums); i++ {

		for j := 0; j < i; j++ {

			if nums[i] > nums[j] {
				dp[i] = max(dp[i], dp[j]+1)
			}
		}

	}

	max := dp[0]

	for _, el := range dp {
		if el > max {
			max = el
		}
	}

	// +1 as every single element itself forms a strictly increasing subsequence of length 1.
	fmt.Println("Day one problem -> ", max+1)

}

func max(first, second int) int {

	if first > second {
		return first
	}

	return second
}
