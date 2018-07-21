import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    public int count(String rem){

        int count=0;
//        System.out.println(rem+" in count  "+count);
        for (int i=0;i<rem.length();i++){
            if(rem.charAt(i)=='1')
            count++;
        }
//        System.out.println("count "+count);
        return count;
    }
    public  int array(int n){
        String rem="";
        int k=0;
        int array[]=new int[n];
        while(n>0){
            rem=rem+n%2;
            n=n/2;
        }

//        System.out.println(rem+"HHHHHHHHH");


        return count(rem);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=15;

        int arr[]=new int[num+1];
        Solution sol=new Solution();
        for (int i=0;i<=num;i++){
         arr[i]=sol.array(i);
        }
        System.out.println(Arrays.toString(arr));

        }
    }

