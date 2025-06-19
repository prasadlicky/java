package hlo;
import java.util.*;
//21BCE7080
	public class combinatins1 {
	    private static final int MATRIX_SIZE = 2; 
	    public static String encrypt(String plaintext, int[][] key) {
	        StringBuilder ciphertext = new StringBuilder();
	        while (plaintext.length() % MATRIX_SIZE != 0) {
	            plaintext += 'X'; 
	        }
	        for (int i = 0; i < plaintext.length(); i += MATRIX_SIZE) {
	            int[][] blockMatrix = new int[MATRIX_SIZE][1];
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                blockMatrix[j][0] = plaintext.charAt(i + j) - 'A';
	            }
	            int[][] encryptedMatrix = multiplyMatrices(key, blockMatrix);
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                ciphertext.append((char) ((encryptedMatrix[j][0] % 26) + 'A'));
	            }
	        }
	        return ciphertext.toString();
	    }
	    public static String decrypt(String ciphertext, int[][] key) {
	        StringBuilder plaintext = new StringBuilder();
	        for (int i = 0; i < ciphertext.length(); i += MATRIX_SIZE) {
	            int[][] blockMatrix = new int[MATRIX_SIZE][1];
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                blockMatrix[j][0] = ciphertext.charAt(i + j) - 'A';
	            }
	            int[][] inverseKey = findInverse(key);
	            int[][] decryptedMatrix = multiplyMatrices(inverseKey, blockMatrix);
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                plaintext.append((char) ((decryptedMatrix[j][0] % 26) + 'A'));
	            }
	        }
	        return plaintext.toString();
	    }
	    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
	        int[][] result = new int[MATRIX_SIZE][1];
	        for (int i = 0; i < MATRIX_SIZE; i++) {
	            for (int j = 0; j < 1; j++) {
	                for (int k = 0; k < MATRIX_SIZE; k++) {
	                    result[i][j] += a[i][k] * b[k][j];
	                }
	                result[i][j] %= 26; 
	            }
	        }
	        return result;
	    }
	    private static int[][] findInverse(int[][] key) {
	        int determinant = key[0][0] * key[1][1] - key[0][1] * key[1][0];
	        determinant = (determinant % 26 + 26) % 26; 
	        int inverseDeterminant = -1;
	        for (int i = 0; i < 26; i++) {
	            if ((determinant * i) % 26 == 1) {
	                inverseDeterminant = i;
	                break;
	            }
	        }
	        int[][] inverse = {
	                {key[1][1], -key[0][1]},
	                {-key[1][0], key[0][0]}
	        };
	        for (int i = 0; i < MATRIX_SIZE; i++) {
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                inverse[i][j] *= inverseDeterminant;
	                inverse[i][j] = ((inverse[i][j] % 26) + 26) % 26; // Modulo 26 for each element
	            }
	        }
	        return inverse;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter plaintext: ");
	        String plaintext = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
	        int[][] key = new int[MATRIX_SIZE][MATRIX_SIZE];
	        System.out.println("Enter key matrix (2x2, row-wise, space-separated): ");
	        for (int i = 0; i < MATRIX_SIZE; i++) {
	            for (int j = 0; j < MATRIX_SIZE; j++) {
	                key[i][j] = scanner.nextInt();
	            }
	        }
	        String encryptedText = encrypt(plaintext, key);
	        System.out.println("Encrypted: " + encryptedText);
	        String decryptedText = decrypt(encryptedText, key);
	        System.out.println("Decrypted: " + decryptedText);
	        scanner.close();
	    }
	}
