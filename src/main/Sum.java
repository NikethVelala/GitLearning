package src.main;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        // Sum of n numbers:
            System.out.print("Enter a positive number: ");
            Scanner sc = new Scanner(System.in);
            System.out.println(recursive(sc.nextInt()));

    }

    private static int recursive(int n) {

        if(n==0)
            return 0;

        return n + recursive(n-1);
    }
}
