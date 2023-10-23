public class methodParametersReversedString {

    //This is the parameter for the string and includes the code to reverse it
    public static void reversedString(String quote){
        for (int x = quote.length()-1; x>=0;x--){
            System.out.print(quote.charAt(x));
        }
        System.out.println();
        System.out.println();
    }

    //This calls the parameters and allows the user to change the quote being reversed
    public static void main(String[] args) {
        System.out.println("The original quote: Blocks");
        reversedString("Blocks");
    }
}
