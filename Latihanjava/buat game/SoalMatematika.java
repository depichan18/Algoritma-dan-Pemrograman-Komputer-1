import java.util.Scanner;

public class SoalMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Math Quest!");
        System.out.println("You're standing in front of a whiteboard, and you see a problem written on it:");

        int repeat = 0;
        while (repeat < 5) {
            System.out.println("Algebra: Solve for x");

            double a = Math.random() * 10;
            int roundedA = (int) Math.round(a);
            double b = Math.random() * 10;
            int roundedB = (int) Math.round(b);
            double c = Math.random() * 10;
            int roundedC = (int) Math.round(c);

            System.out.println(roundedA + "x + " + roundedB + " = " + roundedC);

            System.out.println("What would you like to do?");
            System.out.println("A) Solve for x using algebraic methods");
            System.out.println("B) Move on to the next problem");
            System.out.println("C) Review the formula for solving linear equations");
            System.out.println("D) Ask for a hint");

            System.out.print("Type A, B, C, or D to make your choice: ");
            String choice = scanner.next();

            switch (choice) {
                case "A":
                    double x = (roundedC - roundedB) / roundedA;
                    System.out.println("Enter your Answer: ");
                    double yourAns = scanner.nextDouble();

                    if (yourAns != x) {
                        System.out.println("Your answer is wrong! The right one is: ");
                    } else {
                        System.out.println("You solve for x and get:");
                    }

                    System.out.println("x = " + x);
                    break;
                    
                case "B":
                    System.out.println("You move on to the next problem:");
                    System.out.println("Geometry: Find the area of a circle");
                    double r = Math.random()*10;
                    int roundedR = (int) Math.round(r);

                    System.out.println("If r = " + roundedR );
                    double area = Math.PI * Math.pow(r, 2);

                    System.out.println("The area of the circle is: ");
                    double yourAns2 = scanner.nextDouble();
                            
                    if (yourAns2 != area) {
                        System.out.println("Your answer is wrong! The right one is: ");
                    } else {
                        System.out.println("The area of the circle is: ");
                    }
                    System.out.print(area);
                    break;

                case "C":
                    System.out.println("You review the formula for solving linear equations:");
                    System.out.println("x = (y - b) / a");
                    break;

                case "D":
                    System.out.println("You ask for a hint:");
                    System.out.println("Try subtracting " + roundedB + " from both sides of the equation.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

             System.out.println("Do you want to try another problem? (yes/no)");
                String answer = scanner.next();

                if (answer.equalsIgnoreCase("yes")) {
                repeat++;
                } 
                else {
                System.out.println("Goodbye!");
                }
            //repeat++;
        }
        System.out.println("Do you want to try another problem? (yes/no)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
        repeat++;
        } 
        else {
        System.out.println("Goodbye!");
        }
    }
}