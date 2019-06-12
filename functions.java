package sap;
import java.util.Arrays;

public class functions
{
    /*Consider x and y as describing the coordinates of the starting point of this method,
    and j the number of steps it has left*/
    public static long recursiveWalk(int x, int y, int j, int n, Integer twoDimArr[][], long result)
    {
        if (j == 0)
        {
            result++;
        } else
        {
            if (twoDimArr[x + 1][y] == 0)
            {
                twoDimArr[x + 1][y] = 1;
                result = recursiveWalk(x + 1, y, j - 1, n, twoDimArr, result);
            }
            if (twoDimArr[x - 1][y] == 0)
            {
                twoDimArr[x - 1][y] = 1;
                result = recursiveWalk(x - 1, y, j - 1, n, twoDimArr, result);
            }
            if (twoDimArr[x][y + 1] == 0)
            {
                twoDimArr[x][y + 1] = 1;
                result = recursiveWalk(x, y + 1, j - 1, n, twoDimArr, result);
            }
            if (twoDimArr[x][y - 1] == 0)
            {
                twoDimArr[x][y - 1] = 1;
                result = recursiveWalk(x, y - 1, j - 1, n, twoDimArr, result);
            }
        }
        twoDimArr[x][y] = 0;
        return result;
    }

    public static long lenghtOfSelvAvoidingPath(Integer n){
        long  total=0;
        Integer Lattice[][] = new Integer[2*n+1][2*n];
        for (Integer[] row: Lattice) {
            Arrays.fill(row, 0);
        }
        Lattice[n-1][n-1] = 1;
        for (int h = 0; h< n-1; h++){
            Lattice[n][n+h] = 1;
            Lattice[n+1][n+h] = 1;
            total = recursiveWalk(n+1, n+h, n-h-1,n, Lattice, total);
        }
        return 8* total+ 4 ;
    }
}
