package model;

import java.util.Objects;

public class BaPhongNgu extends CanHo {
	private long soLuong;
	private double giaTien;

	public BaPhongNgu() {
		// TODO Auto-generated constructor stub
		super("Ba phòng ngủ");
		this.soLuong = 300;
		this.giaTien = 3;
	}

	public BaPhongNgu(String maCanHo,double dienTich, boolean banCong, int soTang, double tienChenh_BanCong, double tienChenh_Tang) {
		super(maCanHo,dienTich, banCong, soTang, "Ba Phong Ngu", tienChenh_BanCong, tienChenh_Tang);
		this.soLuong = 300;
		this.giaTien = 3;
	}

	/**
	 * @return the soLuong
	 */
	public long getSoLuong() {
		return soLuong;
	}

	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * @return the giaTien
	 */
	public double getGiaTien() {
		return giaTien;
	}

	/**
	 * @param giaTien the giaTien to set
	 */
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	/**
	 * @return the maCanHo
	*/

	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return this.giaTien + this.getTienChenh_BanCong() + this.getTienChenh_Tang();
	}

	@Override
	public String toString() {
		return "BaPhongNgu [Loại căn hộ: " + super.loaiCanHo + ", Số lương: " + this.soLuong + ", Giá gốc: "
				+ this.giaTien + " tỷ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(giaTien, soLuong);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaPhongNgu other = (BaPhongNgu) obj;
		return Double.doubleToLongBits(giaTien) == Double.doubleToLongBits(other.giaTien)
				&& Objects.equals(maCanHo, other.maCanHo) && soLuong == other.soLuong;
	}

	@Override
	public int compareTo(CanHo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
