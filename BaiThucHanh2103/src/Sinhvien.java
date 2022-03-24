import java.util.Scanner;
public class Sinhvien
{
    String Masinhvien;
    String HoTen;
    String DiaChi;
    String Ngaysinh;
    Boolean GioiTinh;
    Scanner scanner = new Scanner(System.in);
    void nhapSV()
    {
        System.out.println("nhap MSV: ");
        Masinhvien = scanner.nextLine();
        System.out.println("nhap Ho ten: ");
        HoTen = scanner.nextLine();
        System.out.println("nhap dia chi: ");
        DiaChi = scanner.nextLine();
        System.out.println("nhap ngay sinh: ");
        Ngaysinh = scanner.nextLine();
        System.out.println("nhap gioi tinh: ");
        GioiTinh = scanner.nextBoolean();
    }
    int laySV()
    {
        System.out.println("ma sv: "+Masinhvien);
        System.out.println("ho ten: "+HoTen);
        System.out.println("dia chi: "+DiaChi);
        System.out.println("ngay sinh: "+Ngaysinh);
        if (GioiTinh == true)
        {
            System.out.println("nam");
        }
        else
        {
            System.out.println("nu");
        }
    return 0;
    }
}