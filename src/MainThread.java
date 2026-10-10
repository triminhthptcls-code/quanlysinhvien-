import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        StudentController st1 = new StudentController();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("==================================================");
            System.out.println("        HE THONG QUAN LY SINH VIEN");
            System.out.println("==================================================");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ten");
            System.out.println("4. Cap nhat diem GPA theo ma sinh vien");
            System.out.println("5. Xoa sinh vien theo ma sinh vien");
            System.out.println("6. Sap xep danh sach sinh vien theo GPA giam dan");
            System.out.println("7. Thoat chuong trinh");
            System.out.println("==================================================");

            System.out.print("Vui long chon chuc nang (1-7): ");

            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so tu 1 den 7!");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    st1.addStudent();
                    break;

                case 2:
                    st1.printStudentList();
                    break;

                case 3:
                    st1.searchStudentByName();
                    break;

                case 4:
                    st1.updateStudentGpa();
                    break;

                case 5:
                    st1.deleteStudent();
                    break;

                case 6:
                    st1.sortStudentsByGpaDescending();
                    break;

                case 7:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

            System.out.println();

        } while (choice != 7);
    }
    }



