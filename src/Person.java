public class Person {

   //These are the four private attributes
   private int age;
   private String name;
   private int address;
   private String addy;


   //This is a constructor with all the attributes
   public Person(int Page, String Pname, int Paddress, String Paddy) {
      age = Page;
      name = Pname;
      address = Paddress;
      addy = Paddy;

   }

   //These four methods below call the private attributes and prints them
   public int getAge(){
      System.out.println("The person's age: " +age);
      return age;
   }

   public String getName(){
      System.out.println("The person's name: " + name);
      return name;
   }

   public int getAddress(){
      System.out.println("The person's address: " + address);
      return address;
   }

   public String getAddy(){
      System.out.println("The person's address: " + addy);
      return addy;
   }

   //This is a print statement using the attributes
      public void print () {
         System.out.println("The person is named " + name + " and is " + age + " years old. They live on " + address + " " + addy);



   }
}
