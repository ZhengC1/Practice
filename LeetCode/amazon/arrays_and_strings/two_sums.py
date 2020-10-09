class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffs = {}
        for index, num in enumerate(nums):
            diff = target - num
            result =  diffs.get(num, None)
            print(result)
            if result is not None:
                print(diffs)
                return [result, index]
            diffs[diff] = index
        return []
