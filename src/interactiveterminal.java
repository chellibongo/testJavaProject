import java.util.Scanner;


public class interactiveterminal {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String username = scanner.next();

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        System.out.println(String.format("%s, your age is %d", username, age));

        

        int num = 0;
        
        while(num < 1 || num > 5) {

            System.out.println("Enter a number between 1 and 5");

            num = scanner.nextInt();

            if(num < 0) {
                System.out.println("number too small");


            }
            else if(num > 5) {
                    System.out.println("number too large");
            }
        }

        System.out.println(String.format("You entered %d", num));

        scanner.close();
    
    }
        


        


}

