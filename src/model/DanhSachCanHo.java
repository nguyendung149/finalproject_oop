
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

import model.HaiPhongNgu.DanhSachHaiPhongNgu;

public class DanhSachCanHo {
	private ArrayList<CanHo> danhSach;
	private ArrayList<CanHo> danhSachDaBan;
	private static final String pathName = "C:\\Users\\ASUS\\eclipse-workspace\\QuanLyDuAnChungCu\\DanhSachCanHo.txt";
	private static int soLuongHPN, soLuongBPN, soLuongPEN = 0;

	public DanhSachCanHo() {
		// TODO Auto-generated constructor stub
		this.danhSach = new ArrayList<CanHo>();
		try {

			File file = new File(pathName);
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String text = br.readLine();
				if (text == null) {
					break;
				}
				StringTokenizer token = new StringTokenizer(text, ",");
				String maCanHo = token.nextToken();
				maCanHo = maCanHo.trim();
				String temp = token.nextToken();
				temp = temp.trim();
				double dienTich = Double.valueOf(temp);
				temp = token.nextToken();
				temp = temp.trim();
				boolean banCong = Boolean.valueOf(temp);
				temp = token.nextToken();
				temp = temp.trim();
				int soTang = Integer.valueOf(temp);
				String loaiCanHo = token.nextToken();
				loaiCanHo = loaiCanHo.trim();
				if (maCanHo.startsWith("HPN")) {
					CanHo ch = new HaiPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSach.add(ch);
					soLuongHPN++;
				} else if (maCanHo.startsWith("BPN")) {
					CanHo ch = new BaPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSach.add(ch);
					soLuongBPN++;
				} else if (maCanHo.startsWith("PEN")) {
					CanHo ch = new Penthouse(maCanHo, dienTich, banCong, soTang);
					danhSach.add(ch);
					soLuongPEN++;
				}
			}
			br.close();
			reader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.danhSachDaBan = new ArrayList<CanHo>();
	}

	public void thongKeCanHoTheoLoai() {
		for (CanHo canHo : danhSach) {
			if (!canHo.isDaBan()) {
				System.out.println(canHo);
			}
		}
		System.out.println("Số căn Hai Phòng Ngủ còn lại: " + soLuongHPN);
		System.out.println("Số căn Ba Phòng Ngủ còn lại: " + soLuongBPN);
		System.out.println("Số căn Penthouse còn lại: " + soLuongPEN);
		System.out.println("Một số mã căn hộ còn lại: ");
		for (CanHo canHo : danhSach) {
			if (!canHo.isDaBan()) {
				System.out.println(canHo.getMaCanHo());
			}

		}
	}

	public void muaCanHo(String maCanHo) {
		for (CanHo canHo1 : danhSach) {
			if (canHo1.getMaCanHo().equals(maCanHo) && !canHo1.isDaBan()) {

				if (maCanHo.startsWith("HPN")) {
					CanHo e = canHo1;
					danhSachDaBan.add(e);
					soLuongHPN--;
					for (CanHo canHo : danhSach) {
						if (canHo.getMaCanHo().equals(maCanHo)) {
							canHo.setDaBan(true);
						}
					}
					return;
				} else if (maCanHo.startsWith("BPN")) {
					CanHo e = canHo1;
					danhSachDaBan.add(e);
					soLuongBPN--;
					for (CanHo canHo : danhSach) {
						if (canHo.getMaCanHo().equals(maCanHo)) {
							canHo.setDaBan(true);
						}
					}
					return;
				} else if (maCanHo.startsWith(maCanHo)) {
					CanHo e = canHo1;
					danhSachDaBan.add(e);
					soLuongPEN--;
					for (CanHo canHo : danhSach) {
						if (canHo.getMaCanHo().equals(maCanHo)) {
							canHo.setDaBan(true);
						}
					}
					return;
				}
			}

		}
		System.out.println("Căn hộ đã bán!");
	}

	public void tienSoTienTraThem(String maCanHo) {
		for (CanHo e : danhSachDaBan) {
			if (e.getMaCanHo().equals(maCanHo)) {
				Scanner sc = new Scanner(System.in);
				if (e.getMaCanHo().startsWith("HPN")) {
					System.out.println("Hai Phòng Ngủ");
					if (e.getSoTang() < 8) {
						System.out.println("Nhập số tiền thêm cho tầng từ 1 đến 2 trăm triệu: ");
						double tienTang = sc.nextDouble();
						e.setTienChenh_Tang(tienTang);
					} else if (e.getSoTang() > 20 && e.getSoTang() < 30) {
						System.out.println("Nhập số tiền thêm cho tầng từ 2 đến 3 trăm triệu: ");
						double tienTang = sc.nextDouble();
						e.setTienChenh_Tang(tienTang);
					}
					if (e.isBanCong()) {
						System.out.println("Nhập số tiền thêm cho ban công từ 1 đến 2 trăm triệu: ");
						double tienBanCong = sc.nextDouble();
						e.setTienChenh_BanCong(tienBanCong);
					}
				} else if (e.getMaCanHo().startsWith("BPN")) {
					System.out.println("Ba Phòng Ngủ");
					if (e.getSoTang() < 8) {
						System.out.println("Nhập số tiền thêm cho tầng từ 3 đến 5 trăm triệu: ");
						double tienTang = sc.nextDouble();
						e.setTienChenh_Tang(tienTang);
					} else if (e.getSoTang() > 20 && e.getSoTang() < 30) {
						System.out.println("Nhập số tiền thêm cho tầng từ 4 đến 6 trăm triệu: ");
						double tienTang = sc.nextDouble();
						e.setTienChenh_Tang(tienTang);
					}
					if (e.isBanCong()) {
						System.out.println("Nhập số tiền thêm cho ban công từ 2 đến 4 trăm triệu: ");
						double tienBanCong = sc.nextDouble();
						e.setTienChenh_BanCong(tienBanCong);
					}
				} else if (e.getMaCanHo().startsWith("PEN")) {
					System.out.println("PENTHOSUE");
					System.out.println("Nhập số tiền thêm cho tầng từ 5 đến 7 trăm triệu: ");
					double tienTang = sc.nextDouble();
					e.setTienChenh_Tang(tienTang);
					if (e.isBanCong()) {
						System.out.println("Nhập số tiền thêm cho ban công từ 5 đến 7 trăm triệu: ");
						double tienBanCong = sc.nextDouble();
						e.setTienChenh_BanCong(tienBanCong);
					}
				}
			}
		}
	}

