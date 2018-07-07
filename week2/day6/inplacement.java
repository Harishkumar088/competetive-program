import java.util.Arrays;
import java.util.Random;

public class Solution {

    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }

    public static void shuffle(int[] theArray) {

        // shuffle the input in place
        for(int i=0;i<theArray.length;i++){
            int secondIndex=getRandom(0,theArray.length-1);
            
            if(secondIndex!=i){
                int temp=theArray[i];
                theArray[i]=theArray[secondIndex];
                theArray[secondIndex]=temp;
            }
        }
        

    }

    public static void main(String[] args) {
        final int[] initial = {8,3,9,8,4,5,2};
        final int[] shuffled = Arrays.copyOf(initial, initial.length);
        shuffle(shuffled);
        System.out.printf("initial array: %s\n", Arrays.toString(initial));
        System.out.printf("shuffled array: %s\n", Arrays.toString(shuffled));
    }
}
