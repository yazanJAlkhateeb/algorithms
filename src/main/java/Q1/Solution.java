package Q1;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM

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
    public List<Integer> cellCompete(int[] states, int days) {
        return Arrays.stream(getCells(states, days)).boxed().collect(Collectors.toList());
    }
//
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cellCompete(new int[]{1, 1, 1, 0, 1, 1, 1, 1},2));
//
//
//
        }
//
//
//    }




//    public int generalizedGCD(int num, int[] x){
//        if(num<2) {
//           return 0; // not valid
//        }
//        int tmp = gcd(x[x.length-1],x[x.length-2]);
//        for(int i=x.length-3; i>=0; i--) {
//            tmp = gcd(tmp,x[i]);
//        }
//        return tmp;
//    }

//    public int gcd(int x1,int x2) {
//        int a,b,g,z;
//
//        if(x1>x2) {
//            a = x1;
//            b = x2;
//        } else {
//            a = x2;
//            b = x1;
//        }
//
//        if(b==0) return 0;
//
//        g = b;
//        while (g!=0) {
//            z= a%g;
//            a = g;
//            g = z;
//        }
//        return a;
//    }







    public int[] getCells(int[] states, int days) {

        // ArrayList<Integer> result = new ArrayList<>();
        int[] result = new int[states.length];

        for (int i = 0; i < states.length; i++) {
            if (i == 0) {
                result[i] = states[1] == 1 ? 1 : 0;
                continue;
            }
            if (i == states.length - 1) {
                result[i] = states[states.length - 2] == 1 ? 1 : 0;
                continue;
            }
            result[i] = states[i - 1] == states[i + 1] ? 0 : 1;
        }
        return days == 1 ? result : getCells(result, --days);
    }


}
// METHOD SIGNATURE ENDS
