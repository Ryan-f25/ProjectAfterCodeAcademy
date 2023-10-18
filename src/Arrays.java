public class Arrays {
    public static void main(String[] args) {

        //This program prints the elements of an array
        int arra[] = new int[5];
        arra[0] = (int) (Math.random() * 50) + 1;
        arra[1] = (int) (Math.random() * 50) + 1;
        arra[2] = (int) (Math.random() * 50) + 1;
        arra[3] = (int) (Math.random() * 50) + 1;
        arra[4] = (int) (Math.random() * 50) + 1;

        for (int n = 0; n < arra.length; n++) {
            System.out.println("the elements of the array are " + arra[n]);
        }
        System.out.println(" ");
        System.out.println("New Code starts here:");

        //This program finds the sum of an array
        int arg[] = new int[5];
        int sum = 0;
        arg[0] = (int) (Math.random() * 50) + 1;
        arg[1] = (int) (Math.random() * 50) + 1;
        arg[2] = (int) (Math.random() * 50) + 1;
        arg[3] = (int) (Math.random() * 50) + 1;
        arg[4] = (int) (Math.random() * 50) + 1;

        for (int c = 0; c < arg.length; c++) {
            sum = sum + arg[c];
            System.out.println("Elements of the array are " + arg[c]);

        }
        System.out.println("Sum equals " + sum);
        System.out.println(" ");
        System.out.println("New Code stars here: ");


        //This program finds the largest element of the array
        int array[] = new int[5];
        array[0] = (int) (Math.random() * 50) + 1;
        array[1] = (int) (Math.random() * 50) + 1;
        array[2] = (int) (Math.random() * 50) + 1;
        array[3] = (int) (Math.random() * 50) + 1;
        array[4] = (int) (Math.random() * 50) + 1;
        int max = array[0];

        for(int u = 0; u < array.length; u++){
            if (max<array[u]) {
                max = array[u];

            }
            System.out.println("Elements of the array are " + array[u]);
        }

        System.out.println("The max number is " + max);



    }

}
