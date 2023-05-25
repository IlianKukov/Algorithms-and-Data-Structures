package _01Fundamentals._02RecursionAndBacktracking;

import java.util.Scanner;

public class _04RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//        int fact = 1;
//
//        for (int i = 1; i <= n; i++) {
//
//            fact*=i;
//
//        }
//
//        System.out.println(fact);
        
        int result = calculateFactorial(n);

        System.out.println(result);


    }

    private static int calculateFactorial(int n) {
        if (n<=0){
            return 1;
        }
        return n * calculateFactorial(n-1);
    }
}
