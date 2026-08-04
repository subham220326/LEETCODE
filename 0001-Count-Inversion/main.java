class Solution {
    public long numberOfInversions(int[] nums) {
     return mergeSort(nums,0,nums.length-1);
    }
     public int mergeSort(int[] arr, int left, int right) {
        int cout=0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            cout+=mergeSort(arr, left, mid);
            cout+=mergeSort(arr, mid + 1, right);
            cout+=merge(arr, left, mid, right);
        }
        return cout;
    }

      public int merge(int[] arr, int left, int mid, int right) {
        int cout=0;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else 
            {
                arr[k++] = R[j++];
                cout+=mid-left+1-i;
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
        return cout;
    }
}
