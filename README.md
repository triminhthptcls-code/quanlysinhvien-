# HỆ THỐNG QUẢN LÝ SINH VIÊN (JAVA CONSOLE)

## 1. Giới thiệu

Đây là bài tập xây dựng chương trình **quản lý sinh viên trên giao diện Console bằng Java**, vận dụng lập trình hướng đối tượng (OOP), `ArrayList`, `Scanner`, vòng lặp, `switch-case` và xử lý ngoại lệ.

Dữ liệu sinh viên được lưu tạm thời trong bộ nhớ RAM bằng `ArrayList<Student>` và sẽ không được giữ lại sau khi kết thúc chương trình.

## 2. Các chức năng

1. **Thêm sinh viên:** Nhập mã sinh viên, họ tên, email, số điện thoại và GPA; kiểm tra trùng mã sinh viên.
2. **Hiển thị danh sách:** In thông tin sinh viên dưới dạng bảng trong Console.
3. **Tìm kiếm theo tên:** Tìm các sinh viên có tên chứa từ khóa nhập vào, không phân biệt chữ hoa/chữ thường.
4. **Cập nhật GPA:** Tìm theo mã sinh viên và thay đổi GPA.
5. **Xóa sinh viên:** Tìm theo mã và xóa khỏi danh sách.
6. **Sắp xếp theo GPA:** Sắp xếp danh sách theo GPA giảm dần.
7. **Thoát:** Kết thúc chương trình.

GPA hợp lệ nằm trong khoảng **0.0–4.0**. Chương trình có xử lý một số trường hợp nhập sai định dạng và lựa chọn menu không hợp lệ.

## 3. Cấu trúc project

```text
StudentManagement/
├── src/
│   ├── Student.java
│   ├── StudentController.java
│   └── MainThread.java
└── README.md
```

- **`Student.java`:** Định nghĩa thuộc tính sinh viên, constructor, getter/setter và `displayData()`.
- **`StudentController.java`:** Quản lý `ArrayList<Student>` và triển khai các chức năng nghiệp vụ.
- **`MainThread.java`:** Chứa `main()`, hiển thị menu và tiếp nhận lựa chọn người dùng.

## 4. Công nghệ sử dụng

- Ngôn ngữ: **Java**
- Giao diện: **Console/Terminal**
- Cấu trúc dữ liệu: **ArrayList**
- Kiến thức áp dụng: **OOP, Constructor, Encapsulation, Getter/Setter, Scanner, for/for-each, do-while, switch-case, try-catch, Lambda và Comparator**

## 5. Hướng dẫn chạy chương trình

### Cách 1: Chạy bằng Visual Studio Code

1. Mở thư mục `StudentManagement` bằng VS Code.
2. Cài **JDK** và tiện ích **Extension Pack for Java** nếu chưa có.
3. Mở `src/MainThread.java`.
4. Nhấn **Run Java** hoặc **Run** ở hàm `main()`.
5. Nhập lựa chọn từ **1 đến 7** trong Terminal để sử dụng.

### Cách 2: Chạy bằng Terminal

Từ thư mục gốc `StudentManagement`, chạy:

```bash
javac -d out src/Student.java src/StudentController.java src/MainThread.java
java -cp out MainThread
```

Các lệnh trên áp dụng khi ba file Java không khai báo `package`.

## 6. Ví dụ sử dụng

```text
==================================================
        HE THONG QUAN LY SINH VIEN
==================================================
1. Them moi sinh vien
2. Hien thi danh sach sinh vien
3. Tim kiem sinh vien theo ten
4. Cap nhat diem GPA theo ma sinh vien
5. Xoa sinh vien theo ma sinh vien
6. Sap xep danh sach sinh vien theo GPA giam dan
7. Thoat chuong trinh
==================================================
Vui long chon chuc nang (1-7): 1
Nhap ma sinh vien: SV01
Nhap ho ten: Nguyen Van A
Nhap email: a@gmail.com
Nhap so dien thoai: 0123456789
Nhap GPA (0 - 4): 3.5
Them sinh vien thanh cong!
```

*Ví dụ minh họa; câu chữ hiển thị có thể khác tùy phiên bản mã nguồn.*

## 7. Video giới thiệu các chức năng

**Link video demo:** https://drive.google.com/drive/folders/1auhm9yuqxXtJEj1y3NQS2_f7eb9za1nG

> **Trước khi nộp bài:** Thay liên kết ví dụ ở trên bằng link video thật của bạn (Google Drive hoặc YouTube) và kiểm tra quyền truy cập.

Video nên giới thiệu menu, thao tác thêm sinh viên, xem danh sách, tìm kiếm, sửa GPA, xóa, sắp xếp và thoát chương trình; đồng thời thử trường hợp nhập ID trùng hoặc GPA không hợp lệ.

## 8. Nộp bài

- Đưa toàn bộ mã nguồn cùng file `README.md` lên GitHub.
- Kiểm tra chương trình chạy được từ `MainThread.java`.
- Chèn link video demo thật vào mục 7.
- Nộp **link repository GitHub** lên Classroom theo yêu cầu bài tập.
