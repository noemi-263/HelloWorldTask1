import java.util.Scanner; // Imports the Scanner class from the Java util package, allowing to take input from the user through the console

public class HelloWorld { // Defines a public class named HelloWorld, accessible from anywhere in my project

	public static void printHelloName() { // Defines a method to print "Hello, %name%"

		Scanner scanner = new Scanner(System.in); // Creates a new Scanner object, telling it to read input from the standard input stream (System.in), which is the keyboard

		System.out.print("Enter your name: "); // Prints the text but keeps the cursor on the same line 

		String name = scanner.nextLine(); // Reads the next line of text from the console entered by user and stores it in a variable called name

		System.out.println("Hello, " + name + "!");
	}

	public static void main(String[] args) {  // Main method to start the program

		System.out.println("Hello, world!");  // Prints, then moves the cursor to the next line

		printHelloName(); // Calls the method to print the personalized greeting
	}
}