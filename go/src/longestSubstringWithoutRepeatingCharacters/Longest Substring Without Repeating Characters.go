package longestSubstringWithoutRepeatingCharacters

func LengthOfLongestSubstring(s string) int {
	max, length, p := 0, 0, 0
	postion := make(map[uint8]int)
	for i := range s {
		loc, ok := postion[s[i]]
		if ok && loc >= p {
			if length > max {
				max = length
			}
			length = length - loc + p
			p = loc + 1
			postion[s[i]] = i
		} else {
			length++
			postion[s[i]] = i
		}
	}
	if length > max {
		max = length
	}
	return max
}
