package main

import (
	"./addtwosum"
	"./longestSubstringWithoutRepeatingCharacters"
	"./twosum"
	"fmt"
)

func twosumMain() {
	var input = []int{3, 2, 4}
	var target = 7
	var output = twosum.TwoSum(input, target)
	for i := 0; i < len(output); i++ {
		fmt.Print(output[i], "")
	}
}

func addtwosumMain() {
	l1 := addtwosum.ListNode{Val: 1}
	//l2 := addtwosum.ListNode{Val:1,Next: &l1}
	l3 := addtwosum.ListNode{Val: 8}
	l4 := addtwosum.ListNode{Val: 9, Next: &l3}
	l5 := addtwosum.AddTwoNumbersII(&l1, &l4)
	for l5 != nil {
		fmt.Printf("%d -> ", l5.Val)
		l5 = l5.Next
	}
}

func lengthOfLongestSubstring() {
	result := longestSubstringWithoutRepeatingCharacters.LengthOfLongestSubstring("bbtwabbcwluatad")
	fmt.Printf("%d", result)
}

func main() {
	//twosumMain()
	//addtwosumMain()
	lengthOfLongestSubstring()

}
