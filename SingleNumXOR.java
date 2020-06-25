import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int testcases=s.nextInt();
	 for(int test=0;test<testcases;test++)
	  {
        //code here	 
        int n=s.nextInt();
        int[] arr=new int[n];
        int res=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            res=res^arr[i];
        }
        System.out.println(res);
	  }
	 }
}
