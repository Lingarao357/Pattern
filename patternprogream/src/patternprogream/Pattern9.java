/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprogream;

import java.util.Scanner;

/**
 *
 * @author Linga357
 */
public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number ");
        int rows = sc.nextInt();
        for (int i = 1; i <= (rows * 2 - 1); i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || j == rows - i + 1) {
                    System.out.print("*");
                }
                System.out.print("");
            }
            System.out.println();
        }
        sc.close();

    }
}
