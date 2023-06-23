package com.uk.sprint;

import java.util.Arrays;

public class CityScheduling {
    /*
    * A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti],
    * the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.
    * Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
    * */

    //[[[10,20],[30,200],[400,50],[30,20]]
    public int twoCitySchedCost(int[][] costs) {


        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int sum = 0;
        for (int i =0 ; i < costs.length /2; i++) {
            sum += costs[i][0];
        }

        for (int i =0 ; i < costs.length /2; i++) {
            sum += costs[i][1];
        }

        System.out.print(Arrays.deepToString(costs));
        return sum;
    }

}
