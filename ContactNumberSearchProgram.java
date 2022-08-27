import java.util.Objects;
import java.util.Scanner;

public class ContactNumberSearchProgram {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter Contacts' Name Here:");
        Scanner sc = new Scanner(System.in);
        name = sc.next();

        if(Objects.equals(name, "Ankit")){
            System.out.println("+91 9810370465");
        }
        else if(Objects.equals(name,"Avtans")){
            System.out.println("+91 9810263070");
        }
        else if(Objects.equals(name, "Amritansh")){
            System.out.println("+91 9871169194");
        }
        else if(Objects.equals(name, "Amaan")){
            System.out.println("+91 9811020868");
        }
        else{
            System.out.println("No Contact Found!");
        }




        }


    }




