package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] array = new String[5];
	array[0] = "A";
	array[1] = "B";
	array[2] = "C";
	array[3] = "D"; 
	array[4] = "E";
	printRandomString(array);

}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
public static void printString(String[] strings) {
	for (int i = 0; i< strings.length; i++) {
		System.out.println(strings[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
public static void printReverseString(String[] strings) {
	for (int i = strings.length-1; i>=0; i--) {
		System.out.println(strings[i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
public static void printOtherString(String[] strings) {
	for (int i = 0; i<strings.length; i= i+2) {
		System.out.println(strings[i]);
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
public static void printRandomString(String[] strings) {
	Random ran = new Random();
	int a = ran.nextInt(strings.length);
	int b = ran.nextInt(strings.length);
	int c = ran.nextInt(strings.length);
	int d = ran.nextInt(strings.length);
	int e = ran.nextInt(strings.length);
	System.out.println(strings[a]);
	System.out.println(strings[b]);
	System.out.println(strings[c]);
	System.out.println(strings[d]);
	System.out.println(strings[e]);
	
}


}
