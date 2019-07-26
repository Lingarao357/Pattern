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
public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        int rows = sc.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows; j++) {
                if (i == 0 || i == rows || j == 0 || j == rows) 
                    System.out.print("*");
                 else 
                    System.out.print(" ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
