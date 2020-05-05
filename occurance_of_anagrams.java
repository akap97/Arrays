import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean iszero(int[] arr)
    {
        for(int i:arr)
            if(i!=0)
                return false;
        return true;
    }
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int testcases=sc.nextInt();
	 for(int test=0;test<testcases;test++)
	  {
        //code here	 
        String s=sc.next();
        String c=sc.next();
        int f[]=new int[256];
        int count=0;
        for(int i=0;i<c.length();i++)
            f[(int)s.charAt(i)]--;
        for(int i=0;i<c.length();i++)
            f[(int)c.charAt(i)]++;
        if(iszero(f))
            count++;
        for(int i=c.length();i<s.length();i++)
        {
        f[(int)s.charAt(i)]--;
        f[(int)s.charAt(i-c.length())]++;
        if(iszero(f))
            count++;
        }
        System.out.println(count);
	  }
	 }
}
