from collections import defaultdict  

class GraphColoring:  
    def __init__(self, num_colors):  
        self.states = ["WA", "NT", "QLD", "SA", "NSW", "VIC", "TAS"]  
        self.V = len(self.states)  
        self.num_colors = num_colors  
        self.color = [0] * self.V  
        self.graph = defaultdict(list)  
        self.build_graph()  

    def build_graph(self):  
        # WA (0): NT (1), SA (3)  
        self.add_edge(0, 1)  
        self.add_edge(0, 3)  
        # NT (1): WA (0), SA (3), QLD (2)  
        self.add_edge(1, 3)  
        self.add_edge(1, 2)  
        # QLD (2): NT (1), SA (3), NSW (4)  
        self.add_edge(2, 3)  
        self.add_edge(2, 4)  
        # SA (3): WA (0), NT (1), QLD (2), NSW (4), VIC (5)  
        self.add_edge(3, 4)  
        self.add_edge(3, 5)  
        # NSW (4): QLD (2), SA (3), VIC (5)  
        self.add_edge(4, 5)  
        # VIC (5): SA (3), NSW (4)  
        # TAS (6): none  

    def add_edge(self, u, v):  
        self.graph[u].append(v)  
        self.graph[v].append(u)  

    def solve(self, v):  
        if v == self.V:  
            return True  
        for c in range(1, self.num_colors + 1):  
            if self.is_possible(v, c):  
                self.color[v] = c  
                if self.solve(v + 1):  
                    return True  
                self.color[v] = 0  
        return False  

    def is_possible(self, v, c):  
        for i in self.graph[v]:  
            if c == self.color[i]:  
                return False  
        return True  

    def display(self):  
        text_color = ["", "RED", "GREEN", "BLUE", "YELLOW", "ORANGE", "PINK",  
                      "BLACK", "BROWN", "WHITE", "PURPLE", "VIOLET"]  
        print("\nColors : ", end="")  
        for i in range(self.V):  
            print(self.states[i] + ": " + text_color[self.color[i]], end=" ")  
        print()  

    def graph_color(self):  
        if self.solve(0):  
            print("\nSolution exists ")  
            self.display()  
        else:  
            print("No solution")  

if __name__ == "__main__":  
    gc = GraphColoring(3)  # Use 3 colors  
    gc.graph_color()  