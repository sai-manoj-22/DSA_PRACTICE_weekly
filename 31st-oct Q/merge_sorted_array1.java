import java.util.Arrays;


public class merge_sorted_array1 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0, j=m; i<n;i++){
            nums1[j]=nums2[i];
            j++;
                   
        }
        Arrays.sort(nums1);

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        
        
        

        
    }

    public static void main(String[] args) {
        int m=4;
        int n=3;
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};
        merge(nums1,m,nums2,n);

    }

}

