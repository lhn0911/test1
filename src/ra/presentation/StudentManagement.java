package ra.presentation;

import java.util.HashMap;
import java.util.Map;
import ra.entity.Student;
import java.util.Scanner;
public class StudentManagement {
    Map<String, Student> students =  new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới các sinh viên");
            System.out.println("3. Xóa sinh viên theo mã sinh viên");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất ");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất ");
            System.out.println("7. Thoát");
            int choice =  sc.nextInt();
            switch(choice){
                case 1:
                    displayStudent(student);
                    break;
                case 2:
                    addStudent(student, sc);
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while(true);
    }
    public static void  displayStudent(Map<String, Student> studentMap){
        for(Map.Entry<String, Student> entry : studentMap.entrySet()){
            if(entry.getValue()==null){
                System.out.println("Danh sach trong");
                return;
            }
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void addStudent(Map<String, Student> studentMap){
        Student student = new Student();
        student.inputData(Student, sc);

    }
    public static void deleteStudent(Map<String, Student> studentMap){
        for(Map.Entry<String, Student> entry : studentMap.entrySet()){
            if(entry.getValue()==null){
                System.out.println("Danh sach trong");
            }
            studentMap.remove(entry.getKey());
        }
    }
    public static void caculateAverage(Map<String, Student> studentMap){
        float totalavg = 0;
        for(Map.Entry<String, Student> entry : studentMap.entrySet()){
            tatolavg =
        }
    }
}
