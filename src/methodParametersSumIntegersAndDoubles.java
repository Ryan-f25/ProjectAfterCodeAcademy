public class methodParametersSumIntegersAndDoubles {

    //This code prints the sum of the two integers
    int integerSum;
    static void maxInt(int a, int b){
        System.out.println("(a,b)= " + a+ ", " + b);
        int integerSum=a+b;
        System.out.println("The sum of a and b: " + integerSum);

    }

    //This code prints the sum of the two doubles

    int doubleSum;
    static void maxDouble(double n, double m){
        System.out.println("(n,m)= " + n+ ", " + m);
        double doubleSum=+ n+m;
        System.out.println("The sum of n and m: " + doubleSum);
    }

    //This code calls the parameters above
    public static void main(String[] args) {

        maxInt((int) (Math.random() * 60)+1, (int) (Math.random() * 60)+ 1);
        System.out.println();
        maxDouble((int) (Math.random() * 60)+1,(int) (Math.random() * 60)+1);

    }
}
