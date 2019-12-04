import java.util.Scanner;
import java.util.Arrays;

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

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How rows do you want the pyramid to be?");
//        int rowNum = scanner.nextInt();
//        int counter = 1;
//        for(int i = 1; i <= rowNum; i++){
//            for(int x = 0; x < i; x++){
//                System.out.print(counter + " ");
//                counter++;
//            }
//            System.out.println();
//        }


//        Find the Largest Numbers in a Group of Arrays
//        Create a function that takes an array of arrays with numbers. Return a new (single) array with the largest numbers of each.
//
//        Examples
//        findLargestNums([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]
//
//        findLargestNums([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]
//
//        findLargestNums([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]
//        Notes
//        Watch out for negative integers (numbers).


        double[][] arr = new double[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};
        double[] bucket = new double[arr.length];
        int bucketIndex = 0;
        for(double[] row : arr){
            Arrays.sort(row);
            bucket[bucketIndex]=row[row.length-1];
            bucketIndex++;
        }
        System.out.println(Arrays.toString(bucket));

        int num = 1;

//        Is the Number a Prime?
//                Create a method that returns true if a number is prime and false if it's not. A prime number is any positive integer that is evenly divisible by only two divisors: 1 and itself. The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
//
//        Examples
//        isPrime(7) ➞ true
//
//        isPrime(9) ➞ false
//
//        isPrime(10) ➞ false
//        Notes
//        1 is not a prime number.
//                If a number is odd it is not divisible by an even number.

//    *********** The Rule for 3: A number is divisible by 3 if the sum of the digits is divisible by 3. ***************

                if(num == 2 || num == 3){
                    System.out.println(true);
                }
                else if(num == 1){
                    System.out.println(false);
                }
                else if(num % 2 == 0){
                    System.out.println(false);
                }
                else if(num % 3 == 0){
                    System.out.println(false);
                }
                else{
                    System.out.println(true);
                }
            }


//    Shuffle the Name
//    Create a method that accepts a string (of a persons first and last name) and returns a string with the first and last name swapped.
//
//    Examples
//    nameShuffle("Donald Trump") ➞ "Trump Donald"
//
//    nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
//
//    nameShuffle("Seymour Butts") ➞ "Butts Seymour"
//    Notes
//    There will be exactly one space between the first and last name.
//    If you get stuck on a challenge, find help in the Resources tab.
//    If you're really stuck, unlock solutions in the Solutions tab.

    public static String nameShuffle(String s) {
        String[] ary = s.split(" ");
        String temp = ary[1];
        ary[1] = ary[0];
        ary[0] = temp;
        return String.join(" ", ary);
    }
}


