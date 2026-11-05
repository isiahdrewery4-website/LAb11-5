import java.util.Scanner;

public class ProductPrices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // part A
        double[][] prices = new double[3][4];

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter prices for Store " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.print("Price of Product " + (j + 1) + ": ");
                prices[i][j] = input.nextDouble();
            }
        }

        System.out.println("\Product Prices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(prices[i][j] + "\t");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {

            double total = 0;

            for (int j = 0; j < 4; j++) {

                total = total + prices[i][j];
            }

            System.out.println("Total for Store "
                    + (i + 1) + ": " + total);
        }


        // part b
        String[][] employees = {
            {"John", "Manager", "HR"},
            {"Mary", "Developer", "IT"},
            {"Peter", "Accountant", "Finance"},
            {"Sarah", "Analyst", "IT"}
        };

        System.out.println("\nAll Employee Information:");

        for (int i = 0; i < employees.length; i++) {

            for (int j = 0; j < employees[i].length; j++) {

                System.out.print(employees[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nEmployees in IT Department:");

        for (int i = 0; i < employees.length; i++) {

            if (employees[i][2].equals("IT")) {

                System.out.println(employees[i][0]);
            }
        }

        int hr = 0;
        int it = 0;
        int finance = 0;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i][2].equals("HR")) {
                hr++;
            }
            else if (employees[i][2].equals("IT")) {
                it++;
            }
            else if (employees[i][2].equals("Finance")) {
                finance++;
            }
        }

        System.out.println("\nEmployee Count:");

        System.out.println("HR: " + hr);
        System.out.println("IT: " + it);
        System.out.println("Finance: " + finance);

        input.close();
    }
}
