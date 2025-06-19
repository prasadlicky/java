package practice;
public class QuickSort {
    public static void shiftRows(byte[][] state) {
        for (int i = 1; i < state.length; i++) {
            byte[] row = state[i];
            int shiftAmount = i;
            while (shiftAmount > 0) {
                byte temp = row[0];
                System.arraycopy(row, 1, row, 0, row.length - 1);
                row[row.length - 1] = temp;
                shiftAmount--;
            }
        }
    }

    public static void main(String[] args) {
        byte[][] state = {
            {0x01, 0x02, 0x03, 0x04},
            {0x05, 0x06, 0x07, 0x08},
            {0x09, 0x0A, 0x0B, 0x0C},
            {0x0D, 0x0E, 0x0F, 0x10}
        };

        System.out.println("Before Shift:");
        printState(state);

        shiftRows(state);

        System.out.println("\nAfter Shift:");
        printState(state);
    }

    public static void printState(byte[][] state) {
        for (byte[] row : state) {
            for (byte b : row) {
                System.out.print(String.format("%02X ", b));
            }
            System.out.println();
        }
    }
}