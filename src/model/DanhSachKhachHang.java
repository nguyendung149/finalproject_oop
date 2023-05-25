package model;

import java.util.ArrayList;

public class DanhSachKhachHang {
	private ArrayList<KhachHang> danhSach;

	public DanhSachKhachHang() {
		// TODO Auto-generated constructor stub
		danhSach = new ArrayList<KhachHang>();
	}

	public void themKhachHang(KhachHang kh) {
		danhSach.add(kh);
	}
	public void xemDanhSachKhachHang() {
		for (KhachHang khachHang : danhSach) {
			System.out.println(khachHang);
		}
	}
	public void chinhSuaThongTin() {
		
	}
		
}
