import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularRotate {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int d, int[] queries) {

			
        int start=0,end=a.length-1;

        while(start<end)
        {
            int temp=a[start];
            a[start] = a[end];
            a[end] = temp;
            
            start=start+1;
            end=end-1;
        }

        start=0;
        end=d-1;
        
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            start=start+1;
            end=end-1;
        }
        
        start=d;
        end=a.length-1;
        
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            start=start+1;
            end=end-1;
        }
        
        int[] b = new int[queries.length];

        for(int i=0;i<b.length;i++)
        {
            b[i] = a[queries[i]]; 
        }


        return b;
		

    }

     

    public static void main(String[] args){
		
		Scanner x = new Scanner(System.in);
		
        int n = x.nextInt();

        int k = x.nextInt();

        int q = x.nextInt();

        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            
            a[i] = x.nextInt();
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            
            queries[i] = x.nextInt();
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            
			System.out.println(result[i]);
        }

        
    }
}
