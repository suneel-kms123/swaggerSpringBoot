package com.uk.sprint.rest.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class TechGigChallenge {

    /*If the blood composition of the person is a subsequence of the virus composition V, then the person is identified as POSITIVE otherwise NEGATIVE.
Example:  Virus Composition, V = coronavirus
Blood Composition of the person , B = ravus
The person in question is POSITIVE as B is the subsequence of the V.
Note: The virus and blood compositions are lowercase alphabet strings.
Input Format
The first line of the input consists of the virus composition, V
The second line of he input consists of the number of people, N
Next N lines each consist of the blood composition of the ith person, Bi*/


    //public static void main(String[] args) {
      public void techGigChallenge() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the name of virus:");
            final String nameOfVirus = scanner.nextLine();
            System.out.println("enter the number of person:");
            int numOfPerson = scanner.nextInt();
            List<String> bloodCompList = new ArrayList<>();
            for (int i = 0; i < numOfPerson; i++) {
                System.out.println("enter the blood composition:");
                bloodCompList.add(scanner.next());
            }
            scanner.close();
            Map<String, String> result = new LinkedHashMap<>();
            bloodCompList.forEach(bloodComp -> {
                result.put(bloodComp, "POSITIVE");
                String dupNameOfVirus = nameOfVirus;
                char[] charArray = bloodComp.toCharArray();
                StringBuffer str = new StringBuffer();
                for (char c : charArray) {
                    str.append(c);
                    if (dupNameOfVirus.contains(str)) {
                        int i = dupNameOfVirus.indexOf(str.toString());
                        if (dupNameOfVirus.length() - 1 != i) {
                            dupNameOfVirus = dupNameOfVirus.substring(i + 1);
                        }
                        str.deleteCharAt(0);
                    } else {
                        str.deleteCharAt(0);
                        result.put(bloodComp, "NEGATIVE");
                        break;
                    }
                }
            });
            System.out.println(String.join("\n", result.values()));
        } catch (Exception exception) {
            log.info("error");
        }
    }


}
