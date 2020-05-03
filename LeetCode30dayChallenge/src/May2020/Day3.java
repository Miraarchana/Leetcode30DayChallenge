package May2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day3 {
	/*
	 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
	 */
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        //egde case
        if(ransomNote.equals("")) return true;
        Map<Character,Integer> rCount = new HashMap<Character,Integer>();
        for (char c : ransomNote.toCharArray()) {
        	if(rCount.containsKey(c))
        		rCount.put(c, rCount.get(c)+1);
        	else
        		rCount.put(c,1);
		}
        Map<Character,Integer> mCount = new HashMap<Character,Integer>();
        for(char ch: magazine.toCharArray()) {
        	if(mCount.containsKey(ch))
        		mCount.put(ch, mCount.get(ch)+1);
        	else
        		mCount.put(ch,1);
        }
        Set<Character> keys = rCount.keySet();
        for(char c: keys) {
        	if(rCount.get(c) > mCount.getOrDefault(c,0))
        		return false;
        }
        
        return true;
    }

	public static void main(String[] args) {
		String ransomNote = "abbd";
		String magazine ="bbde";
		System.out.println(canConstruct(ransomNote,magazine));
	}
}
