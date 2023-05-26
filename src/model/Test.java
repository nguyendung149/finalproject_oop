package model;

public class Test {
	public static void main(String[] args) {
		try {
			DanhSachCanHo cty = new DanhSachCanHo();
			cty.xemDanhSachCanHo();
			cty.muaCanHo("BPN1");
			cty.tienSoTienTraThem("BPN1");
			cty.muaCanHo("PEN2");
			cty.tienSoTienTraThem("PEN2");
			System.out.println("\n");
			cty.xemDanhSachCanHo();
			System.out.println("\n");
			cty.xemDanhSachDaBan();
			cty.muaCanHo("BPN1");
			cty.chinhSuaThongTinCanHo("PEN2", 50, false, 10);
			cty.tienSoTienTraThem("PEN2");
			cty.chinhSuaThongTinCanHoDaMua("BPN1", 3, false, 4);
			cty.tienSoTienTraThem("BPN1");
			cty.xemDanhSachCanHo();
			cty.xemDanhSachDaBan();
			cty.xoaCanHoDaMua("PEN2");
			cty.xemDanhSachCanHo();
			cty.xemDanhSachDaBan();
			System.out.println("\n");
			System.out.println(cty.timKiemTheoMaCanHo("HPN2"));
			System.out.println("\n");
			cty.sapXepTheoMa();
			cty.xemDanhSachCanHo();
			System.out.println("\n");
			cty.thongKeCanHoTheoLoai();
			cty.xemDanhSachDaBan();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
