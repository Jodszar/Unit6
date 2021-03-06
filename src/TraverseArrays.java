public class TraverseArrays {

    public static int countEven(int[] nums){
        int count=0;
        for(int x= 0; x<nums.length; x++) {
            if (nums[x] % 2 == 0)
                count++;
        }
        return count;

    }
    public static int[] buildArray(int desiredLength){
        int[] finalarray= new int[desiredLength];
        for( int i=0; i<desiredLength; i++)
            finalarray[i]=i;
        return finalarray;
    }
    public static boolean sum28(int[] numbers){
        int sum = 0;
        boolean is8 = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2)
                sum += 2;
        }
        if (sum == 8)
            is8 = true;
        return is8;
    }
    public static int[] zeroMax(int[] original){
        int max = 0;

        for (int i = original.length-1; i >= 0; i--) {
            if (original[i] % 2 != 0)
                max = Math.max(max, original[i]);
            if (original[i] == 0)
                original[i] = max;
        }
        return original;
    }




    public static void main(String[] args) {
        System.out.println(countEven(new int[] { 2, 1, 2, 3, 4}));
        System.out.println(buildArray(4));
        System.out.println(sum28( new int[]{ 2, 3, 2, 2, 4, 2}));
        System.out.println(zeroMax(new int[]{ 0, 5, 0, 3}));

    }

}
