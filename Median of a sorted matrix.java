package Matrix;

import java.util.Scanner;

public class Median_of_sorted_matrix {

    public static void median (int[][]a)
    {
        int low = a[0][0];                                  // Take the constraints 
        int high = a[a.length-1][a[0].length-1];            // solution is for row wise coln wise sorted matrix
        int mid = low + (high-low)/2;                       // if the matrix is only row sorted then take low and high as the 
        while (low <= high)                                 // constraints of data type of matrix such as for int 
        {                                                   // Intger.MAX_VALUE and Integer.MIN_VALUE
            int ans=0;
            mid = low + (high-low)/2;
            for (int i=0;i< a.length;i++)
            {

                int l = 0;
                int h = a[0].length-1;
                while(l<=h)
                {
                    int m = l+ (h-l)/2;
                    if(a[i][m]<= mid) l= m+1;
                    else h=m-1;
                }
                ans = ans + l;
            }
            if (ans <= (a.length*a[0].length)/2)
                low= mid+1;
            else high = mid-1;

        }
        System.out.println(low);
    }












    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[][]= new int [3][3];
        for (int i =0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            a[i][j]= sc.nextInt();
        }
        for (int i =0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        median(a);
        sc.close();
    }
}
