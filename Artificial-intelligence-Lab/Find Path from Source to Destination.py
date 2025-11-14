found = 0

def dls(node, target, graph, visited, path, limit):
    global found

    visited[node] = 1
    path.append(node)

    if node == target:
        found = 1
        print("Path:", *path)
        return

    if limit == 0:
        path.pop()
        return

    for nei in range(len(graph)):
        if graph[node][nei] == 1 and visited[nei] == 0:
            dls(nei, target, graph, visited, path, limit - 1)
            if found == 1:
                return

    path.pop()


def iddfs_path(src, target, graph, max_depth):
    global found
    for depth in range(max_depth + 1):
        found = 0
        visited = [0] * len(graph)
        path = []
        dls(src, target, graph, visited, path, depth)
        if found == 1:
            print("Found at depth", depth)
            return

    print("No path found")

n = int(input("Enter number of nodes: "))
graph = []

print("Enter adjacency matrix:")
for _ in range(n):
    graph.append(list(map(int, input().split())))

src = int(input("Enter source node: "))
target = int(input("Enter destination: "))
max_depth = int(input("Enter maximum depth: "))

iddfs_path(src, target, graph, max_depth)