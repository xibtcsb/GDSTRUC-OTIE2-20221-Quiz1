class BubbleSort {
    void bubbleSort(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    // print array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int array[] = {25, 3, 5, 10, 38, 9, 20, 9, 173, 65};
        ob.bubbleSort(array);
        System.out.println("Sorted array in Descending Order");
        ob.printArray(array);
    }

}