from typing import List
def merge(arr, arr_1) -> List[int]:
    result = []
    index = 0
    while arr and arr_1:
        head, tail = arr[0], arr_1[0]
        result.append(min(head, tail))
        [arr, arr_1][head > tail].pop(0)
    if arr:
        result.extend(arr)
    elif arr_1:
        result.extend(arr_1)
    return result
        
def divide(arr: List[int]):
    if len(arr) == 1:
        return arr
    middle = len(arr) // 2
    left = arr[:middle]
    right = arr[middle:]
    divided_left = divide(left)
    divided_right = divide(right)
    return merge(divided_left, divided_right)


def test_merge():
    assert merge([2], [1]) == [1,2]

