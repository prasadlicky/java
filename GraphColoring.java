package practice;

import java.util.*;

public class GraphColoring {
private int V; // Number of vertices
private int[] colors; // Colors assigned to vertices private int[][] graph; // Graph adjacency matrix

public GraphColoring(int V) { this.V = V;
colors = new int[V]; graph = new int[V][V];
}

// Function to check if the given color c is safe for vertex v private boolean isSafe(int v, int c) {
for (int i = 0; i < V; i++) {
if (graph[v][i] == 1 && c == colors[i]) { return false;
}
}
return true;
}

// Recursive function to solve graph coloring problem using backtracking private boolean graphColoringUtil(int v, int m) {
if (v == V) {
return true; // All vertices are colored
}

for (int c = 1; c <= m; c++) { if (isSafe(v, c)) {
colors[v] = c; // Assign color c to vertex v

// Recur to assign colors to rest of the vertices if (graphColoringUtil(v + 1, m)) {
return true;
}

// If assigning color c doesn't lead to a solution, backtrack colors[v] = 0;
}

}

return false; // No color can be assigned to this vertex
}

// Function to solve graph coloring problem using backtracking public boolean graphColoring(int m) {
if (!graphColoringUtil(0, m)) { System.out.println("Solution does not exist"); return false;
}

// Print the colors assigned to vertices System.out.println("Solution exists:"); for (int i = 0; i < V; i++) {
System.out.println("Vertex " + i + " --> Color " + colors[i]);
}
return true;
}

public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

System.out.println("Enter the number of vertices:"); int V = scanner.nextInt();

GraphColoring graph = new GraphColoring(V);

System.out.println("Enter the adjacency matrix:"); for (int i = 0; i < V; i++) {
for (int j = 0; j < V; j++) { graph.graph[i][j] = scanner.nextInt();
}
}

System.out.println("Enter the number of colors:"); int m = scanner.nextInt();

graph.graphColoring(m);

scanner.close();
}
}
