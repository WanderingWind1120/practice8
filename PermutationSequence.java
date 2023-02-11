package org.example;

import java.util.ArrayList;

public class PermutationSequence {
    public String getPermutation (int n, int k){
        StringBuilder newString = new StringBuilder();
        int [] factorial = new int[n];
        int sum = 1;

        ArrayList<Integer> number = new ArrayList<Integer>();

        for (int i= 1; i<= n; i++){
            number.add(i);
        }
        for (int i =0 ; i<= n-1; i++){
            sum *= i+1;
            factorial[i] = sum;
        }
        k--;
        int index = 0;
        for (int i = 0; i <= n-1; i++ ){
            index = k/factorial[n-i];
            newString.append(String.valueOf(number.get(index)));
            number.remove(index);
            k -= index*factorial[n-i];
        }
        return newString.toString();
    }
}
