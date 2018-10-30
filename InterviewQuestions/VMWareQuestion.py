class Node:

    def __init__(self, value, next=None):
        self.value = value
        self._next = next

    @property
    def next(self):
        return self._next

    @next.setter
    def next(self, node):
        self._next = node


class Solution(object):

    def __init__(self):
        first_node = Node(3)
        first_node.next = Node(8)
        node2 = first_node.next
        node2.next = Node(2)
        second_node = Node(7)
        second_node.next = Node(6)

        node = self.add(first_node, second_node)
        result = ''
        while node:
            result += str(node.value)
            node = node.next
        print result


    def add(self, linked_list1, linked_list2):
        num = self.get_value(linked_list1)
        num2 = self.get_value(linked_list2)
        answer = num + num2
        return self.build_linked_list(answer)


    def get_value(self, linked_list):
        str_num = ''
        node = linked_list
        while node:
            str_num = str_num + str(node.value)
            node = node.next
        return int(str_num)

    def build_linked_list(self, value):
        val = str(value)
        i = 0
        start = node = Node(int(val[i]))
        i += 1
        while i < len(val):
            node.next = Node(int(val[i]))
            node = node.next
            i += 1
        return start



s = Solution()
