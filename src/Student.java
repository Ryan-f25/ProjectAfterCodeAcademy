import java.util.ArrayList;

public class Student {

    int age;
    int grade;
    String name;



    //This is a student constructor
    //The students are in the objectOrientedProgramming class
    public Student(int Page, int Pgrade, String Pname){
        age = Page;
        grade = Pgrade;
        name=Pname;



    }

    //This is a print statement that I call with each student
    public void print(){
        System.out.println("The student, "+ name + ", is " + age + " years old and has a grade of " + grade);
    }






}
