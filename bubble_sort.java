public class bubble_sort {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] và arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    // System.out.println("Hoán đổi ở bước: " + i + "-" + j + "-----> Giá trị hoán đổi: " + arr[j + 1] + " <==> " +  arr[j]);
                    System.out.printf("__Hoán đổi ở bước: %d-%d -----> Giá trị hoán đổi: %2d <==> %2d \n", i, j, arr[j + 1], arr[j]);
                }
            }

            // Nếu không có phần tử nào để hoán đổi bên trong một vòng lặp i thì hoàn thành
            if (swapped == false)
                break;
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
        bubbleSort(arr, n);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr, n);
    }
}