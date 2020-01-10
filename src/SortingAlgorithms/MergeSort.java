package SortingAlgorithms;

class MergeSort
{
    // Merges two sub arrays of arr[].
    // First sub array is arr[l..mid]
    // Second sub array is arr[mid+1..r]
    void merge(int arr[], int start, int mid, int end)
    {
        // Find sizes of two sub arrays to be merged
        int l = mid - start + 1;
        int r = end - mid;

        // Create temp arrays
        int leftArray[] = new int [l];
        int rightArray[] = new int [r];

        //Copy data to temp arrays
        for (int i=0; i<l; ++i)
            leftArray[i] = arr[start + i];

        for (int j=0; j<r; ++j)
            rightArray[j] = arr[mid + 1+ j];


        // Merge the temp arrays

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array
        int k = start;
        while (i < l && j < r)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < l)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < r)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int start, int end)
    {
        if (start < end)
        {
            // Find the middle point
            int m = (start+end)/2;

            // Sort first and second halves
            sort(arr, start, m);
            sort(arr , m+1, end);

            // Merge the sorted halves
            merge(arr, start, m, end);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}

