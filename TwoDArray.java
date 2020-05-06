import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] a) {
		int sum=0;
		int result=-100;
		
		for(int k=0;k<4;k++)
		{
			
			for(int l=0;l<4;l++)
			{
			
			sum=0;
			for(int i=0+k;i<3+k;i++)
			{
				for(int j=0+l;j<3+l;j++)
				{
					sum=sum+a[i][j];
				}
				
				
			}
			
	
			sum = sum - a[k+1][l]-a[k+1][l+2];
			 
			
			
			if(sum>=result)
			{
				result=sum;
			}
			
			System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		System.out.println(result);
				
	return result;
    }

    

    public static void main(String[] args)  
	{
		
		Scanner scanner = new Scanner(System.in);
       
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++)
		{
            for (int j = 0; j < 6; j++) 
			{
                a[i][j]=scanner.nextInt();
            }
        }

        int result = hourglassSum(a);

        System.out.println(result);
        
    }
}


// || (i==j &&  ((i+j)/2 == a.length/2)