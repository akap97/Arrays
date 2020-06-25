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
        int m=s.nextInt();
        int n=s.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        int sumA=0, sumB=0;
        boolean flag=false;
        for(int i=0;i<m;i++)
        {
            a[i]=s.nextInt();
            sumA+=a[i];
        }
        for(int i=0;i<n;i++) {
            b[i]=s.nextInt();
            sumB+=b[i];
        }
        HashSet<Integer> h=new HashSet<>();
        int small=n<m?n:m;
        for(int i=0;i<small;i++)
        {
            if(small==m)
                h.add(a[i]);
            else
                h.add(b[i]);
        }
        int diff=(Math.abs(sumA-sumB)/2);
        for(int i=0;i<n;i++)
        {
            if(small==m)
            {
            if(h.contains(b[i]+diff))
                {
                    flag=true;
                    System.out.println(1);
                    break;
                }
            }
            else {
                
                if(h.contains(a[i]+diff))
                {
                    flag=true;
                    System.out.println(1);
                    break;
                }
            }
        }
        if(!flag)
            System.out.println(-1);
        }
	  }
	}
