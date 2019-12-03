import java.util.Arrays;

public class PairedExercises {

    private String[] ary = tester.split(" ");
    private int[] ary2 = new int[ary.length];
        for(int i = 0; i < ary.length ; i++){
        ary2[i] = Integer.parseInt(ary[i]);

        Arrays.sort(ary2);
        System.out.println(ary2[ary2.length - 1] + " " + ary2[0]);
    }
}
