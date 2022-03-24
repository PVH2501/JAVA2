public class Bailam{
	private double banKinh;
	private double chuVi;
	private double dienTich;
	final double PI = 3.14;
	public Bailam() {
		banKinh = 0;
	}
	public double getBanKinh () {
		return banKinh;
	}
	public void setBanKinh(float r) {
		banKinh = r;
	}
	public double tinhChuVi() {
		return chuVi = 2*PI*banKinh;
	}
	public double tinhDienTich() {
		return dienTich = PI * banKinh * banKinh;
	}
}