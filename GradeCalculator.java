import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hindi marks : ");
        double a = sc.nextDouble();
        System.out.println("Enter the English marks : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Math marks : ");
        double c = sc.nextDouble();
        System.out.println("Enter the Physics marks : ");
        double d = sc.nextDouble();
        System.out.println("Enter the Chemistry marks : ");
        double e = sc.nextInt();

        System.out.println("Your Hindi marks is : " + a);
        System.out.println("Your English marks is : " + b);
        System.out.println("Your Math marks is : " + c);
        System.out.println("Your Physics marks is : " + d);
        System.out.println("Your Chemistry marks is : " + e);


        double x = (a + b + c + d + e);
        System.out.println("The Sum of all marks is : " + x);
        System.out.println("Enter the maximum marks : ");
        double max=sc.nextInt();
        double y = (x * 100)/ max;
        System.out.println("The Average or Percentage is : " + y);

        if (y >= 90) {
            System.out.println("A Grade");
        }
        else if (y >= 80) {
            System.out.println("B Grade");
        }
        else if (y >= 70) {
            System.out.println("C Grade");
        }
        else if (y >= 60) {
            System.out.println("D Grade");
        }
        else if (y >= 50) {
            System.out.println("E Grade");
        }
    }
}


