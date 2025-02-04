// Imports the Scanner class from the Java util package, allowing to take input from the user 
// through the console.
import java.util.Scanner;

// Defines a public class named HelloWorld
// Public: this class is accessible from anywhere in my project
public class HelloWorld {

    // Defines a method to print "Hello, %name%"
    // Static: this method belongs to the class itself, not an object of the class
    // Void: means the method does not return any value
    public static void printHelloName() {

        // Creates a Scanner object to read input from the console
        // Scanner scanner: Declares a variable named scanner of type Scanner
        // new Scanner(System.in): Creates a new Scanner object, telling it to read input 
        // from the standard input stream (System.in), which is the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a name
        // print: prints the text but keeps the cursor on the same line
        System.out.print("Enter your name: ");
        
        // Reads the full line of text entered by user and stores it in a variable called name
        // scanner.nextLine(): Reads the next line of input from the console.
        String name = scanner.nextLine();
        
        // scanner.nextLine(): Reads the next line of input from the console
        // "Hello, " + name + "!": Concatenates (joins) the string 
        // "Hello, " with the value of the name variable and adds an exclamation mark (!).
        System.out.println("Hello, " + name + "!");
    }

    // Main method to start the program
    public static void main(String[] args) {
        // Prints "Hello, world!" and moves the cursor to the next line
        System.out.println("Hello, world!");
        
        // Call the method to print a personalized greeting
        printHelloName();
    }
}
