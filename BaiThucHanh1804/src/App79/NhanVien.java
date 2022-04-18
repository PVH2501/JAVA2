package App79;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {
        ten = "";
        luong = 0;
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    protected String loaiNhanVien() {
        return "";
    }

    public void xuatThongTin() {
        System.out.println("Nhan vien: " + ten + "\nLoai nhan vien: " + loaiNhanVien() + "\nLuong: " + luong);
    }
}