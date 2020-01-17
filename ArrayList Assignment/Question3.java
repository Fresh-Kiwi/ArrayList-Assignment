import java.util.ArrayList;

class Question3 {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
        //should output [1,2,3,1]
    }

    public static void removeConsecutives(ArrayList<Integer> nums) {
        //This method removes consecutive duplicate values from the 
        //list nums.  Hint: loop backwards through the list
        int n = nums.get(nums.size() - 1) + 1;
        
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) == n) {
                nums.remove(i);
            }
            n = nums.get(i);
        }
    }
}