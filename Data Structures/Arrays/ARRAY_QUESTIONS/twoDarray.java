import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] newArray = new int[3][10];

        for(int i = 0; i < newArray.length; i++){
            var innerArray = newArray[i];
            for(int j = 0; j< innerArray.length; j++){
                newArray[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(newArray));
        for(var row : newArray){
            for(var num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
