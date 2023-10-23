public class dataEncapsulation {


    public static void main(String[] arg){

        //This prints the person constructor
        Person Ryan = new Person(16, "Ryan", 125, "Yarmouth Rd");
        Ryan.print();

        //This calls the private attributes in the person class
        Ryan.getName();
        Ryan.getAddress();
        Ryan.getAddy();
        Ryan.getAge();

    }
}
