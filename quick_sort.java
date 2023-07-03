public class quick_sort {
    // Hàm nhận phần tử cuối cùng làm chốt, đặt các phần tử nhỏ hơn chốt ở trước và lớn hơn ở sau nó
    int partition(int arr[], int low, int high) {
        System.out.println("low="+low+" - high="+high);
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println("j="+j+" - i="+i);
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        System.out.printf("_swap arr[%d]=%d vs arr[%d]=%d\n", i+1, arr[i+1], high, arr[high]);

        return i + 1;
    }

    // arr[] --> Mảng cần được sắp xếp,
    // low --> chỉ mục bắt đầu,
    // high --> chỉ mục kết thúc
    void sort(int arr[], int low, int high) {
        if (low < high) {
            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(arr, low, high);
            System.out.println("Mảng sau partition:");
            printArray(arr);
            System.out.println();
            // Sắp xếp đệ quy các phần tử trước phân vùng và sau phân vùng
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 54, 1, 14, 48, 52, 5, 6, 2 };
        int n = arr.length;

        System.out.println("Số phần tử trong mảng: " + n);
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quick_sort ob = new quick_sort();
        ob.sort(arr, 0, n - 1);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr);
    }
}
