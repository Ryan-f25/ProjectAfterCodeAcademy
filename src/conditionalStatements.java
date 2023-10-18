public class conditionalStatements {

    public static void main(String[] arg) {

        //This code checks if the number is divisible by 2
        // and if it is, then it is odd and vice versa
        int number = (int) (Math.random() * 30) + 1;
        System.out.print(number + ", ");
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        //This code checks if the number is greater than, less than, or equal to zero
        // and then it decides its sign based on that
        int random = (int) (Math.random() * 60) - 30;
        System.out.print(random + ", ");
        if (random > 0) {
            System.out.println("This number is positive");
        } else if (random < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero");
        }


        //This program says if a number is prime

        boolean isPrimeNum = true;
        int num = (int) (Math.random() * 60) + 1;
        for (int n = 2; n < num -1; n++) {
            if (num % n == 0) {
                System.out.println("The number " +  num +" is not prime");
                return;
            }
        }
        System.out.println(" The number " + num + " is prime");
        }
    }

