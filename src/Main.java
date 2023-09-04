import java.util.Scanner; //import scanner util
public class Main {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in); //create scanner
            int age; //declare age
            String firstName; //declare firstName
            String favouriteFood; //declare favouriteFood
            System.out.println("Please enter your age:"); //print to ask for user input
            age = scanner.nextInt(); //scan for next integer
            scanner.nextLine();
            System.out.println("Please enter you first name:"); //print to ask for user input
            firstName = scanner.nextLine(); //scan for next
            System.out.println("What is your favourite food?"); //print to ask for user input
            favouriteFood = scanner.nextLine(); //scan for next
            //print final statement
            System.out.println("First name: " + firstName + '\n' + '\n' + "Age: " + age + '\n' + '\n' + "Favourite food: " + favouriteFood);
        }
    }