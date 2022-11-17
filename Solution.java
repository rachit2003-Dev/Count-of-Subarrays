class Solution{

    long countSubarray(int arr[], int n, int k) {
        long count=0L;
        int rec=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k){
                count++;
                int L=i-(rec+1);
                int R=n-1-i;
                count+=L+R;
                count+=L*R;
                rec=i;
            }
        }
        return count;
        // code here
    }
}