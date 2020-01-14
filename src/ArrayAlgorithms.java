public class ArrayAlgorithms {
    public static String printArray(int[] nums){
        String output= "";
        for (int x: nums){
            output+= x+" ";
        }
        return output;
    }
    public static boolean checkForAllNegatives(int[] list){
        for(int x: list){
            if(x>=0)
            return false;
        }
        return true;
    }
    public static boolean hasDupes(int[] list){
        for ( int x= 0;x< list.length; x++){
            for (int i=list.length-1; i>x; i--){
                if (list[x] == list[i])
                    return true;
                }
            }
        return false;
    }
    public static int countEvens(int[] arr){
        int count= 0;
        for(int x:arr){
            if(x%2==0)
                count ++;
        }
        return count;
    }
    public static int[] leftShift(int[] nums, int shift){
        int[] output = new int[nums.length+ shift];
        for(int x= 0; x< nums.length; x++){
            output[x]= nums[x];
        }
        for(int xx=nums.length; xx<nums.length+shift; xx++){
            output[xx]=0;
        }
        return output;
    }
    public static String reverseArray(int[] list){
        int temp=0;
        String output= "";
        for (int x=0; x< list.length/2; x++){
            temp= list[x];
            list[x]= list[list.length-1-x];
            list[list.length-1-x]= temp;
        }
        for(int xx=0; xx<list.length; xx++){
            output+=list[xx]+" ";
        }
        return output;
    }





    public static void main(String[] args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));

        int[] list2 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(checkForAllNegatives(list2));
        int[] list3 = {-2, -9, -6, -8, -9, -3, 0};
        System.out.println(checkForAllNegatives(list3));

        int[] list4 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        System.out.println(hasDupes(list4));
        int[] list5 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        System.out.println(hasDupes(list5));

        int[] list6 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        System.out.println(countEvens(list6));
        int[] list7 = {12, 3, 72, 16, 47, 46, 92, 12, 18, 36, 76, 51, 99, 101, 42, 42};
        System.out.println(countEvens(list7));













    }
}
