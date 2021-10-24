package Matrix;

import java.util.Scanner;

public class Search_2d_Matrx {

    public static boolean search(int[][]a, int n)
    {
        for (int i =0;i<a.length;i++)
        {
            if(n>=a[i][0]&& n<= a[i][a[0].length-1])
            {
                int lo = 0;
                int hi = a[0].length-1;
                int mid = (lo+(hi-lo))/2;
                while (lo<=hi)
                {
                    mid = (lo+(hi-lo))/2;
                    if (a[i][mid]==n)
                    return true;
                    else if (n>a[i][mid])
                    {
                        lo = mid+1;
                    }
                    else if (n>a[i][mid])
                    {
                        hi= mid-1;
                    }
                    
                    
                    
                }return false;
            }
        }return false;
    }















    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[][]= new int [4][3];
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<3;j++)
            a[i][j]= sc.nextInt();
        }
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<3;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }

        int n = sc.nextInt();
        boolean ab = search(a,n);
        if (ab == true)
        System.out.println("Found it");
        else 
        System.out.println("Not found");
        sc.close();
    }
    
}
