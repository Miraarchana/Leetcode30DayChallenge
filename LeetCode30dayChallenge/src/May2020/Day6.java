package May2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day6 {
	/*Majority Element
	 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

map<number,count> + check against n/2
O(n) time and space O(k) k is the unique numbers in array
	 *
	 */
	public static void main(String[] args) {
		int[] arr = {2,2,3,1,2};//12223
		// TODO Auto-generated method stub
		/*
		 * Map<Integer,Integer> counter = new HashMap<>(); 
		 * for(int i =0; i<arr.length;i++) {
		 * counter.put(arr[i],counter.getOrDefault(arr[i],0)+1); if(counter.get(arr[i])
		 * > arr.length/2) { System.out.println("Majority Element::"+ arr[i]); break; }
		 * }
		 */
		Arrays.sort(arr);
		System.out.println(arr[arr.length/2]);
	}

}
