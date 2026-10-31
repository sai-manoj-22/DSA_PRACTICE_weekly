
public class kadane {

    public static void kadane(int[] numbers){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            curr_sum+=numbers[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            if(max_sum<curr_sum){
                max_sum=curr_sum;
            }
    

        }
        System.out.println("The Max sum of the sub array is : "+ max_sum) ;


    }
    public static void main(String[] args) {
        int numbers []= {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}
