package May2020;

import java.util.HashSet;
import java.util.Set;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="loveleetcode";
		System.out.println("Unique char Index in::"+str+" is::"+firstUniqChar(str));
	}
	public static int firstUniqChar(String s) {
        //1.go through each char in s, track a unique character and check against other character- O(n) to confirm that char is unique
        //2.if the current unique char is not unique, set to next char in the char array.
        char[] chArr = s.toCharArray();
        Set<Character> nonUniq = new HashSet<Character>();
        for(int i=0;i<chArr.length;i++) {
        	if(s.lastIndexOf(chArr[i])==i && !nonUniq.contains(chArr[i])) {
        		return i;
        	}else {
        		nonUniq.add(chArr[i]);
        	}
        }
		return -1;
    }
}
