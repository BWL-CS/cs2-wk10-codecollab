import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter your grade (9-12): ");
      int grade = scan.nextInt();
        
      System.out.print("Enter your age: ");
      int age = scan.nextInt();
      scan.nextLine(); 

      System.out.print("Do you own a gaming console? (yes/no): ");
      String hasConsole = scan.nextLine();

      // Check eligibility based on...???
      if ((grade >= 10 && grade <= 12) && (age >= 15 && age <= 18)) { 
         
         if (hasConsole.equals("yes")) {
            System.out.println("You’re eligible to apply for the VIP Gaming Club!");
            
            // Follow up question
            System.out.print("Do you have at least one year of gaming experience? (yes/no): ");
            String gamingExperience = scan.nextLine();
            
            if (gamingExperience.equals("yes")) {
               // Another follow up question
               System.out.print("Do you have a favorite multiplayer game? (yes/no): ");
               String hasFavoriteGame = scan.nextLine();
               
               if (hasFavoriteGame.equals("yes")) {
                  System.out.println("Awesome! You meet all the VIP Gaming Club criteria. Welcome aboard!");
               } 
               // Which IF statement is this ELSE associated with?
               else {
                  System.out.println("Sorry, having a favorite multiplayer game is required for the VIP club.");
               }
            } 
            // Which IF statement is this ELSE associated with?
            else {
               System.out.println("You need at least one year of gaming experience to join the VIP club.");
            }
         }
         // Which IF statement is this ELSE associated with?
         else {
            System.out.println("Owning a gaming console is required to join the VIP Gaming Club.");
         }
      }
      // Which IF statement is this ELSE associated with?
      else {
         System.out.println("Eligibility is limited to students in grades 10-12, aged 15-18.");
      }      
   }
}
