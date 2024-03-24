public class Main_W2 {
    public static void main(String[] args){
        int[][] twoArray = { {1,2,3,4}, {5,6,7,8} };

        /*int max = max2DArray(twoArray);
        System.out.println("Max: "+ max);*/

        /*int sum = sum2DArray(twoArray);
        System.out.println("Sum: " + sum);*/
    }



    /* 2.Finding max value of 2dArray.
    public static int max2DArray(int[][] twoArray){
        int max = twoArray[0][0];
        for (int i=0; i<twoArray.length; i++){
            for (int j=0; j<twoArray[i].length; j++){
                if (twoArray[i][j] > max){
                    max = twoArray[i][j];
                }
            }
        }
        return max;
    }*/

    /* 1.SUM of 2dArray.
    public static int sum2DArray(int[][] twoArray){
        int totalSum = 0;
        for (int i=0; i<twoArray.length; i++){
            for (int j=0; j<twoArray[i].length; j++){
                totalSum += twoArray[i][j];
            }
        }
        return totalSum;
    }*/

}
