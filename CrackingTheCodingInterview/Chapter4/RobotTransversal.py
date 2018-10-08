from collections import deque
import random
from pprint import pprint
class RobotTransversal():

    def __init__(self):
        # map_size = input("map size: ")
        # self.__create_map(map_size)
        # print self.bfs()
        # pprint(self.map)
        self.run_sim()

    def run_sim(self):
        for i in range(100):
            self.__create_map(10)
            if self.bfs() == True:
                pprint(self.map)
                break

    def __create_map(self, size):
        self.visited = [[False for x in range(size)] for x in range(size)]
        self.map = [[random.randint(0, 1) for x in range(size)] for x in range(size)]
        self.map[0][0] = 7
        self.map[len(self.map) -1][len(self.map) - 1] = 7

    def bfs(self):
        queue = deque()
        queue.append((0, 0))
        # starting at top left corner
        self.visited[0][0] = True
        finish = (len(self.map) - 1, len(self.map) -1)
        print finish

        while queue:
            current = queue.popleft()
            if current == finish:
                print "Finished"
                return True
            for path_option in self.__get_path_options(current):
                if path_option is None or self.visited[path_option[0]][path_option[1]]:
                    continue
                queue.append(path_option)
                self.visited[path_option[0]][path_option[1]] = True
                self.map[path_option[0]][path_option[1]] = 7
        print "solution was not found"
        return False


    def __get_path_options(self, current_position):
        x = current_position[0]
        y = current_position[1]
        options = []
        if (x + 1) < len(self.map) and (self.map[x + 1][y] != 1):
            options.append((x + 1, y))
        if (y + 1) < len(self.map) and (self.map[x][y + 1] != 1):
            options.append((x, y + 1))
        return options


m = RobotTransversal()
