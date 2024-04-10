class Student{
    int rollno;
    String names;
    float marks;
    Student(){
        this.rollno=1;
        this.names="John Doe";
        this.marks = 85.0f;
    }    
    Student(int a,String b,float c){
        rollno=a;
        names=b;
        marks=c;
    }
};
public class First {
    public static void main(String[] args) {
        // creating object of the class Student
        Student s1 = new Student();
        
        System.out.println("Roll No: "+s1.rollno);
        System.out.println("Name :   "+s1.names);
        System.out.println("Marks :  "+s1.marks);

        //creating another object by passing values to constructor
        Student s2 = new Student (2,"Jane Doe",97.3f);
        System.out.println("\nDetails of student Jane Doe");
        System.out.println("Roll No: "+s2.rollno);
        System.out.println("Name :   "+s2.names);
        System.out.println("Marks :  "+s2.marks);
    }
}