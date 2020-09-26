package com.company;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The numbers 1 - "+n+" will be summed, squared and summed, and lastly cubed and summed.");
        System.out.println(" 1 + 2 + ... + " + n + " = " + Main.sum(n) + " = (" + n + " * (" + n + " + 1)) / 2");
        System.out.println(" 1^2 + 2^2 + ... + " + n + "^2 = " + Main.squareSum(n) + " = (" + n + " * (" + n + " + 1) * (2 * "+n+" + 1)) / 6");
        System.out.println(" 1^3 + 2^3 + ... + " + n + "^3 = " + Main.cubedSum(n) + " = (" + n + " ^ 2 * (" + n + " + 1) ^ 2) / 2");
    }


    public static int sum(int m)
    {
        //int index = 0;
        return (m*(m+1)/2);
    }

    public static int squareSum(int m)
    {
        //int index = 0;
        return ((m*(m+1)*(2*m+1))/6);
    }

    public static double cubedSum(int m)
    {
        //int index = 0;
        return ((Math.pow(m,2)/2*Math.pow((m+1), 2))/2);
    }
}
