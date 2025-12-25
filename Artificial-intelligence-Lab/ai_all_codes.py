
# ----------------    Graph Coloring     --------------------

regions = ["wa", "nt", "sa", "q", "nsw", "v", "t"]
adj_matrix = [
    [0, 1, 1, 0, 0, 0, 0],
    [1, 0, 1, 1, 0, 0, 0],
    [1, 1, 0, 1, 1, 1, 0],
    [0, 1, 1, 0, 1, 0, 0],
    [0, 0, 1, 1, 0, 1, 0],
    [0, 0, 1, 0, 1, 0, 0],
    [0, 0, 0, 0, 0, 0, 0],
]

# adj_list = {
#     0: [1, 2],
#     1: [0, 2, 3],
#     2: [0, 1, 3, 4, 5],
#     3: [1, 2, 4],
#     4: [2, 3, 5],
#     5: [2, 4],
#     6: []
# }

colors = ["red", "green", "blue"]
n = len(regions)
result = [None] * n

def is_safe (node, color):
    for neighbor in range(n): #revove for adj_list
        if adj_matrix[node][neighbor] == 1: #remove for adj_lis
            if result[neighbor] == color:
                return False
    return True

def color_map(node):
    if node == n:
        return True

    for color in colors:
        if is_safe(node, color):
            result[node] = color

            if color_map(node+1):
                return True
            result[node] = None
    return False

if color_map(0):
    print("Solution found!")

    for i in range(n):
        print(f"{regions[i]}: {result[i]}")



# ----------------    N Queen     --------------------


def is_safe(board, row, col):
    for i in range(row):
        if board[i] == col:
            return False
        if abs(board[i] - col) == abs(i - row):
            return False
    return True


def solve_n_queen(board, row, n):
    if row == n:
        print_board(board, n)
        return True

    for col in range(n):
        if is_safe(board, row, col):
            board[row] = col
            if solve_n_queen(board, row + 1, n):
                return True

    return False


def print_board(board, n):
    for i in range(n):
        for j in range(n):
            if board[i] == j:
                print("Q", end=" ")
            else:
                print(".", end=" ")
        print()

n = 4
board = [-1] * n
solve_n_queen(board, 0, n)


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


# ----------------    dfs     --------------------


def dfs(grid, start, goal):
  N = len(grid)

  moves = [(1, 0), (-1, 0), (0, 1), (0, -1)]

  stack = [(start[0], start[1], [start])]

  visited = {start}

  while stack:
    x, y, path = stack.pop()

    if (x, y) == goal:
      return len(path) - 1, path

    for dx, dy in moves:
      nx, ny = x + dx, y + dy

      if 0 <= nx < N and 0 <= ny < N and grid[nx][ny] == 1 and (nx, ny) not in visited:
        visited.add((nx, ny))
        stack.append((nx, ny, path + [(nx, ny)]))

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

steps, path = dfs(grid, start, goal)

if steps != -1:
    print("Goal found in", steps, "moves")
    print("Path:")
    for p in path:
        print(p)
else:
    print("Goal cannot be reached")


# ----------------    bfs report 1     --------------------


from collections import deque
import random

def bfs(grid, start, goal):
    N = len(grid)
    moves = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    q = deque([(start[0], start[1], [start])])
    visited = {start}

    while q:
        x, y, path = q.popleft()

        if (x, y) == goal:
            return len(path) - 1, path

        for dx, dy in moves:
            nx, ny = x + dx, y + dy

            if 0 <= nx < N and 0 <= ny < N and grid[nx][ny] == 1 and (nx, ny) not in visited:
                visited.add((nx, ny))
                q.append((nx, ny, path + [(nx, ny)]))

    return -1, []

N = int(input("Enter grid size (N): "))

grid = [[random.choice([0, 1]) for _ in range(N)] for _ in range(N)]

print("\nGenerated Grid (1 = Free, 0 = Obstacle):")
for row in grid:
    print(row)

sx, sy = map(int, input("\nEnter Start position (row col): ").split())
gx, gy = map(int, input("Enter Goal position (row col): ").split())
start = (sx, sy)
goal = (gx, gy)

if grid[sx][sy] == 0 or grid[gx][gy] == 0:
    print("\nStart or Goal is on an obstacle. Try again!")
else:
    steps, path = bfs(grid, start, goal)

    if steps != -1:
        print("\nGoal found in", steps, "moves")
        print("Path:")
        for p in path:
            print(p)
    else:
        print("\nGoal cannot be reached")


# ----------------    dfs report 1     --------------------


from collections import deque
import random

def dfs(grid, start, goal):
    N = len(grid)
    moves = [(1, 0, "Down"), (-1, 0, "Up"), (0, 1, "Right"), (0, -1, "Left")]
    stack = [(start[0], start[1], [start], [])]
    visited = {start}

    while stack:
        x, y, path, move_list = stack.pop()

        if (x, y) == goal:
            return len(path) - 1, path, move_list

        for dx, dy, direction in moves:
            nx, ny = x + dx, y + dy

            if 0 <= nx < N and 0 <= ny < N and grid[nx][ny] == 1 and (nx, ny) not in visited:
                visited.add((nx, ny))
                stack.append((nx, ny, path + [(nx, ny)], move_list + [(direction, (nx, ny))]))

    return -1, [], []

