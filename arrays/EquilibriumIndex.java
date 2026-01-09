package arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6};

        int index = findEquilibriumIndex(arr);

        if (index != -1) {
            System.out.println("Equilibrium Index: " + index);
        } else {
            System.out.println("No Equilibrium Index found");
        }
    }

    static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;

        // Step 1: find total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: traverse array and compare
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // equilibrium found
            }

            leftSum += arr[i];
        }

        return -1; // no equilibrium index
    }
}

