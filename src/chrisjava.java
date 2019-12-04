import java.util.Scanner;

public class chrisjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number you would like to see cubed");
        int userNumber = scanner.nextInt();

        int i = userNumber;

        int cubed = i * i * i;
        System.out.printf("Your number cubed is: %d", cubed);


    }

//    Pod2 Week3 Exercise1 for Chris

    public int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
