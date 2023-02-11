package org.example;

import java.util.HashMap;

public class RearrangingFruits {
    public int solution (int[] basket1, int[] basket2){
        HashMap<Integer, Integer> dif = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int key: basket1){
            dif.put(key, dif.getOrDefault(key, 0)+1);
            min = Math.min(min, key);
        }
        for (int key: basket2){
            dif.put(key, dif.getOrDefault(key, 0)-1);
            min = Math.min(min, key);
        }
        int replace = 0;
        for (int key: dif.keySet()) {
            if (dif.get(key) % 2 != 0) {
                return -1;
            }
            replace += Math.max(0, dif.get(key)/2);
        }
        int ans = 0;
        int canTake = 0;
        for (int key: dif.keySet()){
            canTake = Math.min(replace, Math.abs(dif.get(key))/2);
            ans += Math.min(2*min, key  );
            replace -= canTake;
        }
        return ans;
    }
}
