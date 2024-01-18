package JavaCollectionPrograms;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// longest string in given array
		
		
		String[] str= {"java","microservices","mysal","language","ftjdtdfrtdrdsstrdrtdrtd"};
		
		
		           String longestarray = Arrays.stream(str)
		                   .reduce((word1 , word2)-> word2.length()> word1.length()? word1:word2)
		                   .get();
		           System.out.println(longestarray);
		           
		            

	}

}
