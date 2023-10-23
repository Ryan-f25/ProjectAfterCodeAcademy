public class MethodParametersLargestNumber {

    //This code has the code for the maximum number for integers
    static void maxInt(int a, int b){
        System.out.println("(a,b)= " + a+ ", " + b);
        if (a>b){
            System.out.println(a + " > " + b);
        } else if (a<b){
            System.out.println(a + " < " + b);
        } else {
            System.out.println("The numbers are equal");

        }

    }

    //This code calls the parameter above
    public static void main(String[] args) {

        maxInt((int) (Math.random() * 60)+1, (int) (Math.random() * 60)+ 1);
        System.out.println();
    }
}
