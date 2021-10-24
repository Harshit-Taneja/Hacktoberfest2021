package Matrix;

import java.util.Scanner;

public class Kth_smallest_element_in_a_matrix {

    public static void smallest (int a[][], int k)
    {
        int low = a[0][0];
        int high = a [a.length-1][a.length-1];
        int mid =0;
        
        while(low <= high)
        {
            int ans=0;
            mid = low + (high-low)/2;
            for (int i =0;i<a.length;i++)
            {
                int l =0;
                int h = a.length-1;
                int m=0;
                while (l<=h)
                {
                    m = l+(h-l)/2;
                    if(a[i][m]<=mid) l= m+1;
                    else h=m-1;
                }
                ans = ans + l;
            }
            if (ans <= k)
            low = mid+1;
            else 
            high = mid-1;

        }
        System.out.println(low);
    }

















    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[][]= new int [4][4];
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            a[i][j]= sc.nextInt();
        }
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("Enter K :- ");
        int k = sc.nextInt();
        smallest(a, k);
        sc.close();
    }
    
}
