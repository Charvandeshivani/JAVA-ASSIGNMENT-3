import java.util.Scanner;

class Student25 {
    int roll_no;
    String name;

    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void displayInfo() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name   : " + name);
    }
}

class Marks extends Student25{
    int physics, maths, chemistry, sum;

    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        physics = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        maths = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        chemistry = sc.nextInt();
    }

    void calculateSum() {
        sum = physics + maths + chemistry;
        System.out.println("Sum of marks: " + sum);
    }
}

public class Result extends Marks {
    void calculateAverage() {
        double avg = sum / 3.0;
        System.out.println("Average marks: " + avg);
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.inputInfo();
        r.inputMarks();
        r.displayInfo();
        r.calculateSum();
        r.calculateAverage();
    }
}
 