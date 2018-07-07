import java.util.*;
import java.lang.*;

//import static java.util.Arrays.sort;

public class Solution{
    private int i;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String t=sc.nextLine().trim();

           int  arr[]=new int[s.length()];
           int count[]=new int[s.length()];
            if(s.length()==t.length()){

        String s1 = s.toLowerCase();
        String s2=t.toLowerCase();
//        System.out.println(s1);
        String s11=s1.replace(" ","");
                System.out.println(s11);
        String s22=s2.replace(" ","");
                System.out.println(s22);


        for (int i=0;i<s11.length();i++) {
            arr[i] = s11.charAt(i);
        }
                Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//

        for (int j=0;j<s22.length();j++){
            count[j]=s22.charAt(j);
        }
                Arrays.sort(count);
                System.out.println(Arrays.toString(count));
//
        for(int k=0;k<arr.length;k++){

            if(arr[k]==count[k]){
                if(k==arr.length-1){
                    System.out.println("true");
                }
            }
            else{
                System.out.println("false");
                break;
            }
        }
    }
    else{
                System.out.println("false");
            }
    }
}
