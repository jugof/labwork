import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int target, int n) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = arr.length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the key to be search:");
        int key = in.nextInt();
        
        int ans = binarySearch(arr, key, n);

        System.out.println("Given key is present at index: "+ ans);
    }
}
