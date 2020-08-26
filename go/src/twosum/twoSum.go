package twosum

func TwoSum(nums []int, target int) []int {
	var numsMap = make(map[int]int, len(nums))
	var length = len(nums)
	for i := 0; i < length; i++ {
		numsMap[nums[i]] = i
	}
	for i := 0; i < length; i++ {
		var num = target - nums[i]
		var value, isPresent = numsMap[num]
		if isPresent && value != i {
			var result = []int{i, value}
			return result
		}
	}
	return nil
}
