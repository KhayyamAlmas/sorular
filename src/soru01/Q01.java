package soru01;

public class Q01 {
    /*

               A
              BBB
             CCCCC
            DDDDDDD
           EEEEEEEEE
         */
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1, p = 'A'; i < n; i++, p++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {

                System.out.print((char) p);
            }
            for (int j = 1; j < i; j++) {

                System.out.print((char) p);
            }
            System.out.println();
        }
    }

}
