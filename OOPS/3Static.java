package masteryws;

public class Static {

    public static void main(String[] args)
    {
        // Despite different college names set for students 1, 2, 3
        // the result is gonna be Yale only! Cause of the static keyword before collegeName in class Student
        // what static does is, for every object created using Student class, it auto assigns collegeName as "Yale"
        Student student1 = new Student("Don");
        Student student2 = new Student("Isaac");
        Student student3 = new Student("Leighton");

        student1.output();
        student2.output();
        student3.output();
    }
}

class Student
{
    String name;
    static String collegeName = "Yale";

    Student(String name)
    {
        this.name = name;
    }

    public void output()
    {
        System.out.println(STR."Name : \{this.name} | College : \{collegeName}");
    }
}
