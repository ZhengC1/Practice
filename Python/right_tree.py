from typing import List, Dict, Optional
from collections import defaultdict

"""
          2 

       /    \ 

     5       3

   /   \      

  6     4

 /   

3
"""

from dataclasses import dataclass

@dataclass
class Node:
    val: int 
    right: Optional["Node"] = None
    left: Optional["Node"] = None

def foo(node: Node, results = defaultdict(list), level=0):
    if node is None: 
        return
    results[level].append(node.val) 
    level += 1
    foo(node.left, results, level)
    foo(node.right, results, level)
    return results

head = curr = Node(2)
curr.right = Node(3)
curr.left = Node(5)
curr = curr.left
curr.right = Node(4)
curr.left = Node(6)
curr = curr.left
curr.left = Node(3)

results = foo(head)
print([results.get(i)[-1] for i in results])