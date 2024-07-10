import java.util.Arrays;

class TwoSum{
    public static void main(String[] args){
        int[] nums={5,1,9,4,3}; // test array
        int target=7;  // test target
        
        System.out.println(Arrays.toString(twoSum(nums,target)));   
    }
//static means variable will have same location in memory
//means no object is created
    public static int[] twoSum(int[] nums, int target) {
        // logic
        // pair
        int i,j;
        // int firstNo=0,secondNo=0;
        int[] pair = new int[2];
        for(i=0;i<=nums.length-1;i++){

            for(j=0;j<nums.length;j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        // found the pair
                       pair[0]=j;
                       pair[1]=i;
                    }
                }

            }
        }
        return pair;   
        
    }
}