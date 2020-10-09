import os
import sys
from heapq import heappush, heappop

min_heap = []
max_heap = []

def rebalance():
    if len(max_heap) > len(min_heap):
        max_num = -heappop(max_heap)
        heappush(min_heap, max_num)
    else:
        min_num = heappop(min_heap)
        heappush(max_heap, -min_num)

def add_to_heap(num):
    if len(min_heap) == len(max_heap):
        heappush(max_heap, -num)
    else:
        heappush(min_heap, num)
    rebalance()


def get_median():
    if len(min_heap) > len(max_heap):
        return float(min_heap[0])
    else:
        return (-max_heap[0] + min_heap[0])/ 2.0

#
# Complete the runningMedian function below.
#
def runningMedian(a_list):
    result = []
    for num in a_list:
        add_to_heap(num)
        result.append(get_median())
    return result



