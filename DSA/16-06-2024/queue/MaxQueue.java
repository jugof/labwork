package queue;

public class MaxQueue {
    
    public static int[] maxqueue(int arr[], int k) {
        int n = arr.length;
        int window[]= new int[n];

        for(int i=0; i<n; ++i){
            for(int j=i; j<=k; ++j){
                if(j<n){
                    window[i] = Math.max(window[i], arr[j]);
                }
            }
        }
        return window;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 1, 3, 5, 7, 1, 9, 2, 4, 10, 5,11, 90, 25};
        int k = 4;
        
        int ans[] = maxqueue(arr, k);

        for(int i=0; i<ans.length; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
