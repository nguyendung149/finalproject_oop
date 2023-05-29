package view;

public class DataToTransfer {
	private double tienThenTang;
	private double tienThemBanCong;
	private boolean input;

	public DataToTransfer() {
		// TODO Auto-generated constructor stub
		this.tienThemBanCong = 0;
		this.tienThenTang = 0;
		this.input = true;
	}

	public void setAll(double themTang, double themBanCong,boolean input) {
		this.tienThemBanCong = themBanCong;
		this.tienThenTang = themTang;
		this.input = input;
	}

	/**
	 * @return the tienThenTang
	 */
	public double getTienThenTang() {
		return tienThenTang;
	}

	/**
	 * @param tienThenTang the tienThenTang to set
	 */
	public void setTienThenTang(double tienThenTang) {
		this.tienThenTang = tienThenTang;
	}

	/**
	 * @return the tienThemBanCong
	 */
	public double getTienThemBanCong() {
		return tienThemBanCong;
	}

	/**
	 * @param tienThemBanCong the tienThemBanCong to set
	 */
	public void setTienThemBanCong(double tienThemBanCong) {
		this.tienThemBanCong = tienThemBanCong;
	}

	/**
	 * @return the input
	 */
	public boolean isInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(boolean input) {
		this.input = input;
	}
	

}
