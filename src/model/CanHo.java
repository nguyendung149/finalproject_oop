package model;

import java.util.Objects;

public abstract class CanHo implements Comparable<CanHo> {
	protected String maCanHo;
	protected double dienTich;
	protected boolean banCong;
	protected int soTang;
	protected String loaiCanHo;
	private double tienChenh_BanCong;
	private double tienChenh_Tang;

	public CanHo(String loaiCanHo) {
		this.loaiCanHo = loaiCanHo;
	}
	
	public CanHo(String maCanHo,double dienTich, boolean banCong, int soTang, String loaiCanHo,
			double tienChenh_BanCong, double tienChenh_Tang) {
		this.maCanHo = maCanHo;
		this.dienTich = dienTich;
		this.banCong = banCong;
		this.soTang = soTang;
		this.loaiCanHo = loaiCanHo;
		this.tienChenh_BanCong = tienChenh_BanCong;
		this.tienChenh_Tang = tienChenh_Tang;
	}

	

	/**
	 * @return the dienTich
	 */
	public double getDienTich() {
		return dienTich;
	}

	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	/**
	 * @return the banCong
	 */
	public boolean isBanCong() {
		return banCong;
	}

	/**
	 * @param banCong the banCong to set
	 */
	public void setBanCong(boolean banCong) {
		this.banCong = banCong;
	}

	/**
	 * @return the soTang
	 */
	public int getSoTang() {
		return soTang;
	}

	/**
	 * @param soTang the soTang to set
	 */
	public void setSoTang(int soTang) {
		this.soTang = soTang;
	}

	/**
	 * @return the loaiCanHo
	 */
	public String getLoaiCanHo() {
		return loaiCanHo;
	}

	/**
	 * @param loaiCanHo the loaiCanHo to set
	 */
	public void setLoaiCanHo(String loaiCanHo) {
		this.loaiCanHo = loaiCanHo;
	}
	
	/**
	 * @return the tienChenh_BanCong
	 */
	public double getTienChenh_BanCong() {
		return tienChenh_BanCong;
	}

	/**
	 * @param tienChenh_BanCong the tienChenh_BanCong to set
	 */
	public void setTienChenh_BanCong(double tienChenh_BanCong) {
		this.tienChenh_BanCong = tienChenh_BanCong;
	}

	/**
	 * @return the tienChenh_Tang
	 */
	public double getTienChenh_Tang() {
		return tienChenh_Tang;
	}

	/**
	 * @param tienChenh_Tang the tienChenh_Tang to set
	 */
	public void setTienChenh_Tang(double tienChenh_Tang) {
		this.tienChenh_Tang = tienChenh_Tang;
	}
	

	/**
	 * @return the maCanHo
	 */
	public String getMaCanHo() {
		return maCanHo;
	}

	/**
	 * @param maCanHo the maCanHo to set
	 */
	public void setMaCanHo(String maCanHo) {
		this.maCanHo = maCanHo;
	}

	public abstract double tinhTien();

	@Override
	public int hashCode() {
		return Objects.hash(banCong, dienTich, loaiCanHo, soTang, tienChenh_BanCong, tienChenh_Tang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CanHo other = (CanHo) obj;
		return banCong == other.banCong && Double.doubleToLongBits(dienTich) == Double.doubleToLongBits(other.dienTich)
				&& Objects.equals(loaiCanHo, other.loaiCanHo) && soTang == other.soTang
				&& Double.doubleToLongBits(tienChenh_BanCong) == Double.doubleToLongBits(other.tienChenh_BanCong)
				&& Double.doubleToLongBits(tienChenh_Tang) == Double.doubleToLongBits(other.tienChenh_Tang);
	}

	
}
