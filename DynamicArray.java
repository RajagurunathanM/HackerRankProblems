import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DynamicArray {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> calculate(int n, List<List<Integer>> q) {

        ArrayList<Integer> s1 = new ArrayList<Integer>();    
        ArrayList<Integer> s2 = new ArrayList<Integer>();    

        ArrayList<Integer> result = new ArrayList<Integer>();

        int lastAnswer = 0;

        for(int i=0;i<q.size();i++)
        {
            int type = q.get(i).get(0);
            int x = q.get(i).get(1);
            int y = q.get(i).get(2);

            if(type == 1)
            {
                int cal = ( (x^lastAnswer)%n );

                if(cal == 0)
                {
                    s1.add(y);
                }
                if(cal == 1)
                {
                    s2.add(y);
                }
            }
            else
            {
                if(type == 2)
                {
                    int cal = ( (x^lastAnswer)%n );

                    if(cal == 0)
                    {
                        lastAnswer = s1.get(y % s1.size());
                    }
                    if(cal == 1)
                    {
                        lastAnswer = s2.get(y % s2.size());
                    }

                    if( !( result.contains(lastAnswer)) )
                    {
                        result.add(lastAnswer);
                    }

                }

            }

        }


        return result;

    }

    public static void main(String[] args)  
	{
        Scanner x = new Scanner(System.in);
		
        int n = x.nextInt();

        int q = x.nextInt();

        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<l.size();i++)
		{
			l.get(i) = x.nextInt();
			l.get(i).get(1) = x.nextInt();
			l.get(i).get(2) = x.nextInt();
		}
		

        //List<Integer> result = calulate(n, queries);


		System.out.println(l);

    }
}
