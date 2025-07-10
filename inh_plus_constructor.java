package masteryws;

public class inh_plus_constructor {
    public static void main(String[] args){

        student student1 = new student("Rahini", 18, 242730124);
        student student2 = new student("Suhani", 18, 242703012);

        student1.display();
        student2.display();
    }
}

class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class student extends person{
    long roll_no;
    student(String name, int age, long roll_no){
        super(name,age);
        this.roll_no=roll_no;
    }

    void display(){
        System.out.println("Name: "+name+ " Age: "+age+ " Roll no: "+ roll_no);
    }
}