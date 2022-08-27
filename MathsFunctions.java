public class MathsFunctions {
    public static void main(String[] args) {
        int n1 = Math.abs(80);
        System.out.println("absolute value of 80 is: "+n1);
        int n2 = Math.abs(-60);
        System.out.println("absolute value of -60 is: "+n2);
        double n3 = Math.sqrt(36.0);
        System.out.println("Square root of 36.0 is: "+n3);
        double n4 = Math.cbrt(8.0);
        System.out.println("cube root 0f 8.0 is: "+n4);
        int n5= Math.max(15,80);
        System.out.println("max value is: "+n5);
        int n6 =Math.min(15,80);
        System.out.println("min value is: "+n6);
        double n7 = Math.ceil(6.34);
        System.out.println("ceil value of 6.34 is "+n7);
        double n8 = Math.floor(6.34);
        System.out.println("floor value of 6.34 is: "+n8);
        double n9 = Math.round(22.445);
        System.out.println("round value of 22.445 is: "+n9);
        double n10 = Math.round(22.545);
        System.out.println("round value of 22.545 is: "+n10);
        double n11= Math.pow(2.0, 3.0);
        System.out.println("power value is: "+n11);
        double n12= Math.random();
        System.out.println("random value is: "+n12);
        double n13 = Math. signum (22.4);
        System.out.println("signum value of 22.4 is: "+n13);
        double n14 = Math. signum (-22.5);
        System.out.println("signum value of 22.5 is: "+n14);
        int n15= Math.addExact(35, 21);
        System.out.println("added value is: "+n15);
        int n16=Math. incrementExact(36);
        System.out.println("increment of 36 is: "+n16);
        int n17 = Math.subtractExact(36, 11);
        System.out.println("difference is: "+n17);
        int n18 = Math.multiplyExact(5, 5);
        System.out.println("product is: "+n18);
        int n19 =Math. decrementExact (36);
        System.out.println("decrement of 36 is: "+n19);
        int n20 =Math. negateExact(36);
        System.out.println("negation value of 36 is: "+n20);
    }
}
