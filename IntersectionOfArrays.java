import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays {
    public static void intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> temp = new HashMap<>();

        for (int j : nums1) {
            if (temp.containsKey(j)){
                temp.put(j, temp.get(j)+1);
            }else {
                temp.put(j, 1);
            }
        }
        List<Integer> out = new ArrayList<>();
        for (int j=0; j<nums2.length; j++){
            if (temp.containsKey(nums2[j]) && temp.get(nums2[j])>0){
                out.add(nums2[j]);
                temp.put(nums2[j], temp.get(nums2[j])-1);
            }
        }

        System.out.println(out);

        int len = out.size();
//        if (len == -1) len = out.size();
        int[] intersect = new int[len];
        int k = 0;
        while (k< intersect.length){
            intersect[k] = out.get(k);
            k++;
        }


        //System.out.println(Arrays.toString(intersect));

    }
    public static void main(String[] args) {
        int[] nums1 = {8,0,3};
        int[] nums2 = {0,0};
        intersect(nums1, nums2);
    }
}
