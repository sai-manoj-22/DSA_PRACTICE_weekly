public class merge_sorted_array_method2 {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        
        while (j >= 0) {
            
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
        
    }

    
    public static void main(String[] args) {
        int[] arr1={2,4,5,6,0,0,0};
        int[] arr2={2,4,5};
        int[] result=merge(arr1, 4, arr2, 3);

        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
       


    }
}
