/*
package com.uk.sprint;

import java.util.*;
import java.util.stream.Stream;

public class CourseTest {

    // arrays can contain null, duplicate data as well
    // size of the array is fixed, needs to be defined at declaration
    //java.util.Arrays is the utility class used to modify the arrays

    CourseTest() {
    }

    public void arrayTest() {
        int[] intArr = {1,2,3,4};
        int arr[] = {2,3,4,5};
        String[] numerics = {"one", "two"};
        int arrInt[] = new int[10];
        String[] stringArray = new String[10]; // default primitive int is 0, boolean is false

        Arrays.asList(stringArray);//example of the utility class

        int[][] matrix = new int[1][1]; //multi dimensional

        List.of(stringArray);
        List.copyOf(Collections.EMPTY_LIST); // both the methods return unmodifiable list but with diff in input params
        Arrays.asList(stringArray);
        Arrays.equals(stringArray, numerics);
        Arrays.compare(stringArray, numerics);
        Arrays.binarySearch(arrInt, 2);
        //var len = stringArray.length; //Java 10 introduces a shiny new feature: type inference for local variables

        //two dimensiional array
        int[][] dimens = new int[2][10];
        System.out.println("intArray  == " + dimens);


        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }

        int[][] spreadsheet = new int[3][];
        spreadsheet[0] = new int[3];
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1
        System.out.println(Arrays.deepToString(spreadsheet)); // Line 2

    }

    private void appendString(String a, String b) {
        StringBuilder sb = new StringBuilder();

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();

        int caLength = ca.length;
        int cbLength = cb.length;

        if (caLength > cbLength) {
            for (int i =0 ; i < caLength; i++) {
                if (i < cbLength){
                    sb.append(ca[i]);
                    sb.append(cb[i]);
                }

                if (i > cbLength) {
                    sb.append(ca[i]);
                }
            }
        } else {
            for (int i =0 ; i < cbLength; i++) {
                if (i < caLength){
                    sb.append(ca[i]);
                    sb.append(cb[i]);
                }

                if (i > caLength) {
                    sb.append(cb[i]);
                }
            }
        }

        while (a.length() < b.length()) {
            a =  a.substring(a.length()-1);
            String[] strArr = b.split(a);
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandy) {

        int[] copyArr = Arrays.copyOf(candies, candies.length);
        Arrays.sort(copyArr);
        int largestCandy = copyArr[candies.length-1];
        List<Boolean> boolArr = new ArrayList<>();
        for (int i=0; i < candies.length; i++) {
            int val = candies[i] + extraCandy;
            if (largestCandy < val) {
                boolArr.add(i, false);
            } else {
                boolArr.add(i, true);
            }
        }
        return boolArr;
    }

    public void solution(int[] nums, int[] costs) {
       int left = nums[0];
       int right = nums[0];
       for (int i: nums) {
           left = Math.min(left, i);
           right = Math.max(right, i);
       }


    }

    //Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    public int[] getTarget(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        //data/nums = [2,7,11,15], target = 9
        for (int i=0; i< nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(i);
                    result.add(j);
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    //sorted 1 indexed array
    public int[] getTargetWithoutUsingSameNumberTwice(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        //data/nums = [2,7,11,15], target = 9
        int a = 0;
        int z = nums.length;
        while (a < z) {
            int x = nums[a] + nums[z];
            if (x < target) {
                a++;
            } else if (x > target) {
                z--;
            } else {
              return new int[]{a+1, z+1};
            }
        }





        return new int[0];
    }


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int j : nums1) {
            for (int value : nums2) {
                int sum = j + value;
                if (map.containsKey(sum)) {
                    map.get(sum).add(List.of(j, value));
                } else {
                    List<Integer> intList = List.of(j, value);
                    List<List<Integer>> newList = new ArrayList<>();
                    newList.add(intList);
                    map.put(sum, newList);
                }
            }
        }

        Iterator<Integer> intStream = map.keySet().stream().sorted().limit(k).iterator();
        List<List<Integer>> result = new ArrayList<>();
        while(intStream.hasNext()) {
            var list = map.get(intStream.next());
            if (list.size() == k) {
                result.addAll(list);
                return result;
            }
            result.addAll(list);
        }

        return result;
    }

}
*/
