import java.util.Random;
import java.util.Scanner;

public class Main {


     public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt(100); // Generates a random integer within the full range of int
        System.out.println("Guess what is the number ? :  ");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
         System.out.println("Random Integer: " + randomInt);

        int user_number= scanner.nextInt();
        int attempts =0 ;
       

        while (user_number< randomInt || user_number> randomInt) {
            attempts++;
            
        
         if(user_number> 1.5*randomInt){
            System.out.println("too High Try again");
             
        
         }else if (user_number<0.5*randomInt) {
             System.out.println("too low Try again");
              
         }
         else if (user_number>randomInt) {
             System.out.println("High  Try again");
                   
             
         }else if (user_number<randomInt) {
             System.out.println(" low  Try again");
                
            
         }
          user_number= scanner.nextInt();
         }
         if (user_number==randomInt) {
             System.out.println(" Congratulation you got it after :  "+ attempts+" attempts");
             
         }





    
    
    
    // Close the Scanner to prevent resource leak
    scanner.close();
    }


    
}
