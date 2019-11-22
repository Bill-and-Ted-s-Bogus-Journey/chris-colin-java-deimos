import java.util.Scanner;

public class colin {
    public static void main(String[] args) {

/*
 * Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
 *
 * With an input of 10.
 * The pattern must look like :
 *
 *    1
 *    2 3
 *    4 5 6
 *    7 8 9 10
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How rows do you want the pyramid to be?");
        int rowNum = scanner.nextInt();
        int counter = 1;
        for(int i = 1; i <= rowNum; i++){
            for(int x = 0; x < i; x++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
