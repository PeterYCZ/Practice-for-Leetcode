package addtwosum

type ListNode struct {
	Val  int
	Next *ListNode
}

func AddTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var i, point, value int
	l3 := l1
	l4 := l1
	for l1 != nil && l2 != nil {
		if i = l1.Val + l2.Val + point; i >= 10 {
			point = 1
			value = i - 10
		} else {
			point = 0
			value = i
		}
		l1.Val = value
		l3 = l1
		l1 = l1.Next
		l2 = l2.Next
	}
	for l1 != nil {
		l3.Next = l1
		l3 = l3.Next
		if l3.Val+point >= 10 {
			l3.Val = l3.Val - 10 + point
			point = 1
		} else {
			l3.Val = l3.Val + point
			point = 0
		}
		l1 = l1.Next
	}
	for l2 != nil {
		l3.Next = l2
		l3 = l3.Next
		if l3.Val+point >= 10 {
			l3.Val = l3.Val - 10 + point
			point = 1
		} else {
			l3.Val = l3.Val + point
			point = 0
		}
		l2 = l2.Next
	}
	if l1 == nil && l2 == nil && point == 1 {
		l3.Next = &ListNode{Val: 1}
	}
	return l4
}

func AddTwoNumbersII(l1 *ListNode, l2 *ListNode) *ListNode {
	var p, q, head int
	l3 := &ListNode{}
	l4 := l3
	for l1 != nil || l2 != nil {
		l3.Next = &ListNode{}
		l3 = l3.Next
		if l1 != nil {
			p = l1.Val
		} else {
			p = 0
		}
		if l2 != nil {
			q = l2.Val
		} else {
			q = 0
		}
		sum := p + q + head
		if sum >= 10 {
			l3.Val = sum - 10
			head = 1
		} else {
			l3.Val = sum
			head = 0
		}
		if l1 != nil {
			l1 = l1.Next
		}
		if l2 != nil {
			l2 = l2.Next
		}
	}
	if head == 1 {
		l3.Next = &ListNode{Val: 1}
	}
	return l4.Next
}
