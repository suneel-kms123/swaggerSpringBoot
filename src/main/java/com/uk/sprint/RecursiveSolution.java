package com.uk.sprint;

import java.util.HashMap;
import java.util.Map;

public class RecursiveSolution {

    public static int recursiveFactorial(int n) {
        if (n == 1) return n;
        return n * recursiveFactorial(n-1);
    }
    
    public int compress(char[] chars) {
        if (chars.length == 1) return chars.length;

        int count = 1;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < chars.length-1; i++) {
            char c = chars[i];
            char d = chars[i+1];
            if (c == d) {
                count++;
            } else {
                s.append(chars[i]);
                if (count > 1) {
                    s.append(count);
                }
                count = 1;
            }

            if (i+1 >= chars.length-1) {
                s.append(chars[i]);
                if (count > 1) {
                    s.append(count);
                }
            }
            System.out.println(s);
        }

        char[] res = s.toString().toCharArray();
        for (int k = 0; k < res.length; k++) {
            chars[k] = res[k];
        }

        return res.length;
    }

}
