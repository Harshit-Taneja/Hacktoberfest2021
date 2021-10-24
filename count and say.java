package String;

import java.util.Scanner;

public class Count_and_say {

    public static String count (int n)
    {
        if (n==1) return "1";
        String s = count (n-1);
        String ans ="";
        int c =0;
        for (int i=0;i< s.length();i++)
        {
            c++;
            if (i==s.length()-1|| s.charAt(i)!=s.charAt(i+1))
            {
                ans = ans+ c+s.charAt(i);
                c=0;
            }
        }
        return ans;

    }












    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
       String a = count(n);
       System.out.println(a);
        sc.close();
     }
    
}
