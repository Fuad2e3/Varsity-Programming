def dfs_topo(graph, node, visited, order):
    
    visited.add(node)
    for neighbor in graph.get(node, []):
        if neighbor not in visited:
            dfs_topo(graph, neighbor, visited, order)
    order.append(node)

def topological_sort(graph, all_nodes):
    
    visited = set()
    order = []
    for node in all_nodes:
        if node not in visited:
            dfs_topo(graph, node, visited, order)
    return order[::-1]  

def main():
    N = int(input("Enter grid size N for 2D plane: "))
    
    all_nodes = [(i, j) for i in range(N) for j in range(N)]
    
    graph = {}
    for i in range(N):
        for j in range(N):
            node = (i, j)
            graph[node] = []
            
            if j + 1 < N:
                graph[node].append((i, j + 1))
            if i + 1 < N:
                graph[node].append((i + 1, j))
    
    print(f"\nGenerated Directed Grid Graph (N={N}x{N}, edges: right & down):")
    print("This forms a DAG suitable for topological sorting.")
    print("Sample edges from (0,0):", graph.get((0,0), []))
    
    topo_order = topological_sort(graph, all_nodes)
    
    print("\nTopological Order of Node Traversal (Robot path dependencies):")
    for idx, pos in enumerate(topo_order, 1):
        print(f"{idx}: {pos}")
    
    print(f"\nThis order ensures the robot visits nodes respecting directed edges (e.g., right/down moves).")

if __name__ == "__main__":
    main()