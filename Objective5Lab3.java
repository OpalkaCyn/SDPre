import java.util.Scanner;

public class Objective5Lab3 {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if(userNum > 0){
        System.out.println(userNum + " is a positive number");
    }
    else if(userNum < 0){
        System.out.println(userNum + " is a negative number");
    }
   else {
        System.out.println(userNum + " is equal to zero");
    }

    scanner.close();
    }
}
