class MergeSort(object):

    def merge_sort(self, arr):
        if len(arr) > 1:
            mid = len(arr) / 2
            left = arr[:mid]
            right = arr[mid:]

            # recurse
            self.merge_sort(left)
            self.merge_sort(right)

            i = j = k = 0

            while i < len(left) and j < len(right):
                if left[i] < right[j]:
                    arr[k] = left[i]
                    i = i + 1
                else:
                    arr[k] = right[j]
                    j = j + 1
                k = k + 1

            while i < len(left):
                arr[k] = left[i]
                k = k + 1
                i = i + 1

            while j < len(left):
                arr[k] = left[j]
                k = k + 1
                j = j + 1
        print arr



ms = MergeSort()
arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
ms.merge_sort(arr)
