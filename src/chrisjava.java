
import java.util.Scanner;

public class chrisjava {

    //    Pod2 Week3 Exercise1 for Chris

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }



    public static int returnOdds(int[] x) {
        int counter = 0;
        int y = x.length;
        for (int i = 0; i < y; i++)
            if (!(x[i] % 2 == 0))
                x[counter++] = x[i];
        for (int i=counter; i<y; i++)
            x[i] = 0;

        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] nums = {6, 7, 8, 9, 10};
        System.out.println("removeOdds() = " + returnOdds(nums));


        int [] test = {1, 2, 3, 4, 5};
        System.out.println("countEvens(test) = " + countEvens(test));

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = input.nextLine();
        String upperCaseLine = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());

//        System.out.println("Enter a number you would like to see cubed");
//        int userNumber = scanner.nextInt();
//
//        int i = userNumber;
//
//        int cubed = i * i * i;
//        System.out.printf("Your number cubed is: %d", cubed);




    }



}
