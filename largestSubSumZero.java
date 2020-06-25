class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> h=new HashMap<>();
        int max_len=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
                max_len=i+1;
            Integer index=h.get(sum);
            if(index==null)
                h.put(sum,i);
            else
                max_len=Math.max(max_len,i-index);
        }
        return max_len;
    }
}
