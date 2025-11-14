def dls_topo(node, graph, visited, stack, limit):
    visited[node] = 1

    if limit == 0:
        return

    for nei in range(len(graph)):
        if graph[node][nei] == 1 and visited[nei] == 0:
            dls_topo(nei, graph, visited, stack, limit - 1)

    stack.append(node)


def iddfs_topological(graph):
    n = len(graph)
    max_depth = n

    for depth in range(max_depth + 1):
        visited = [0] * n
        stack = []

        for node in range(n):
            if visited[node] == 0:
                dls_topo(node, graph, visited, stack, depth)

        print("Depth", depth, ":", list(reversed(stack)))


n = int(input("Enter number of nodes: "))
graph = []

print("Enter adjacency matrix:")
for _ in range(n):
    graph.append(list(map(int, input().split())))

iddfs_topological(graph)
