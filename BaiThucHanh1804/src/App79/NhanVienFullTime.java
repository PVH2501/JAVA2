package App79;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien chinh thuc";
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH;
        } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
        } else
            luong = Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem;
    }
}