import random
from collections import deque

N = int(input("Enter grid size N: "))

grid = [[0 for _ in range(N)] for _ in range(N)]
for i in range(N):
    for j in range(N):
        if random.random() < 0.2:
            grid[i][j] = 1

print("\nGrid (0=empty, 1=obstacle):")
for row in grid:
    print(row)

start = (int(input("Start row: ")), int(input("Start col: ")))
goal = (int(input("Goal row: ")), int(input("Goal col: ")))

def bfs_traversal(grid, start):
    N = len(grid)
    visited = [[0 for _ in range(N)] for _ in range(N)]
    moves = [(-1,0),(1,0),(0,-1),(0,1)]
    queue = deque([start])
    visited[start[0]][start[1]] = 1

    while queue:
        r, c = queue.popleft()
        for dr, dc in moves:
            nr, nc = r + dr, c + dc
            if 0 <= nr < N and 0 <= nc < N:
                if visited[nr][nc] == 0 and grid[nr][nc] == 0:
                    queue.append((nr, nc))
                    visited[nr][nc] = 1
    print("BFS traversal completed.")

bfs_traversal(grid, start)