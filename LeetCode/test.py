class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


four = TreeNode(4)
three = TreeNode(3)
two = TreeNode(2, four)
root = TreeNode(1, two, three)

nodes = [root]
while nodes:
    pre, nodes = nodes, [child for node in nodes for child in [node.left, node.right] if child]
print(sum(node.val for node in pre))

