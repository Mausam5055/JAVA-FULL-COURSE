import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int factorsOfN = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsOfN = factorsOfN + 1;
            }
        }

        if (factorsOfN == 2) {
            System.out.println("The number is a Prime Number");
        } else {
            System.out.println("The number is Not a Prime Number");
        }

        sc.close();
    }
}