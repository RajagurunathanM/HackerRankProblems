import java.util.*;

 class JumpClouds {

    static int jumpingOnClouds(int[] c) {
		
		int count=0,jump=0,i=0;
		
		if(c.length==2)
		{
			count=1;
		}
		else
		{
			
		while(i<c.length-1)
		{
			
			if(i+2<c.length && c[i+2]==0 )
			{
				count++;
				jump = 2;
			}
			else
			{
				count++;
				jump = 1;
			}
			
			i=i+jump;
		}
		
		}
		
		
		return count;
			
    }

   

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] c = new int[n];


        for (int i = 0; i < n; i++) {
            
            c[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(c);

		System.out.println(result);
    }
}
