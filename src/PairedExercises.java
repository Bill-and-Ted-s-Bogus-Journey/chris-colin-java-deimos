import java.util.Arrays;

public class PairedExercises {
    public static void main(String[] args) {

        String tester = new String("1 2 3 4 5 6 7 10 -1");

        String[] ary = tester.split(" ");
        int[] ary2 = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            ary2[i] = Integer.parseInt(ary[i]);

            Arrays.sort(ary2);
            System.out.println(ary2[ary2.length - 1] + " " + ary2[0]);
        }

        int[] numsTest = {1, 2, 4, 5, 6, 7, 9, 9, 9, 9};
        System.out.println(tripleUp(numsTest));
    }

//   Array-2 > tripleUp
//prev  |  next  |  chance
//Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
//
//
//tripleUp([1, 4, 5, 6, 2]) → true
//tripleUp([1, 2, 3]) → true
//tripleUp([1, 2, 4]) → false

    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] + 2 == nums[i + 1] + 1 && nums[i] + 2 == nums[i + 2] && nums[i + 1] + 1 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }

//Logic-2 > blackjack
//prev  |  next  |  chance
//Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//
//blackjack(19, 21) → 21
//blackjack(21, 19) → 21
//blackjack(19, 22) → 19

    public int blackjack(int a, int b) {
        if(a > 21 && b > 21){
            return 0;
        }else if(a == 21 || b == 21){
            return 21;
        }else if(a > b && a < 21){
            return a;
        }else if(b > a && b < 21){
            return b;
        }else if(b > 21){
            return a;
        }else{
            return b;
        }
    }


}
