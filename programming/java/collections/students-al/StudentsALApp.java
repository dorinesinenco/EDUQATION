public class StudentsALAPP{

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<Student>();
        // ArrayList<Student> best_students = new ArrayList<Student>();
        students.add( new Student("John Unknown", "IT", 9.7) );
        students.add( new Student("Peter Known", "Engineering", 9.0) );
        students.add( new Student("Alisa Unknown", "IT", 9.6) );
        students.add( new Student("Egor Known", "IT", 7.2) );
        students.add( new Student("Vally Unknown", "Engineering", 8.6) );

        for( Student s: students ){
            // ???
            System.out.println( s );
        }

        ArrayList<Student> students = new ArrayList<Student>();

       // ???
    }

}

//////////////////////////////////////////
class Student{
    String fullname;
    String specialty;
    Float  grade;
    // ???

}