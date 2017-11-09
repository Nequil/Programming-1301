import java.util.*;
public class Matrix {
  public static void main(String[] args) {
    int [][] mat = new int[3][2];
    mat[0][0] = 1;
    mat[0][1] = 2;
    mat[1][0] = 3;
    mat[1][1] = 4;
    mat[2][0] = 5;
    mat[2][1] = 6;


    for(int r = 0; r < mat.length; r++){
      for (int c = 0; c < mat[0].length; c++ )
          System.out.print(mat[r][c] + " ");
        System.out.println();
    }
  }
}
