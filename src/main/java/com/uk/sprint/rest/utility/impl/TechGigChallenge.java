/*
package com.uk.sprint.rest.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class TechGigChallenge {

    public void primeNumberTechGigProblemNeedsOptimization() {

        Scanner scan = new Scanner(System.in);

        int numberOfInputItem = Integer.parseInt(scan.nextLine());
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < numberOfInputItem; i++) {
            String s = scan.nextLine();
            strList.add(s);
        }
        scan.close();

        for (int i = 0; i < strList.size(); i++) {
            String[] inputNumberList = strList.get(i).split(" ");
            int number1 = Integer.parseInt(inputNumberList[0]);
            int number2 = Integer.parseInt(inputNumberList[1]);

            if (number1 == number2) {
                System.out.println("0");
                continue; // return 0
            }

            List<Integer> primeNumber1List = new ArrayList<>();

            for (int j = number1; j <= number2; j++) {
                if (j == 1) {
                    continue;
                }

                if (j == 2) {
                    primeNumber1List.add(j);
                    continue;
                }

                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        if (primeNumber1List.contains(j)) {
                            primeNumber1List.remove(primeNumber1List.indexOf(j));
                        }
                        break;
                    } else {
                        if (!primeNumber1List.contains(j)) {
                            primeNumber1List.add(j);
                        }
                    }
                }
                ;
            }

            List<Integer> primeNumber2List = new ArrayList<>();
            for (int j = number2; j > number1; j--) {
                for (int k = 2; k <= number2 / 2; k++) {
                    if (j % k == 0) {
                        if (primeNumber2List.contains(j)) {
                            primeNumber2List.remove(primeNumber2List.indexOf(j));
                        }
                        break;
                    } else {
                        if (!primeNumber2List.contains(j)) {
                            primeNumber2List.add(j);
                        }
                    }
                }
                ;
            }

            if (primeNumber2List.size() != 0 && primeNumber1List.size() != 0) {
                System.out.println(primeNumber2List.stream().max(Integer::compareTo).get() - primeNumber1List.stream()
                        .min(Integer::compareTo).get());
            } else {
                System.out.println("-1");
            }
        }
    }

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
}*/
