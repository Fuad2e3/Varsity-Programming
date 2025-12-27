# ----------------    Normal BFS     --------------------

from collections import deque

def bfs(graph, start):
    visited = set()
    queue = deque([start])
    visited.add(start)

    while queue:
        node = queue.popleft()
        print(node, end=" ")

        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)


graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

bfs(graph, 'A')



# ----------------    iddfs     --------------------

def dls(graph, node, target, depth, visited):
    visited.append(node)

    if node == target:
        return True

    if depth == 0:
        return False

    for neighbor in graph[node]:
        if neighbor not in visited:
            if dls(graph, neighbor, target, depth - 1, visited):
                return True

    return False


def iddfs(graph, start, target, max_depth):
    for depth in range(max_depth + 1):
        visited = []
        print(f"\nDepth Limit = {depth}")
        found = dls(graph, start, target, depth, visited)
        print("Visited nodes:", visited)

        if found:
            print("\nTarget found!")
            return

    print("\nTarget not found within max depth")


graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': [],
    'F': []
}

iddfs(graph, start='A', target='F', max_depth=3)



# ----------------    bfs     --------------------

from collections import deque

def bfs (grid, start, goal):
  N = len(grid)
  moves = [(1, 0), (-1, 0), (0, 1), (0, -1)]

  q = deque([(start[0],start[1], [start])])

  grid[start[0]][start[1]] = 0

  while q:
    x, y, path = q.popleft()

    if (x, y) == goal:
      return len(path)-1, path

    for dx, dy in moves:
      nx, ny = x+dx, y+dy
      if 0 <= nx < N and 0 <= ny < N and grid[nx][ny] == 1:
        grid[nx][ny] = 0
        q.append((nx, ny, path + [(nx, ny)]))

  return -1, []

grid = [
    [0, 0, 1, 0, 1],
    [0, 1, 1, 1, 1],
    [0, 1, 0, 0, 1],
    [1, 1, 0, 1, 1],
    [1, 0, 0, 0, 1]
]

start = (0, 2)
goal = (4, 4)

steps, path = bfs(grid, start, goal)

if steps != -1:
    print("Goal found in", steps, "moves")
    print("Path:")
    for p in path:
        print(p)
else:
    print("Goal cannot be reached")



# ----------------   N Queen Board     --------------------

# just check 1 row
def is_safe(board, row, col):
    for i in range(row):
        if board[i] == col:
            return False

        if abs(board[i] - col) == abs(i - row):
            return False

    return True

# Now check every row
def is_valid_board(board, n):
    for row in range(n):
        col = board[row]
# col < 0 ----column নম্বর ০-এর চেয়ে ছোট হয়
# col >= n ----column নম্বর n বা তার বেশি হয়
        if col < 0 or col >= n:
            return False

        if not is_safe(board, row, col):
            return False

    return True

n = 4

board = [1, 3, 0, 2]

if is_valid_board(board, n):
    print("The board is VALID")
else:
    print("The board is INVALID")



# ----------------    Alphabeta purn     --------------------

import math

def minimax(curDepth, nodeIndex, maxTurn, scores, targetDepth):
    if curDepth == targetDepth:
        return scores[nodeIndex]

    if maxTurn:
        return max(
            minimax(curDepth + 1, nodeIndex * 2, False, scores, targetDepth),
            minimax(curDepth + 1, nodeIndex * 2 + 1, False, scores, targetDepth)
        )
    else:
        return min(
            minimax(curDepth + 1, nodeIndex * 2, True, scores, targetDepth),
            minimax(curDepth + 1, nodeIndex * 2 + 1, True, scores, targetDepth)
        )


scores = []
n = int(input())
for i in range(n):
    scores.append(int(input()))

treeDepth = int(math.log(len(scores), 2))

print("The optimal value is : ", end="")
print(minimax(0, 0, True, scores, treeDepth))



# ----------------    A*     --------------------

def heuristic(a, b):
    return abs(a[0] - b[0]) + abs(a[1] - b[1])


def a_star(start, goal, grid):
    open_list = [start]
    came_from = {}

    g_cost = {start: 0}
    f_cost = {start: heuristic(start, goal)}

    visited = []

    while open_list:
        current = min(open_list, key=lambda x: f_cost[x])

        print("Visiting:", current)
        visited.append(current)

        if current == goal:
            print("\nGoal reached!")
            print("Visited nodes:", visited)
            return

        open_list.remove(current)

        x, y = current
        neighbors = [
            (x + 1, y), (x - 1, y),
            (x, y + 1), (x, y - 1)
        ]

        for neighbor in neighbors:
            nx, ny = neighbor

            if 0 <= nx < len(grid) and 0 <= ny < len(grid[0]):
                if grid[nx][ny] == 1:
                    continue

                new_g = g_cost[current] + 1

                if neighbor not in g_cost or new_g < g_cost[neighbor]:
                    g_cost[neighbor] = new_g
                    f_cost[neighbor] = new_g + heuristic(neighbor, goal)
                    came_from[neighbor] = current

                    if neighbor not in open_list:
                        open_list.append(neighbor)

    print("No path found")

grid = [
    [0, 0, 0, 0],
    [1, 1, 0, 1],
    [0, 0, 0, 0],
    [0, 1, 1, 0]
]

start = (0, 0)
goal = (3, 3)

a_star(start, goal, grid)
