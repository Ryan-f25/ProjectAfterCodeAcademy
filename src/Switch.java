public class Switch {

    public static void main(String[] args) {

        //This code prints the day of week that corresponds to a number 1-7
        //Monday is day 1; Sunday is day 7
        int dayOfWeek = (int) (Math.random() * 7) + 1;
        System.out.println("The day is: " + dayOfWeek);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }

        //This code prints the grade for a given score using a switch statement
        //The grade is out of 10 and corresponds to a letter grade below
        //An A is 9 or 10 and an F is 1- 5
        int Grade = (int) (Math.random() * 10) + 1;
        System.out.println();
        System.out.println("The grade out of 10: " + Grade);
        switch (Grade) {
            case 1:
                    System.out.println("You got an F");
                    break;
            case 2:
                    System.out.println("You got an F");
                    break;
            case 3:
                    System.out.println("You got an F");
                    break;
            case 4:
                    System.out.println("You got an F");
                    break;
            case 5:
                    System.out.println("You got an F");
                    break;
            case 6:
                    System.out.println("You got a D");
                    break;
            case 7:
                    System.out.println("You got a C");
                    break;
            case 8:
                    System.out.println("You got a B");
                    break;
            case 9:
                    System.out.println("You got an A");
                    break;

            case 10:
                    System.out.println("You got an A");
                    break;
        }
    }
}

