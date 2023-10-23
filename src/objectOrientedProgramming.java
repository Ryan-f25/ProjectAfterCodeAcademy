import java.util.ArrayList;

public class objectOrientedProgramming {

    //This is an arraylist avgGrade
    //The values of the arraylist are the objects student
    ArrayList<Student> avgGrade = new ArrayList<Student>();

    public static void main(String[] arg){

        //I created an objectOrientedProgramming object called obj
        objectOrientedProgramming obj = new objectOrientedProgramming();


    }

    //This methods includes all of the students' information
    //it also adds their grades to arraylist
    public objectOrientedProgramming(){
        Student Josh = new Student(16,99,"Josh");
        Josh.print();
        avgGrade.add(Josh);


        Student Ryan = new Student(18,87,"Ryan");
        Ryan.print();
        avgGrade.add(Ryan);


        Student Bill = new Student(18,97,"Bill");
        Bill.print();
        avgGrade.add(Bill);

        Student Rob = new Student(17,90,"Rob");
        Rob.print();
        avgGrade.add(Rob);
        avrgGrade();

    }

    //This method calculates the average grade by getting the grades from the student arraylist
    //Then it sums the grades and divides it by the total amount of students
    public void avrgGrade() {


        int total = 0;

        for (int n = 0; n < avgGrade.size(); n++) {
            total = total + avgGrade.get(n).grade;
            System.out.println(total);

        }
        System.out.println("The average grade is " + total / avgGrade.size());


    }
}
