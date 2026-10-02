//hello! let see 02/10/2026
class Solution {
    public int trap(int[] height) {
        int n=height.length;

    return(Trapping(height));
    }

    public static int Trapping(int[] arr)
    {
        int m =arr.length;
        int [] left=new int[m];
        left[0]=arr[0];
        for(int i=1;i<m;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int[] right=new int[m];
        right[right.length-1]=arr[arr.length-1];
        for(int i=right.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<m;i++)
        {
            sum=sum+(Math.min(left[i],right[i])-arr[i]);
        }
        return sum;
    }
}