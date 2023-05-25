package model;

public class KhachHang {
	private String maKhachHang;
	private String hoTen;
	private String email;
	private String soDienThoai;
	private CanHo canHo;

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKhachHang, String hoTen, String email, String soDienThoai, CanHo canHo) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.canHo = canHo;
	}

	/**
	 * @return the maKhachHang
	 */
	public String getMaKhachHang() {
		return maKhachHang;
	}

	/**
	 * @param maKhachHang the maKhachHang to set
	 */
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", email=" + email + ", soDienThoai="
				+ soDienThoai + ", canHo=" + canHo + "]";
	}

}
