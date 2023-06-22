package com.uk.sprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 * An underground railway system is keeping track of customer travel times between different stations.
   They are using this data to calculate the average time it takes to travel from one station to another.
 */
public class UnderGroundSystem {

    Map<Integer, Pair> checkInMap;
    Map<Integer, Pair> checkOutMap;

    List<Integer> checkInList;
    List<Integer> checkOutList;

    public UnderGroundSystem() {
        checkInMap = new HashMap<>();
        checkOutMap = new HashMap<>();
        checkInList = new ArrayList<>();
        checkOutList = new ArrayList<>();
    }

    /*
    * A customer with a card ID equal to id, checks in at the station stationName at time t.
    * A customer can only be checked into one place at a time.
    */
    public void checkIn(int id, String stationName, int t) {
        Pair p = new Pair(stationName, t);
        checkInList.add(id);
        checkInMap.put(id, p);
    }

    public void checkOut(int id, String stationName, int t) {
        Pair p = new Pair(stationName, t);
        checkOutList.add(id);
        checkOutMap.put(id, p);
    }

    public double getAverageTime(String startStation, String endStation) {

        int averageCheckInTime = 0;
        int averageCheckOutTime = 0;
        int count = 0;
        for (Integer checkInId: checkInList) {
            for (Integer checkOutId : checkOutList) {
                if (checkInId.equals(checkOutId)) {
                    Pair checkInObj = checkInMap.get(checkInId);
                    Pair checkOutObj = checkOutMap.get(checkOutId);
                    if (startStation.equals(checkInObj.stationName) && endStation.equals(checkOutObj.stationName)) {
                        averageCheckInTime += checkInObj.time;
                        averageCheckOutTime += checkOutObj.time;
                        count++;
                    }
                }
            }
        }
        return (double) (averageCheckOutTime - averageCheckInTime) / count;
    }

    class Pair {
        private final String stationName;
        private final int time;

        Pair(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }


}
