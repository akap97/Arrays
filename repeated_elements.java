class GfG {
    public static void printDuplicates(int arr[], int n) {
        // add code here.
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
          int index=arr[i]%n;
           arr[index]+=n;
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]>=2*n)
            {
                System.out.print(i+" ");
                flag=true;
            }
        }
            if(!flag)
                System.out.print("-1");
        }
    }
