import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class PuzzlingTest {
	public static void main(String [] args) {
		Puzzling iD = new Puzzling();
		
		//1)
		System.out.println("---------------------Print Sum and Return Array with Values greater than 10------------------\n");
		int[] array = {3,5,1,2,7,9,8,13,23,52};
		System.out.println(iD.printSum(array));
		
		//2)
		System.out.println("\n--------------------Shuffle Names and Return Array with Names Longer than 5 Characters--------\n");
		String[] shuffName = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(iD.shuffArr(shuffName));
		
		
		//3)
		System.out.println("\n------------------Shuffle Alphabet Array and Print First and Last Letter----------------------\n");
		Character[] abcArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		iD.shufAlph(abcArr);
		
		
		//4)
		System.out.println("\n------------------Return Array with 10 Random Numbers Between 55 & 100------------------------\n");
		int randArr=10;
		System.out.println(Arrays.toString(iD.arrRand(randArr)));
		
		
		//5)
		System.out.println("\n--------Return Array with 10 Random Numbers Between 55 & 100 and Print Smalest and Largest Value----------\n");
		int myArray=10;
		iD.displRand(myArray);
		
		
		//6)
		System.out.println("\n----------------------Create Random 5 Character String-----------------------------------------\n");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the length of the random string you would like:");
		int stringLength = myObj.nextInt();
		iD.oneString(stringLength);
		
		
		//7 
		System.out.println("\n--------------------Create Array with 10 Random 5 Character Strings------(I have this set where you can choose the number of elements and the length of characters)-----\n");
		System.out.println(iD.tenStrings(10, 5)); // (Number of Elements in Array, Length of Strings)
		
		
	}
}
