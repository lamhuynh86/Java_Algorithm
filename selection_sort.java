public class selection_sort {
    static void selectionSort(int arr[], int n) {
        int i, j, min_index;
        for (i = 0; i < n - 1; i++) {
            min_index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    System.out.printf("__Hoán đổi ở bước: %d-%d -----> Giá trị hoán đổi: %2d <==> %2d \n", i, j, arr[min_index], arr[i]);
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 2, 8, 10, 85, 15 };
        int n = arr.length;
        System.out.println("Số phần tử trong mảng: " + n);
        System.out.println("Mảng ban đầu:");
        printArray(arr, n);
        selectionSort(arr, n);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr, n);
    }
}
