package masteryws;

public class Static {

    public static void main(String[] args)
    {
        Student student1 = new Student("Rahini", "MIT");
        Student student2 = new Student("Shreya", "Manipal");
        Student student3 = new Student("Sneha", "Manipal University");

        student1.output();
        student2.output();
        student3.output();
    }
}

class Student
{
    String name;
    static String collegeName = "Manipal University";

    Student(String name, String collegeName)
    {
        this.name = name;
        this.collegeName = collegeName;
    }

    public void output()
    {
        System.out.println(STR."Name : \{this.name} | College : \{collegeName}");
    }
}
