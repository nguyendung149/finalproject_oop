
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCanHo {
	private ArrayList<CanHo> danhSachConLai;
	private ArrayList<CanHo> danhSachDaBan;
	private HaiPhongNgu hpn = new HaiPhongNgu();
	private BaPhongNgu bpn = new BaPhongNgu();
	private Penthouse pen = new Penthouse();

	public DanhSachCanHo() {
		// TODO Auto-generated constructor stub
		this.danhSachConLai = new ArrayList<CanHo>();
		this.danhSachConLai.add(hpn);
		this.danhSachConLai.add(bpn);
		this.danhSachConLai.add(pen);
		this.danhSachDaBan = new ArrayList<CanHo>();
	}

	public void xemDanhSachCanHo() {
		for (CanHo canHo : danhSachConLai) {
			System.out.println(canHo);
			System.out.println("\n");
		}
	}

	public void chinhSuaThongTinGiaGocHaiPhongNgu(double t) {
		this.hpn.setGiaTien(t);
	}

	public void chinhSuaThongTinGiaGocBaPhongNgu(double t) {
		this.bpn.setGiaTien(t);
	}

	public void chinhSuaThongTinGiaGocPenthouse(double t) {
		this.pen.setGiaTien(t);
	}

	public void muaCanHo(int i, String maCanHo,double dienTich, boolean banCong, int soTang, double tienChenh_BanCong,
			double tienChenh_Tang) {
		if (i == Constants.HAIPHONGNGU) {
			CanHo e = new HaiPhongNgu( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
			danhSachDaBan.add(e);
			long count = this.hpn.getSoLuong() - 1;
			this.hpn.setSoLuong(count);
		} else if (i == Constants.BAPHONGNGU) {
			CanHo e = new BaPhongNgu( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
			danhSachDaBan.add(e);
			long count = this.bpn.getSoLuong() - 1;
			this.bpn.setSoLuong(count);
		} else if (i == Constants.PENTHOUSE) {
			CanHo e = new Penthouse( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
			danhSachDaBan.add(e);
			long count = this.pen.getSoLuong() - 1;
			this.pen.setSoLuong(count);
		}
	}

	public void xemDanhSachDaBan() {
		for (CanHo canHo : danhSachDaBan) {
			System.out.println("\n");
			System.out.println("Mã căn hộ: " + canHo.getMaCanHo());
			System.out.println("Loai can ho: " + canHo.getLoaiCanHo());
			System.out.println("Diện tích: " + canHo.getDienTich());
			System.out.println("Có ban công không: " + canHo.isBanCong());
			System.out.println("Số tầng: " + canHo.getSoTang());
			System.out.println("Gia Tien: " + canHo.tinhTien());
			System.out.println("\n\n");
		}
	}

	public void xoaCanHoDaMua(String maCanHo, int i) {
		int temp = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				danhSachDaBan.remove(temp);
				if (i == Constants.HAIPHONGNGU) {
					this.hpn.setSoLuong(this.hpn.getSoLuong() + 1);
				} else if (i == Constants.BAPHONGNGU) {
					this.bpn.setSoLuong(this.bpn.getSoLuong() + 1);
				} else if (i == Constants.PENTHOUSE) {
					this.pen.setSoLuong(this.pen.getSoLuong() + 1);
				}
				break;
			}
			temp++;
		}

	}

	public void chinhSuaThongTinCanHoMua(int i, String maCanHo, double dienTich, boolean banCong, int soTang,
			double tienChenh_BanCong, double tienChenh_Tang) {
		int temp = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				if (i == Constants.HAIPHONGNGU) {
					danhSachDaBan.remove(temp);
					CanHo ch = new HaiPhongNgu( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
					danhSachDaBan.add(temp, ch);
					break;
				} else if (i == Constants.BAPHONGNGU) {
					danhSachDaBan.remove(temp);
					CanHo ch = new BaPhongNgu( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
					danhSachDaBan.add(temp, ch);
					break;

				} else if (i == Constants.PENTHOUSE) {
					danhSachDaBan.remove(temp);
					CanHo ch = new Penthouse( maCanHo,dienTich, banCong, soTang, tienChenh_BanCong, tienChenh_Tang);
					danhSachDaBan.add(temp, ch);
					break;
				}

			}
			temp++;
		}
	}

	public int timKiemTheoMaCanHoa(String maCanHo) {
		int temp = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				return temp;
			}
			temp++;
		}
		return -1;
	}

	public void sapXepTheoMa() {
		Collections.sort(danhSachDaBan, new Comparator<CanHo>() {

			@Override
			public int compare(CanHo o1, CanHo o2) {
				// TODO Auto-generated method stub
				String maCanHo1 = o1.getMaCanHo();
				String maCanHo2 = o2.getMaCanHo();

				return maCanHo1.compareTo(maCanHo2);
			}
		});
	}

	
}
