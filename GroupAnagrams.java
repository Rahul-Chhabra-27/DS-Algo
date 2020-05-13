package interviewQuestions;

import java.util.*;

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String [] strs){
		
		Map<String,List<String>> map = new HashMap<>();
		Map<String,Integer> map1 = new HashMap<>();
		
		for(String s : strs){
			
			char[]a = s.toCharArray();
			
			Arrays.sort(a);
			
			String sorted = new String(a);
			
			if( !map.containsKey(sorted)) {
				
				map.put(sorted , new LinkedList<>());
			}
			
				map.get(sorted).add(s);		
			}
			
		
		
		return new LinkedList<>(map.values());
	
		
		
	}

	public static void main(String[] args) {
		
		
		
		String []df = {"eat","tea","tan","ate","nat","bat"};
		
		
		
		System.out.println(groupAnagrams(df));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
