package arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, -5, 6, -7, 8};

        int[] result = rearrange(arr);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] rearrange(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        // Step 1: positive & negative separate
        for (int num : arr) {
            if (num >= 0) pos[p++] = num;
            else neg[q++] = num;
        }

        // Step 2: two pointers for merge
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            // alternate placement
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        // Step 3: remaining positives
        while (i < p) arr[k++] = pos[i++];

        // Step 4: remaining negatives
        while (j < q) arr[k++] = neg[j++];

        return arr;
    }
}

