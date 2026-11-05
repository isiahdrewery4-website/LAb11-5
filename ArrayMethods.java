import java.util.Scanner;

public class ArrayMethods {

    int[][] matrix = {
        {12, 45, 23, 18},
        {67, 34, 89, 21},
        {15, 92, 56, 43},
        {78, 31, 65, 99}
    };

    // part a
    public static void displayMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // part b
    public static void findLargestInRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int largest = array[i][0];

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }

            System.out.println("Largest value in row "
                    + (i + 1) + ": " + largest);
        }
    }

    // part c
    public static int findLargest(int[][] array) {
        int largest = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }

        return largest;
    }

    // part d
    public static void columnSum(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }

            System.out.println("Sum of column "
                    + (j + 1) + ": " + sum);
        }
    }

    // part e
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\Largest value in each row:");
        findLargestInRows(matrix);

        System.out.println("\Largest value in entire array: "
                + findLargest(matrix));

        System.out.println("\nSum of each column:");
        columnSum(matrix);

        int[][] numbers = new int[5][3];

        System.out.println("\Enter 15 integers:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter value for row "
                        + (i + 1) + ", column " + (j + 1) + ": ");
                numbers[i][j] = input.nextInt();
            }
        }

        System.out.println("\New Matrix:");
        displayMatrix(numbers);

        System.out.println("\Largest value in each row:");
        findLargestInRows(numbers);

        System.out.println("\Largest value in entire array: "
                + findLargest(numbers));

        input.close();
    }
}
