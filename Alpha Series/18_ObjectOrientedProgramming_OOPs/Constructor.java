public class Constructor {

    public static void main(String args[]){
        Student stud1 = new Student();

        // System.out.println(stud1.name);         // without constructor it gives null
        // System.out.println(stud1.school);       // constructor is used to initiate object with some value

        Student s1 = new Student();

        for(int i=0; i < 3; i++){
            s1.marks[i] = 101 + i;
        }

        System.out.println(s1.marks[2]);

        Student s2 = new Student(s1);
        System.out.println(s2.marks[2]);

        s1.marks[2] = 45;                       // to understand Shallow & Deep Copy concept in Copy Constructor
        System.out.println(s2.marks[2]);
    }

}

class Student {
    String name;
    String school;
    int roll;
    // int marks[];
    int marks[] = new int[3];

    // Shallow Copy Constructor     -> reflect changes
    // Student( Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;   //copy the reference of the marks array
    // }

    // Deep Copy Constructor     -> doesn't reflect changes
    Student( Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        
        for (int i=0; i<3; i++){        //copy exact  value of the elements of the array
            this.marks[i] = s1.marks[i];
        }
    }
 
    // Non-Paramterized Constructor
    Student() {
        // this.roll = 0;
        this.school = "School name not found!";
    }

    // Paramterized Constructor
    Student(String name){
        this.name = name;
    }

}