package Q3;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries) {
        List<List<Integer>> locationsForDeliveries = new ArrayList<>();
        Map<Double, List<Integer>> rootsForLocations = new HashMap<>();
        for (List<Integer> i : allLocations) {
            rootsForLocations.put(Math.pow(i.get(0), 2) + Math.pow(i.get(1), 2), i);
        }
        List<Double> collect = rootsForLocations.keySet().stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < numDeliveries; i++) {
            locationsForDeliveries.add(rootsForLocations.get(collect.get(i)));

        }

        return locationsForDeliveries;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print( solution.ClosestXdestinations(3, Arrays.asList(Arrays.asList(1, -3)
                , Arrays.asList(1, 2)
                , Arrays.asList(3, 4)), 3));
        System.out.print(solution.ClosestXdestinations(6, Arrays.asList(Arrays.asList(3, 6)
                , Arrays.asList(2, 4)
                , Arrays.asList(5, 3), Arrays.asList(2, 7), Arrays.asList(1, 8), Arrays.asList(7, 9)), 3));
    }
    // METHOD SIGNATURE ENDS
}