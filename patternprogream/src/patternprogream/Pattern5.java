/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprogream;

/**
 *
 * @author Linga357
 */
public class Pattern5 {
    public static void main(String[] args) {
        String STAR = "*";
        String star1 = "**********";
        int MAX = 10;
           for (int row = 0; row <= MAX; row += 1 ) {
           for (int col = 0; col <= MAX ; col += 10) {
        if (row == 0 && col == 0)
              System.out.println(star1);
        if (row >= 1 && row <= 4)
              System.out.println(STAR + "        " + STAR);
        if (row == 10 && col == 10)
              System.out.println(star1);
    }
}

    }
}
