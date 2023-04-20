import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        int q=sc.nextInt();


        for(int i=0; i<q; i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();

            int ans=(int)(a+Math.pow(2,0)*b);
            System.out.printf(ans+" ");
            for( int j=1; j<n; j++){
                 ans+=(int)(Math.pow(2,j)*b);
                System.out.printf(ans+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
