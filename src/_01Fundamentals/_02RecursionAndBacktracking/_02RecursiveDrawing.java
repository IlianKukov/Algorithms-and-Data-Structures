package _01Fundamentals._02RecursionAndBacktracking;

import java.util.Scanner;

public class _02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        drawfigure(n);


    }

    private static void drawfigure(int n) {
    if (n<=0){
        return;
    }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        drawfigure(n-1);

        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
