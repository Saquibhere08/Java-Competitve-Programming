public class unsorted {

    // Linear search method
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1; // element not found
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int x = 30;

        int result = search(arr, arr.length, x);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
