public class App2103 {
    public static void main(String[] args) {
        System.out.println("hinh chu nhat");
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhapHCN();
        HCN.chuViHCN();
        HCN.dienTichHCN();

        System.out.println("person");
        Person ps = new Person();
        ps.set();
        System.out.println("cac thong tin ban nhap la: ");
        ps.get();
    
        System.out.println("thong tin ve sinh vien");
        Sinhvien sv = new Sinhvien();
        sv.nhapSV();
        sv.laySV();

        System.out.println("giai pt bac 2");
        pTB2 pt = new pTB2();
        pt.nhapPT2();
        pt.tinhPT2();
        pt.inPT2();
}
}