N = int(input("Enter grid size N: "))

grid = [[random.choice([0, 1]) for _ in range(N)] for _ in range(N)]

print("\nGenerated Grid (1 = Free, 0 = Obstacle):")
for row in grid:
    print(row)

sx, sy = map(int, input("\nEnter Start position (row col): ").split())
gx, gy = map(int, input("Enter Goal position (row col): ").split())
start = (sx, sy)
goal = (gx, gy)

if grid[sx][sy] == 0 or grid[gx][gy] == 0:
    print("\nStart or Goal is on an obstacle. Try again!")
else:
    steps, path, move_list = dfs(grid, start, goal)
    if steps != -1:
        print("\nGoal found in", steps, "moves\n")
        # Print all moves
        for move, coord in move_list:
            print(f"Moving {move} -> {coord}")
        # Print final path
        print("\nFinal Path Coordinates:")
        for p in path:
            print(p)
    else:
        print("\nGoal cannot be reached")


# ----------------    Graph coloring (report 2)    --------------------


file = open("graph.txt", "r")

n = int(file.readline().strip())
regions = file.readline().strip().split()

adj_matrix = []
for _ in range(n):
    row = list(map(int, file.readline().split()))
    adj_matrix.append(row)

file.close()

colors = ["Red", "Green", "Blue"]

result = [None] * n

def is_safe(node, color):
    for neighbor in range(n):
        if adj_matrix[node][neighbor] == 1:
            if result[neighbor] == color:
                return False
    return True

def color_map(node):
    if node == n:
        return True

    for color in colors:
        if is_safe(node, color):
            result[node] = color

            if color_map(node + 1):
                return True

            result[node] = None
    return False

if color_map(0):
    print("Solution Found:")
    for i in range(n):
        print(f"{regions[i]} : {result[i]}")
else:
    print("No solution found")


# 7
# WA NT SA Q NSW V T
# 0 1 1 0 0 0 0
# 1 0 1 1 0 0 0
# 1 1 0 1 1 1 0
# 0 1 1 0 1 0 0
# 0 0 1 1 0 1 0
# 0 0 1 0 1 0 0
# 0 0 0 0 0 0 0


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


# ----------------    A* Heuristic     --------------------


def a_star(graph, heuristic, start, goal):
    open_list = [start]
    visited = []

    g_cost = {start: 0}
    f_cost = {start: heuristic[start]}

    parent = {}

    while open_list:
        current = min(open_list, key=lambda x: f_cost[x])

        print("Visiting:", current)
        visited.append(current)

        if current == goal:
            print("\nGoal reached!")
            print("Visited nodes:", visited)
            return

        open_list.remove(current)

        for neighbor, cost in graph[current]:
            new_g = g_cost[current] + cost

            if neighbor not in g_cost or new_g < g_cost[neighbor]:
                g_cost[neighbor] = new_g
                f_cost[neighbor] = new_g + heuristic[neighbor]
                parent[neighbor] = current

                if neighbor not in open_list:
                    open_list.append(neighbor)

    print("No path found")

graph = {
    'A': [('B', 1), ('C', 3)],
    'B': [('D', 3), ('E', 1)],
    'C': [('F', 5)],
    'D': [('G', 1)],
    'E': [('G', 5)],
    'F': [('G', 2)],
    'G': []
}

heuristic = {
    'A': 7,
    'B': 6,
    'C': 5,
    'D': 3,
    'E': 4,
    'F': 2,
    'G': 0
}

a_star(graph, heuristic, 'A', 'G')


# ----------------    Others     --------------------
# ----------------    Validate N Queen Board     --------------------


def is_safe(board, row, col):
    for i in range(row):
        if board[i] == col:
            return False

        if abs(board[i] - col) == abs(i - row):
            return False

    return True


def is_valid_board(board, n):
    for row in range(n):
        col = board[row]

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


# ----------------    Validate N Queen 2D Board     --------------------


def is_valid_nqueen(board):
    n = len(board)
    queens = []

    # Step 1: Collect all queen positions
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                queens.append((i, j))

    # Step 2: Check pairwise conflicts
    for i in range(len(queens)):
        r1, c1 = queens[i]
        for j in range(i + 1, len(queens)):
            r2, c2 = queens[j]

            # Same row
            if r1 == r2:
                return False

            # Same column
            if c1 == c2:
                return False

            # Same diagonal
            if abs(r1 - r2) == abs(c1 - c2):
                return False

    return True

board = [
    [0, 1, 0, 0],
    [0, 0, 0, 1],
    [1, 0, 0, 0],
    [0, 0, 1, 0]
]


# ----------------    Normal DFS     --------------------


graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': [],
    'F': []
}

def dfs(graph, node, visited):
    if node not in visited:
        print(node, end=" ")
        visited.add(node)

        for neighbor in graph[node]:
            dfs(graph, neighbor, visited)

visited = set()
dfs(graph, 'A', visited)


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

bfs(graph, 'A')