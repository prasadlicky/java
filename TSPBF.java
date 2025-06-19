package practice;

import java.util.Scanner; 
public class TSPBF {

private static int[][] distanceMatrix;
private static int numCities;

public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of cities: ");
 numCities = scanner.nextInt();
distanceMatrix = new int[numCities][numCities];

System.out.println("Enter the distance matrix (separated by spaces):"); 
for (int i = 0; i < numCities; i++) {
for (int j = 0; j < numCities; j++)
 { distanceMatrix[i][j] = scanner.nextInt();
}
}

System.out.println("Minimum distance: " + bruteForceTSP());
}

private static int bruteForceTSP() { int[] cities = new int[numCities];
 for (int i = 0; i < numCities; i++) {
cities[i] = i;
}
return bruteForceTSPUtil(cities, 1, 0);
}

private static int bruteForceTSPUtil(int[] cities, int index, int currentDistance) { if (index == numCities) {
return currentDistance + distanceMatrix[cities[numCities - 1]][cities[0]];
}

int minDistance = Integer.MAX_VALUE; for (int i = index; i < numCities; i++) {
swap(cities, i, index);
int distance = distanceMatrix[cities[index - 1]][cities[index]];
int newDistance = bruteForceTSPUtil(cities, index + 1, currentDistance + distance); minDistance = Math.min(minDistance, newDistance);

swap(cities, i, index);
}
return minDistance;
}

private static void swap(int[] cities, int i, int j) { int temp = cities[i];
cities[i] = cities[j]; cities[j] = temp;
}
}