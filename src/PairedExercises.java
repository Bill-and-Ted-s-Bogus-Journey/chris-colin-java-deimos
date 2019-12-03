import java.util.Arrays;

public class PairedExercises {
    public static void main(String[] args) {

    String tester = new String("1 2 3 4 5 6 7 10 -1");

    String[] ary = tester.split(" ");
    int[] ary2 = new int[ary.length];
    for(int i = 0; i < ary.length ; i++){
        ary2[i] = Integer.parseInt(ary[i]);

        Arrays.sort(ary2);
        System.out.println(ary2[ary2.length - 1] + " " + ary2[0]);
    }
    }
}
