"""
with a 10 x 10 matrix, find your way to a -1 starting from (0, 0)

each location contains a color that will tell you what direction to go
"""

def dfs(matrix, length):
    start = (0, 0)
    queue = [start]
    visited = []
    path = []
    while queue: 
        row, col = queue.pop(0)
        print(f"this is the row: {row}")
        print(f"this is the col: {col}")
        print(f"this is the value: {matrix[row][col]}\n")
        if (row, col) in visited:
            continue
        visited.append((row, col))
        if matrix[row][col] == "1":
            continue
        path.append((row, col))
        if matrix[row][col] == "8":
            print("success")
            return path
        for adj in get_adj(row, col, length):
            queue.append(adj)
    return "there was not path"
     


def get_adj(row, col, length):
    adj_result = []
    if row - 1 >= 0: 
        adj_result.append((row -1, col))
    if row + 1 < length: 
        adj_result.append((row + 1, col))
    if col - 1 >= 0: 
        adj_result.append((row, col - 1))
    if col + 1 < length: 
        adj_result.append((row, col + 1))
    return adj_result

def load_matrix():
    with open("input.txt") as f:
        values = f.readlines()
    matrix = [[j for j in i.strip()] for i in values]
    return matrix

print(dfs(load_matrix(), 10))