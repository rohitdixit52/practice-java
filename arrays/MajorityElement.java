package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int majority = findMajority(arr);
        System.out.println("Majority Element: " + majority);
    }

    static int findMajority(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate using Boyer-Moore Voting Algorithm
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify candidate actice)
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // no majority element
    }
}
