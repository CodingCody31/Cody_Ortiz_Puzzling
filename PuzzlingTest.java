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
		int[] array = {3,5,1,2,7,9,8,13,23,52};
		System.out.println(iD.printSum(array));
		
		//2)
		String[] shuffName = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(iD.shuffArr(shuffName));
		
		//3)
		Character[] abcArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		iD.shufAlph(abcArr);
		
		//4)
		int randArr=10;
		System.out.println(Arrays.toString(iD.arrRand(randArr)));
		
		//5)
		int myArray=10;
		iD.displRand(myArray);
		
		//6)
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the length of the random string you would like:");
		int stringLength = myObj.nextInt();
		iD.oneString(stringLength);
		
		//7 
		System.out.println(iD.tenStrings(10, 5));
		
		
	}
}
