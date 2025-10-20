public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56};

        int max = numbers[0]; // assume first element is max

        // use for-each loop to find max
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}
