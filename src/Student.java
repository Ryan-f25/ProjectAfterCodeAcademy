public class Student {

    int age;
    int grade;
    String name;

    public Student(int Page, int Pgrade, String Pname){
        age = Page;
        grade = Pgrade;
        name=Pname;
    }

    public void print(){
        System.out.println("The student, "+ name + ", is " + age + " years old and has a grade of " + grade);
    }




}
