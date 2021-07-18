package bai_5.thuc_hanh.static_method;

public class Student {
    private int enrollNo;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        enrollNo = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(enrollNo + " " + name + " " + college);
    }
}

