from collections import deque

def robot_path(grid, start, goal):
    rows = len(grid)
    cols = len(grid[0])
    visited = [[0 for _ in range(cols)] for _ in range(rows)]
    parent = [[None for _ in range(cols)] for _ in range(rows)]
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
                    parent[nr][nc] = (r, c, move_names[i])

    if visited[goal[0]][goal[1]] == 0:
        print("Goal not reachable from start.")
        return

    path = []
    r, c = goal
    while parent[r][c] is not None:
        pr, pc, move = parent[r][c]
        path.append((move, (r, c)))
        r, c = pr, pc
    path.reverse()

    print("\nPath from start to goal:")
    for move, pos in path:
        print(f"Moving {move} -> {pos}")

grid = [
    [0, 0, 0, 1, 0],
    [1, 0, 0, 1, 0],
    [0, 0, 0, 0, 0],
    [0, 1, 1, 0, 1],
    [0, 0, 0, 0, 0],
]
start = (0, 0)   
goal = (4, 4)      

robot_path(grid, start, goal)
