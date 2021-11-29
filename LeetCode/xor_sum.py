from itertools import chain, combinations 
from functools import reduce
from typing import List
def subset_xor_sum(nums: List[int]) -> int:
    return sum(
            [
                reduce(lambda x,y: x ^ y, b) for b in [chain.from_iterable(combinations(nums, r) for r in range(len(nums) + 1))]
            ]
        )


subset_xor_sum([1,2,3,4,5])
