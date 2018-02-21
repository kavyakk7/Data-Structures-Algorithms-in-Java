package Arrays;

import java.util.*;

public class FindkClosestElementsToAValue {
	public static int solution(String A, String B) {
		int i = 1;
		String S = A;
		while(i< B.length())
		{
			S += A;
			i++;
			if(S.contains(B))
				break;
		}
		if(i == B.length() - 1 && !S.contains(B))
			return -1;		
		return i;		
	}

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		int[] A = {1,1,1,2,2};
		int[] E = {1,2,1,3,2,4,2,5};
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < A.length; i++)
		{
			map.put(i+1, A[i]);
		}
		int max = 0;
		int i = 0, count = 0;
		while(i<E.length) {
			int j = E[i], k = (i%2==0)?E[i+1]:E[i-1];
			int label = map.get(j);
			if(map.get(k) == label)
			{
				count++;
			}
			else
			{
				int l = i;
				while(l<E.length)
				{
					if(E[l] == E[i])
						i = l;
				}
			}
			if(i%2==0)
				i+=2;
			else
				i++;
		}
		System.out.println("k value: "+ count);
		System.out.println("i value: "+ i);
	//	System.out.println("k value: "+ k);
		
		/*
		 * // you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] E) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < A.length; i++)
		{
			map.put(i+1, A[i]);
		}
    	int max = 0;
		int k = 0;
		int i = 0, j = i+1;
		while(i<E.length) {
			int label = map.get(k+1);
			if(i%2==0) {
				if(map.get(E[i]) == label && map.get(E[i+1]) == label)
				{
					k++;
					if(j< E.length && E[i] == E[j])
						i = j;
					if(j>3 && E[i] == E[j-2])
						i = j - 2;
				}
				else {
					k = Math.max(max,k);
					i+=2;
				}
			}
			
		}
		return k-1;
    }
}
		 */
	}
}