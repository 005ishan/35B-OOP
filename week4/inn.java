import java.util.Scanner;

public class inn {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean continueloop = true;
        while(continueloop){
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            System.out.println("You entered "+num);
            if(num<0){
                System.out.println("Invalid input");
                continueloop = false;
            }
        }


    }
}
