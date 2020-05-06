import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                if(arr[i] < arr[j])
                {
                    int current = arr[j];

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    for(int k=0;k<n;k++)
                    {
                        if(k == j)
                        {
                            System.out.print(current+" ");
                        }
                        else
                        {
                            System.out.print(arr[k]+" ");
                        }
                        
                    }
                    System.out.println();

                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }

    
    public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
        
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
		
        insertionSort1(n, a);

    }
}
