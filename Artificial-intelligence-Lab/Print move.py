from collections import deque

def bfs_moves(grid, start, goal):
    rows = len(grid)
    cols = len(grid[0])
    visited = [[0 for _ in range(cols)] for _ in range(rows)]
    moves = [(-1,0),(1,0),(0,-1),(0,1)]
    move_names = ["Up","Down","Left","Right"]
    queue = deque([start])
    visited[start[0]][start[1]] = 1

    while queue:
        r, c = queue.popleft()
        if (r, c) == goal:
            break
        for i, (dr, dc) in enumerate(moves):
            nr, nc = r + dr, c + dc
            if 0 <= nr < rows and 0 <= nc < cols:
                if visited[nr][nc] == 0 and grid[nr][nc] == 0:
                    queue.append((nr, nc))
                    visited[nr][nc] = 1
                    print(f"Moving {move_names[i]} -> ({nr}, {nc})")

grid = [
    [0, 0, 0, 1, 0],
    [1, 0, 0, 1, 0],
    [0, 0, 0, 0, 0],
    [0, 1, 1, 0, 1],
    [0, 0, 0, 0, 0],
]
start = (0, 0)   
goal = (4, 4)    

bfs_moves(grid, start, goal)