	public void xemDanhSachCanHo() {
		for (CanHo canHo : danhSach) {
			System.out.println(canHo);
		}
	}

	public void xemDanhSachDaBan() {
		for (CanHo canHo : danhSachDaBan) {
			System.out.println("\n");
			System.out.println("Mã căn hộ: " + canHo.getMaCanHo());
			System.out.println("Loại căn hộ: " + canHo.getLoaiCanHo());
			System.out.println("Diện tích: " + canHo.getDienTich());
			System.out.println("Có ban công không: " + canHo.isBanCong());
			System.out.println("Số tầng: " + canHo.getSoTang());
			System.out.println("Giá tiền: " + canHo.tinhTien());
			System.out.println("\n\n");
		}
	}

	public int timKiemCanHoTrongDanhSach(String maCanHo) {
		for (CanHo canHo : danhSach) {
			if (canHo.getMaCanHo().equals(maCanHo)) {
				return danhSach.indexOf(canHo);
			}
		}
		return -1;
	}

	public void xoaCanHoDaMua(String maCanHo) {
		int temp = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				danhSachDaBan.remove(temp);
				if (maCanHo.startsWith("HPN")) {
					soLuongHPN++;
				} else if (maCanHo.startsWith("BPN")) {
					soLuongBPN++;
				} else if (maCanHo.startsWith("PEN")) {
					soLuongPEN++;
				}
				break;
			}
			temp++;
		}

		danhSach.get(this.timKiemCanHoTrongDanhSach(maCanHo)).setDaBan(false);

	}

	public void chinhSuaThongTinCanHo(String maCanHo, double dienTich, boolean banCong, int soTang) {
		int temp = 0;
		for (CanHo canHo : danhSach) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				if (maCanHo.startsWith("HPN")) {
					danhSach.remove(temp);
					CanHo ch = new HaiPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSach.add(temp, ch);
					break;
				} else if (maCanHo.startsWith("BPN")) {
					danhSach.remove(temp);
					CanHo ch = new BaPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSach.add(temp, ch);
					break;

				} else if (maCanHo.startsWith("PEN")) {
					danhSach.remove(temp);
					CanHo ch = new Penthouse(maCanHo, dienTich, banCong, soTang);
					danhSach.add(temp, ch);
					break;
				}

			}
			temp++;
		}
		int temp1 = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				this.timKiemTheoMaCanHo(maCanHo).setDaBan(true);
				if (maCanHo.startsWith("HPN")) {
					danhSachDaBan.remove(temp1);
					CanHo ch = new HaiPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp1, ch);
					break;
				} else if (maCanHo.startsWith("BPN")) {
					danhSachDaBan.remove(temp1);
					CanHo ch = new BaPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp1, ch);
					break;

				} else if (maCanHo.startsWith("PEN")) {
					danhSachDaBan.remove(temp1);
					CanHo ch = new Penthouse(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp1, ch);
					break;
				}

			}
			temp1++;
		}
	}

	public void chinhSuaThongTinCanHoDaMua(String maCanHo, double dienTich, boolean banCong, int soTang) {
		int temp = 0;
		for (CanHo canHo : danhSachDaBan) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				if (maCanHo.startsWith("HPN")) {
					danhSachDaBan.remove(temp);
					CanHo ch = new HaiPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp, ch);
					break;
				} else if (maCanHo.startsWith("BPN")) {
					danhSachDaBan.remove(temp);
					CanHo ch = new BaPhongNgu(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp, ch);
					break;

				} else if (maCanHo.startsWith("PEN")) {
					danhSachDaBan.remove(temp);
					CanHo ch = new Penthouse(maCanHo, dienTich, banCong, soTang);
					danhSachDaBan.add(temp, ch);
					break;
				}

			}
			temp++;
		}
	}

	public CanHo timKiemTheoMaCanHo(String maCanHo) {
		int temp = 0;
		for (CanHo canHo : danhSach) {
			if ((canHo.maCanHo).equals(maCanHo)) {
				return (CanHo) danhSach.get(temp);
			}
			temp++;
		}
		return null;
	}

	public void sapXepTheoMa() {
		Collections.sort(danhSach, new Comparator<CanHo>() {

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
