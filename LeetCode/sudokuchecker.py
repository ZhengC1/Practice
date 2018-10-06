import collections
class SudokuChecker():
    sudoku = [
      ["5","3",".",".","7",".",".",".","."],
      ["6",".",".","1","9","5",".",".","."],
      [".","9","8",".",".",".",".","6","."],
      ["8",".",".",".","6",".",".",".","3"],
      ["4",".",".","8",".","3",".",".","1"],
      ["7",".",".",".","2",".",".",".","6"],
      [".","6",".",".",".",".","2","8","."],
      [".",".",".","4","1","9",".",".","5"],
      [".",".",".",".","8",".",".","7","9"]
    ]


    def is_valid(self):
        return self.check_rows() and self.check_cols()


    def check_rows(self):
        for row in self.sudoku:
            if self.has_duplicates(row):
                return False
        return True

    # take in a tuple of index
    def check_cols(self):
        # contruct list from column indexes? 
        for i, num in enumerate(self.sudoku[0]):
            if self.has_duplicates([row[i] for row in self.sudoku]):
                return False
        return True

    # takes tuple of index with row value
    def check_region(self, index):
        pass

    def has_duplicates(self, nums):
       row_dict = collections.defaultdict(int)
       for num in nums:
           row_dict[num] += 1
       return all(val < 2 and key != '.' for key, val in row_dict.iteritems())


sud = SudokuChecker()
print(sud.is_valid())
