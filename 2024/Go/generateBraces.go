package main

import "fmt"

type Paranthesis struct{}

func (p *Paranthesis) GenerateParanthesis() {

	size := 3
	var paranthesis []string
	paranthesisHelper(&paranthesis, "", size, size)
	fmt.Println("Day two problem -> ", paranthesis)

}

func paranthesisHelper(braces *[]string, current string, open, close int) {

	if open == 0 && close == 0 {
		*braces = append(*braces, current)
		return
	}

	if open > 0 {
		paranthesisHelper(braces, current+"(", open-1, close)
	}

	if close > open {
		paranthesisHelper(braces, current+")", open, close-1)
	}
}
