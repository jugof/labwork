public class MergeSort {
    
    public static void merger(int arr[], int start, int end, int mid) {
        int i = start;
        int j = mid + 1;
        int tempArr[] = new int[arr.length];
        int tempIndex = start;

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                tempArr[tempIndex] = arr[i];
                tempIndex++;
                i++;
            }
            else{
                tempArr[tempIndex] = arr[j];
                tempIndex++;
                j++;
            }
        }

        while(i <= mid){
            tempArr[tempIndex++] = arr[i++];
        }

        while(j <= end) {
            tempArr[tempIndex++] = arr[j++];
        }

        for(int k=start; k<=end; ++k){
            arr[k] = tempArr[k];
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        
        if(start < end) {

            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);

            mergeSort(arr, mid+1, end);

            merger(arr, start, end, mid);
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {55, 10, 28, 6, 69, 33};
        mergeSort(arr, 0, 5);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
