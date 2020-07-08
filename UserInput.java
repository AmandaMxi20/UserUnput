import java.util.Scannner;
public class IntegerInput {
   public static void main(String[]args){
   //Creates a reader instance which takes
   //input from standard input-keyboard
   Scanner reader = new Scanner(System.in);
   System.out.print("Enter a number:");
   
   //NextInt() reads the integer from the keyboard
   int number = reader.nextInt();
   
   //printIn() prints the following line to output screen
   System.out.printIn("You Entered:" + number);
