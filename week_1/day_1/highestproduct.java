import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;
public class Solution {

    public static int highestProductOf3(int[] arr) {

        int p1=0;
		int p2=0;
	
		int l=arr.length;
		Arrays.sort(arr);
		p1=arr[0]*arr[1]*arr[l-1];
		p2=arr[l-1]*arr[l-2]*arr[l-3];
		if(p1>p2){
			return p1;
		}
		else{
			return p2;
		}


        
    }


  @Test
    public void shortArrayTest() {
        final int actual = highestProductOf3(new int[] {1, 2, 3, 4});
        final int expected = 24;
        assertEquals(expected, actual);
    }
