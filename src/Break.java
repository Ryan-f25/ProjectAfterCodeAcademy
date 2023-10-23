public class Break {

    public static void main(String[] args) {

        //This code would print the numbers 1 to 100 but it breaks at 10 and stops printing
        System.out.println("The numbers 1-10:");
        for(int i=1; i<=100; i++){
            if(i >= 11){
                break;
            }
            System.out.println(i);
        }
    }
}
