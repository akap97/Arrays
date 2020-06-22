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
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int res=bins(arr,n);
        if(res==-1)
            System.out.println(arr[n-1]);
        else System.out.println(arr[res]);
       
	  }
	 }
	 public static int bins(int arr[],int n)
	 {
	     int l=0,h=n-1;
	     while(l<=h)
	     {
	         int mid=l+(h-l)/2;
	         if(mid==n-1)
	            return -1;
	         if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid] )
	            return mid;
	         else if(arr[mid]<arr[mid+1])
	            l=mid+1;
	        else h=mid-1;
	     }
	     return -1;
	 }
}
