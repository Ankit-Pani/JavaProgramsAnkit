import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        int employee;
        double taxslab1, taxslab2, taxslab3;
        System.out.println("Enter the Income of the Employee:");
        Scanner sc = new Scanner(System.in);
        employee = sc.nextInt();
        System.out.println("Income Tax paid by the Employee");
        taxslab1 = (employee / 10.0f) * 0.5;
        taxslab2 = (employee/ 10.0f) * 2;
        taxslab3 = (employee / 10.0f) * 3;

        if(employee > 250000 && employee < 500000) {
            System.out.println(taxslab1);
        }
        if (employee > 500000 && employee < 1000000){
            System.out.println(taxslab2);
        }
        if (employee > 1000000) {
            System.out.println(taxslab3);
        }
        if (employee < 250000){
            System.out.println("Invalid Income Slab");
        }

        }


    }




