def dls(node, graph, visited, limit):
    visited[node] = 1
    print(node, end=" ")

    if limit == 0:
        return

    for nei in range(len(graph)):
        if graph[node][nei] == 1 and visited[nei] == 0:
            dls(nei, graph, visited, limit - 1)


def iddfs(start, target, graph, max_depth):
    for depth in range(max_depth + 1):
        visited = [0] * len(graph)
        print("\nDepth", depth, ": ", end="")
        dls(start, graph, visited, depth)


n = int(input("Enter number of nodes: "))
graph = []

print("Enter adjacency matrix:")
for _ in range(n):
    graph.append(list(map(int, input().split())))

src = int(input("Enter source node: "))
target = int(input("Enter target node: "))
max_depth = int(input("Enter maximum depth: "))

iddfs(src, target, graph, max_depth)