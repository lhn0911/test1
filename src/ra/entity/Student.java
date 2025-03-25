package ra.entity;

import java.util.Map;
import java.util.Scanner;

public class Student {
    Scanner sc =new Scanner(System.in);
    private String StudentId;
    private String StudentName;
    private int age;
    private float avg;

    public  Student(){

    };

    public Student(String studentId, String studentName, int age, float avg) {
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.age = age;
        this.avg = avg;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getage() {
        return age;
    }

    public void setage(int studentage) {
        age = studentage;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    void inputData(Map<String, Student> studentMap, Scanner sc){
        System.out.print("Nhap ma sinh vien");
        sc.nextLine();
        while(true){
            if(!studentMap.containsKey(StudentId)){
                break;
            }
            System.out.print("Nhap lai ma sinh vien");
            StudentId=sc.nextLine();
        }
        System.out.print("Nhap ten sinh vien");
        StudentName = sc.nextLine();
        while(true) {
            if (age < 0) {
                break;
            }
        }
        System.out.print("Nhap tuoi sinh vien");
        age = sc.nextInt();
        while(true){
            if(avg<0){
                break;
            }
            System.out.print("Nhap diem trung binh");
            avg = sc.nextFloat();
        }
    }
    @Override
    public String toString() {
        return "StudentId="+ StudentId + ", StudentName=" + StudentName + ", age=" + age + ", avg=" + avg;
    }

}



