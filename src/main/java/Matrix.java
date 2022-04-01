import java.util.ArrayList;

public class Matrix {
    public static int[] indexOfFirstNonZero(int[][] matrix){
        int[] result = new int[2];
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]!=0){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static ArrayList<Integer> getMinimumOfRows(int[][] matrix){
        ArrayList<Integer> minimumOfRows = new ArrayList<>();
        for (int i = 0; i<matrix.length; i++){
            int min = matrix[i][0];
            for (int j = 1; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            minimumOfRows.add(min);
        }
        return minimumOfRows;
    }
}
