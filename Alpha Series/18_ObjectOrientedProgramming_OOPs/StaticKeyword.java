public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "Kendriya Vidyalaya";

        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s2.schoolName);

        s3.schoolName = "KV";
        System.out.println(s2.schoolName);


    }
}

class Student {
    String name;
    int rollNo;
    static String schoolName;       // It can be change by any of its object for every object
}