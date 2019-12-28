class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        result = 0
        for i in nums:
            if len(str(i))%2 == 0:
                result += 1
        return result
    
if __name__ == '__main__':
    a = [123,1234,12345,123456]
    x = Solution
    print(x.findNumbers(a))