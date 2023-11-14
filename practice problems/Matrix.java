import java.util.*;
public class Matrix{
    public static void main(String[] args){
        int[][] arr ={{1,2,3},{4,5,6}};
        // 1 2 3
        // 1 2 3
        //1 1
        //2 1
        //0 0
        //System.out.println(Arrays.deepToString(arr));
        //int [][] new_arr=Transpose(arr);
        //System.out.println(Arrays.deepToString(new_arr));
        System.out.println(isSymmetric(arr))3;
        

    }
    public static int [][] Transpose(int[][] inp){

        int rows=inp.length;
        int columns=inp[0].length;
        int new_arr[][]=new int[columns][rows];
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                new_arr[i][j]=inp[j][i];
                //i=3,j=2
                System.out.println(inp[j][i]);
            }
        }
        return new_arr;


    }
    public static boolean isSymmetric(int[][] inp){
        boolean check =false;
        int[][] check_arr=Transpose(inp);
        int inp_rows=inp.length;
        int inp_columns=inp[0].length;
        int row=check_arr.length;
        int col=check_arr[0].length;
        if((inp_rows==row) && (inp_columns==col)){
            return true;
        }
        return false;
    }
}