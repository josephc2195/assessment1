public class SummativeSums {
    public static void main(String[] args)  {
        int[] nums1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] nums2 = {999, -60, -77, 14, 160, 301};
        int[] nums3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Array number 1 sum: " + adding(nums1));
        System.out.println("Array number 2 sum: " + adding(nums2));
        System.out.println("Array number 3 sum: " + adding(nums3));
    }

    public static int adding(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}