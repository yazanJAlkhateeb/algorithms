package Q2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED

//
    public static void main(String[] args) {
        Solution solution = new Solution();

        }





    public int generalizedGCD(int num, int[] x){
        if(num<2) {
           return 0;// WE WANT POS NUMBERS HERE
        }
        int tmp = gcd(x[x.length-1],x[x.length-2]);
        for(int i=x.length-3; i>=0; i--) {
            tmp = gcd(tmp,x[i]);
        }
        return tmp;
    }

    public int gcd(int x1,int x2) {
        int a,b,g,z;

        if(x1>x2) {
            a = x1;
            b = x2;
        } else {
            a = x2;
            b = x1;
        }

        if(b==0) return 0;

        g = b;
        while (g!=0) {
            z= a%g;
            a = g;
            g = z;
        }
        return a;
    }

}
