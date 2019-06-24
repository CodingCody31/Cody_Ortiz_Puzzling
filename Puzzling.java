import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.Collection;
public class Puzzling {
	public ArrayList<Integer> printSum(int[] x){
		ArrayList<Integer> y = new ArrayList<Integer>();
		int sum = 0;
		for (int i=0; i<x.length; i++) {
			sum+=x[i];
			if(x[i]>10)
				y.add(x[i]);
		}
		System.out.println(sum);
		return y;	
	}
	
	public ArrayList<String> shuffArr(String[] x){
		ArrayList<String> longNames = new ArrayList<String>();
		List<String> newList = Arrays.asList(x);
		Collections.shuffle(newList);
		System.out.println(newList);
		for(int i=0; i<x.length; i++) {
			if(x[i].length()>5)
				longNames.add(x[i]);
		}
		return longNames;
	}
	
	public void shufAlph(Character[] arrAbc) {
		List<Character> newAlph = Arrays.asList(arrAbc);
		Collections.shuffle(newAlph);
		System.out.println(newAlph.get(newAlph.size()-1));
		System.out.println(newAlph.get(0));
		char test = newAlph.get(0);
		if(test == 'a' || test == 'e' || test == 'i' || test ==  'o' || test ==  'u')
		System.out.println("Here's a vowel!");
	}
	
	public int[] arrRand(int x){
		int [] newArray;
		Random rand = new Random();
		newArray = new int [x];
		for (int i=0; i<newArray.length;i++) {
			int r;
			r = rand.nextInt(100-55 +1) +55;
			newArray[i]=r;
		}
		return newArray;
	}
	
	public void displRand(int x) {
		int [] newArray;
		Random rand = new Random();
		newArray = new int [x];
		for (int i=0; i<newArray.length;i++) {
			int r;
			r = rand.nextInt(100-55 +1) +55;
			newArray[i]=r;
		}
		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));
		System.out.println(newArray[0]);
		System.out.println(newArray[x-1]);
	}
	
	public void oneString (int x) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                					+ "0123456789"
                					+ "abcdefghijklmnopqrstuvxyz";
		StringBuilder newString = new StringBuilder(x);
		 
		for (int i = 0; i < x; i++) { 
			  
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            newString.append(AlphaNumericString 
	                          .charAt(index)); 
		 }
		System.out.println(newString);
	}
	
	public ArrayList<String> tenStrings (int arrSize, int strLength) {
		ArrayList<String> ranStrings = new ArrayList<String>();
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
									+ "0123456789"
									+ "abcdefghijklmnopqrstuvxyz";
		for (int i = 0; i < arrSize; i++) { 
			StringBuilder newString = new StringBuilder(strLength);
			for (int j=0; j<strLength; j++) {
				int index = (int)(AlphaNumericString.length() * Math.random()); 
				newString.append(AlphaNumericString.charAt(index));
				
			}
			ranStrings.add(newString.toString());
		}
		return ranStrings;
	}
}
