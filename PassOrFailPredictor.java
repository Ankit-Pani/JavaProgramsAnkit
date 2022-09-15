import java.util.Scanner;

public class PassOrFailPredictor {
    public static void main(String[] args) {
        int sub1, sub2, sub3;
        float percentage, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Subject1 Marks:");
        sub1 = sc.nextInt();
        System.out.println("Enter your Subject2 Marks:");
        sub2 = sc.nextInt();
        System.out.println("Enter your Subject3 Marks:");
        sub3 = sc.nextInt();

        total = sub1 + sub2 + sub3;
        percentage = (total/300)*100;

        System.out.println("Total is: " +total);
        System.out.println("Percentage is: " +percentage);
        if (percentage >= 40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("Congo! Your Have Passed!");
                }
        else {
            System.out.println("Sorry! You Failed, Better Luck Next Time!");
                }




















    }
}
