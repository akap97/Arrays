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
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int k=s.nextInt();
        int res=0,curr=0;
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
                curr++;
            else if(arr[i]==k)
            {
                flag=true;
                curr++;
            }
            else if(arr[i]>k)
            {
                if(flag)
                    {
                        flag=false;
                        res+=curr;
                        curr=0;
                    }
                else {
                    curr=0;
                }
            }
        }
        if(curr!=0 && flag==true)
            res+=curr;
        System.out.println(res);
	  }
	 }
}
