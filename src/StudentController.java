import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> StudentList;
    private Scanner scanner;

    public StudentController() {
        StudentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public double inputGpa() {

        while (true) {
            System.out.println("Nhap GPA cua ban tu 0.00 den 4.00: ");
            String input = scanner.nextLine();
            try {
                double gpa = Double.parseDouble(input);
                if (gpa >= 0.00 && gpa <= 4.00) {
                    System.out.println("----Nhap diem thanh cong------");
                    return gpa;

                }
                System.out.println("Vui long GPA trong khoang tu 0 den 4");
            } catch (NumberFormatException e) {
                System.out.println(" GPA phai dung dinh dang ");
            }
        }
    }

    // 1.Chức năng thêm học sinh mới.
    public void addStudent() {
        System.out.println("Nhap ma so sinh vien");
        String id = scanner.nextLine().trim();
        for (Student student : StudentList) {
            if (student.getId().equals(id)) {
                System.out.println("Ma sinh vien da ton tai");
                return;
            }
        }
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhap email: ");
        String email = scanner.nextLine();

        System.out.print("Nhap so dien thoai: ");
        String phone = scanner.nextLine();

        double gpa = inputGpa();

        Student newStudent = new Student(
                id, fullName, email, phone, gpa);

        StudentList.add(newStudent);

        System.out.println("Them sinh vien thanh cong!");
    }

    // 2.Chức năng in danh sách sinh viên.
    public void printStudentList() {
        if (StudentList.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        System.out.printf("%-10s %-25s %-30s %-15s %s%n",
                "id", "fullName", "email", "phone", "gpa");
        for (Student student : StudentList) {
            student.displayData();
        }
    }

    // 3.Chức năng tìm kiếm theo tên.
    public void searchStudentByName() {
        System.out.println("Nhap ten sinh vien ban muon tim kiem");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Ten tim kiem khong duoc rong");
            return;
        }
        boolean found = false;
        for (Student student : StudentList) {
            if (student.getFullName().toLowerCase().contains(name.toLowerCase())) {
                student.displayData();
                found = true;
            }
            if (!found) {
                System.out.println(" khong tim thay sinh vien ");
            }
        }
    }

    // 4. Chức năng tìm sinh viên theo id, nếu thấy thì cho phép cập nhật lại điểm
    // gpa
    public void updateStudentGpa() {
        System.out.println("Nhap ma so sinh vien ");
        String id = scanner.nextLine();
        for (Student student : StudentList) {
            if (student.getId().equals(id)) {
                double newgpa = inputGpa();
                student.setGpa(newgpa);
                return;
            }
        }
        System.out.println("khong tim thay sinh vien");
    }

    // 5.Tìm sinh viên theo id và xóa khỏi studentList
    public void deleteStudent() {
        System.out.println("Nhap ma so sinh vien ");
        String id = scanner.nextLine();
        for (Student student : StudentList) {
            if (student.getId().equals(id)) {

                StudentList.remove(student);
                System.out.println("Xoa sinh vien thanh cong");
                return;
            }
        }
        System.out.println("khong tim thay sinh vien");
    }

    // 6.Sắp xếp danh sách sinh viên giảm dần theo điểm gpa.
    public void sortStudentsByGpaDescending() {
        StudentList.sort(
                (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));

        System.out.println("Sap xep GPA giam dan thanh cong!");
        printStudentList();
    }
}
