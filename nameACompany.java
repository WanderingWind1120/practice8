package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class nameACompany {
    public ArrayList<Integer> solution (String s, String [] ideas){
        HashSet<String>[] counts = new HashSet[26];
        for (int i = 0; i <= 25; i++){
            counts[i] = new HashSet<>();
        }
        for (String idea: ideas){
            counts[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        for (int i = 0; i <= s.length() - ideas.length*ideas[0].length(); i++){
            String sub = sub.substring(i, i+ ideas.length * ideas[0].length());

        }
    }
    private boolean isConcat (String sub, HashSet<>)
}
