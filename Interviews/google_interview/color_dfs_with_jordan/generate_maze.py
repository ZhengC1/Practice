import random
def generate_color_maze():
    maze = [[random.randint(0, 7) for _ in range(10)] for _ in range(10)]
    maze[9][9] = 8
    return maze

def generate_maze():
    maze = [[random.randint(0, 1) for _ in range(10)] for _ in range(10)]
    maze[0][0] = 0
    maze[9][9] = 8
    return maze

def write_maze(maze):
    with open("input.txt", "w") as f:
        for i in maze:
            for j in i:
                f.write(str(j))
            f.write("\n")

write_maze(generate_maze())