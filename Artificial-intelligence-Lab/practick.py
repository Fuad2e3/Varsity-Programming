import random

def perform_dfs(grid, start, goal, N):
   
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]  
    
    if start == goal:
        return [start]
    
    visited = set([start])
    stack = [start]
    came_from = {start: None}
    
    while stack:
        current = stack.pop()
        
        if current == goal:
            path = []
            while current is not None:
                path.append(current)
                current = came_from.get(current)
            return path[::-1]
        
        r, c = current
        for dr, dc in directions:
            nr, nc = r + dr, c + dc
            neighbor = (nr, nc)
            if (0 <= nr < N and 0 <= nc < N and 
                grid[nr][nc] == 0 and 
                neighbor not in visited):
                visited.add(neighbor)
                stack.append(neighbor)
                came_from[neighbor] = current
    
    return None

def main():
    N = int(input("Enter grid size N: "))
    
    grid = [[0 for _ in range(N)] for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if random.random() < 0.2:
                grid[i][j] = 1
    
    print("\nGenerated Grid (0: open, 1: obstacle):")
    for row in grid:
        print(' '.join(map(str, row)))
    
    start_input = input("Enter starting position (row col): ").strip().split()
    start = (int(start_input[0]), int(start_input[1]))
    
    goal_input = input("Enter goal position (row col): ").strip().split()
    goal = (int(goal_input[0]), int(goal_input[1]))
    
    if not (0 <= start[0] < N and 0 <= start[1] < N) or grid[start[0]][start[1]] == 1:
        print("Invalid start position: out of bounds or obstacle.")
        return
    if not (0 <= goal[0] < N and 0 <= goal[1] < N) or grid[goal[0]][goal[1]] == 1:
        print("Invalid goal position: out of bounds or obstacle.")
        return
    
    path = perform_dfs(grid, start, goal, N)
    
    if path:
        print("\nPath found using DFS:")
        for pos in path:
            print(pos, end=" -> ")
        print(" (end)")
    else:
        print("\nNo path found from start to goal.")

if __name__ == "__main__":
    main()