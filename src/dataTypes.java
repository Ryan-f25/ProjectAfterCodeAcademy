public class dataTypes {

    public static void main(String[] args) {

        //This prints every data type separated by commas
        int numb = 16;
        char character = 'c';
        double number = 20.75;
        long w = 20l;
        String name = "Ryan";
        Boolean school = false;
        byte random = -120;
        short two = -10000;
        float myNumber = 7.32f;
        System.out.print(numb + ", " + character + ", " + number + ", " + w + ", " +name + ", " + school + ", " + random);
        System.out.println(", "+ two + ", " + myNumber + ", ");

        //this prints the number 30, which is the integer form of 30.7.
        double randomer = 30.7;
        int nummer = (int)randomer;
        System.out.println(nummer);

        //This produces 24.0, which is the double form of 24.
        int plink = 24;
        double toy = (double)plink;
        System.out.println(toy);



    }
}
