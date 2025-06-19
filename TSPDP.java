package practice;

import java.util.Scanner; 
public class TSPDP {
private static int[][] distanceMatrix;
 private static int numCities;
private static int[][] memoization;

public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of cities: ");
 numCities = scanner.nextInt();
distanceMatrix = new int[numCities][numCities]; 
memoization = new int[numCities][(1 << numCities)];

System.out.println("Enter the distance matrix (separated by spaces):"); 
for (int i = 0; i < numCities; i++) {
for (int j = 0; j < numCities; j++) {

distanceMatrix[i][j] = scanner.nextInt();
}
}

System.out.println("Minimum distance: " + tspDynamicProgramming(0, 1));
}

private static int tspDynamicProgramming(int currentCity, int visited) 
{
 if (visited == (1 << numCities) - 1) 
{ // All cities have been visited
return distanceMatrix[currentCity][0];
}

if (memoization[currentCity][visited] != 0)
 {
 return memoization[currentCity][visited];
}

int minDistance = Integer.MAX_VALUE;

for (int nextCity = 0; nextCity < numCities; nextCity++) {
if ((visited & (1 << nextCity)) == 0) {
 // Check if next city is not visited int distance = distanceMatrix[currentCity][nextCity] +
tspDynamicProgramming(nextCity, visited | (1 << nextCity)); 
minDistance = Math.min(minDistance,distance);
}
}

memoization[currentCity][visited] = minDistance; 
return minDistance;
}
}
