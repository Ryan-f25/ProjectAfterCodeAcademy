public class Methods {

    public static void main(String[] args) {

        //This program reverses the letters of a string
        String original = "WordsAreCool";

        //toCharArray converts the original word into characters
        char[] word = original.toCharArray();

        System.out.println(word);
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
        System.out.println();




        //This program print the maximum of two numbers
       int a = (int)(Math.random()*50)+1;
       int b = (int)(Math.random()*50)+1;
       System.out.println("(a,b)= " + a+ ", " + b);

       if (a>b){
           System.out.println(a);
        } else {
           System.out.println(b);
       }



    }
}
