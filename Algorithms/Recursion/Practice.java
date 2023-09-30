

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int result = recursiveRange(10);
        System.out.println(result);
    }

    public static int productOfMatrix(int[] arr, int n){
        if(n<=0) return  1;
        return (productOfMatrix(arr, n-1) * arr[n-1]);
    }

    public static int recursiveRange(int num){
        if(num<0) return -1;
        if(num == 0) return 0;
        return num + recursiveRange(num-1);
    }
}
