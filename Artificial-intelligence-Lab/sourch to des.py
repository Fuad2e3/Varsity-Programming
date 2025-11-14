import random

def perform_dfs(graph, start, goal, visited=None, path=None):
   
    if visited is None:
        visited = set()
    if path is None:
        path = []
    
    visited.add(start)
    path = path + [start]
    
    if start == goal:
        return path
    
    for neighbor in graph.get(start, []):
        if neighbor not in visited:
            new_path = perform_dfs(graph, neighbor, goal, visited.copy(), path)
            if new_path:
                return new_path
    
    return None

def main():
    
    graph = {
        'A': ['B', 'C'],
        'B': ['D'],
        'C': ['D'],
        'D': ['E'],
        'E': []
    }
    
    start = 'A'
    goal = 'E'
    
    print("Sample Graph (Adjacency List):")
    for node, neighbors in graph.items():
        print(f"{node}: {neighbors}")
    
    print(f"\nSource: {start}")
    print(f"Destination: {goal}")
    
    path = perform_dfs(graph, start, goal)
    
    if path:
        print("\nPath found using DFS:")
        print(" -> ".join(path))
    else:
        print("\nNo path found from source to destination.")

if __name__ == "__main__":
    main()