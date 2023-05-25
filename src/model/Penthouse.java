package model;

import java.util.Objects;

public class Penthouse extends CanHo {
	private static double giaTien;

	public Penthouse(String maCanHo, double dienTich, boolean banCong, int soTang) {
		super(maCanHo, dienTich, banCong, soTang, "Penthouse");
		this.giaTien = 6;
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

	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return this.giaTien + this.getTienChenh_BanCong()/10 + this.getTienChenh_Tang()/10;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(giaTien);
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
		Penthouse other = (Penthouse) obj;
		return Double.doubleToLongBits(giaTien) == Double.doubleToLongBits(other.giaTien);
	}

	public class DanhSachPentHouse {
		private int soLuong;

		public DanhSachPentHouse() {
			// TODO Auto-generated constructor stub
			this.soLuong = 0;
		}

		/**
		 * @return the soLuong
		 */
		public int getSoLuong() {
			return soLuong;
		}

		/**
		 * @param soLuong the soLuong to set
		 */
		public void setSoLuong(int soLuong) {
			this.soLuong = soLuong;
		}

	}

}
