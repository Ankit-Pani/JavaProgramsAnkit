import java.util.Scanner;

public class CBSECalculator {
    public static void main(String[] args) {
        int eng, phy, chem, maths, ip, total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks in English:");
        eng = sc.nextInt();
        System.out.println("Enter your Marks in Physics:");
        phy = sc.nextInt();
        System.out.println("Enter your Marks in Chemistry:");
        chem = sc.nextInt();
        System.out.println("Enter your Marks in Maths:");
        maths = sc.nextInt();
        System.out.println("Enter your Marks in Information Practices:");
        ip = sc.nextInt();

        total = eng + phy + chem + maths + ip;
        percentage = (total/500.0f) * 100;
        System.out.println("Total is:  " +total);
        System.out.println("Percentage is:  " +percentage);
    }
}
