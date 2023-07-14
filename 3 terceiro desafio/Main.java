import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        int count = countPairsWithDifference(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifference(int[] arr, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int target1 = num - k;
            int target2 = num + k;

            if (frequencyMap.containsKey(target1)) {
                count += frequencyMap.get(target1);
            }

            if (frequencyMap.containsKey(target2) && target1 != target2) {
                count += frequencyMap.get(target2);
            }

            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        return count;
    }
}
