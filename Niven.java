import java.util.Scanner;

public class NivenNumber {
    // Function to calculate the sum of digits of a number
    public  int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is a Niven number
    public  boolean isNivenNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        NivenNumber ob=new NivenNumber();
       
        

        if (ob.isNivenNumber(num)) {
            System.out.println(num + " is a Niven number.");
        } else {
            System.out.println(num + " is not a Niven number.");
        }
        scanner.close();
    }
}
