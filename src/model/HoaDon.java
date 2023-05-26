package model;

import java.util.Objects;

public class HoaDon {
	private Customer khachHang;
	private CanHo canHo;
	private double thanhTien;

	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public HoaDon(Customer khachHang, CanHo ch) {
		this.khachHang = khachHang;
		this.canHo = ch;
		this.thanhTien = canHo.tinhTien();
	}

	/**
	 * @return the khachHang
	 */
	public Customer getKhachHang() {
		return khachHang;
	}

	/**
	 * @param khachHang the khachHang to set
	 */
	public void setKhachHang(Customer khachHang) {
		this.khachHang = khachHang;
	}

	/**
	 * @return the canHo
	 */
	public CanHo getCanHo() {
		return canHo;
	}

	/**
	 * @param canHo the canHo to set
	 */
	public void setCanHo(CanHo canHo) {
		this.canHo = canHo;
	}

	/**
	 * @return the thanhTien
	 */
	public double getThanhTien() {
		return thanhTien;
	}

	/**
	 * @param thanhTien the thanhTien to set
	 */
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "HoaDon [khachHang=" + khachHang + ", canHo=" + canHo + ", thanhTien=" + thanhTien + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(canHo, khachHang, thanhTien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(canHo, other.canHo) && Objects.equals(khachHang, other.khachHang)
				&& Double.doubleToLongBits(thanhTien) == Double.doubleToLongBits(other.thanhTien);
	}

	public void inHoaDon() {
		System.out.println("Hóa đơn");
		System.out.println("Mã khách hàng: " + khachHang.getCustomerCode());
		System.out.println("họ và tên: " + khachHang.getName());
		System.out.println("Mã căn hộ đã mua: " + canHo.getMaCanHo());
		System.out.println("Thành tiền: " + canHo.tinhTien());
	}
}
