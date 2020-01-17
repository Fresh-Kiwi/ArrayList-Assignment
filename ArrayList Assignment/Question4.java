import java.util.ArrayList;

class Question4 {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list before: " + list1);
        filter(list1,list2);
        System.out.println("The list after:  " + list1);
        //the list after should be [1,3]
    }
    
    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //This method removes all the elements in list1 that also appear in list2
        for (int l1 = 0; l1 < list1.size(); l1++) {
            for (int l2 = 0; l2 < list2.size(); l2++) {
                if (list2.contains(list1.get(l1))) {
                    list1.remove(list2.get(l2));
                }
            }
        }
    }
}
