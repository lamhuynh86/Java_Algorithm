public class heap_sort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Xây dựng Heap (sắp xếp lại mảng)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Trích xuất từng phần tử từ Heap
        for (int i = n - 1; i > 0; i--) {
            // Di chuyển root hiện tại đến end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // gọi max - heapify trên Heap đã sắp xếp
            heapify(arr, i, 0);
        }
    }

    // Để vun đống một cây con bắt nguồn từ nút i là
    // một chỉ mục trong arr[]. n là kích thước của Heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Khởi tạo largest như root
        int l = 2 * i; // left = 2*i
        int r = 2 * i + 1; // right = 2*i + 1

        // Nếu nút con bên trái lớn hơn nút con của gốc
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Nếu nút con bên phải lớn hơn largest
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Nếu largest không phải là root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Vun đống lại các cây con bị ảnh hưởng
            heapify(arr, n, largest);
        }
    }

    // In mảng kích thước n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 4, 10, 3, 5, 1 };
        // int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        heap_sort ob = new heap_sort();
        ob.sort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
