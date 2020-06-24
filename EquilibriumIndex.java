class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                //add code here.
                int sum=0,lsum=0;
                for(int i=0;i<n;i++)
                    sum+=arr[i];
                for(int i=0;i<n;i++)
                    {
                        lsum+=arr[i];
                        if(lsum==sum)
                            return i;
                        sum-=arr[i];
                    }
                
                return -1;
              }
}
