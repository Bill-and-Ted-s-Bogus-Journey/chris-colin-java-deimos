public class ChrisWeek2 {
    public static void main(String[] args) {



    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public String capital(String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public  String reverseString(String string) {
        String string1 = "Welcome to Beginnersbook";
        String reversed = reverseString(string1);
        return "The reversed string is: " + reversed;
    }



}
