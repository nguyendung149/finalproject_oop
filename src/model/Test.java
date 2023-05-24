package model;

public class Test {
	public static void main(String[] args) {
		try {
			DanhSachCanHo ds = new DanhSachCanHo();
			ds.xemDanhSachCanHo();
			ds.muaCanHo(Constants.PENTHOUSE,"PEN1", 10, false, 1, 10, 10);
			ds.muaCanHo(Constants.BAPHONGNGU,"BPN1", 10, false, 1, 10, 10);
			ds.muaCanHo(Constants.HAIPHONGNGU,"HPN1", 10, false, 1, 10, 10);
			ds.muaCanHo(Constants.HAIPHONGNGU,"HPN2", 10, false, 1, 10, 10);
			ds.muaCanHo(Constants.BAPHONGNGU,"BPN2", 11, false, 4, 1, 12);
			ds.xemDanhSachDaBan();
			ds.xemDanhSachCanHo();
			
			ds.chinhSuaThongTinCanHoMua(Constants.HAIPHONGNGU, "HPN2", 10, false, 2, 1, 11);
			ds.xemDanhSachDaBan();
			ds.xemDanhSachCanHo();
			
			ds.xoaCanHoDaMua("HPN3", 1);
			ds.xemDanhSachDaBan();
			ds.xemDanhSachCanHo();
			
			System.out.println(ds.timKiemTheoMaCanHoa("HPN2"));
			System.out.println(ds.timKiemTheoMaCanHoa("HDB"));
			
			ds.sapXepTheoMa();
			ds.xemDanhSachDaBan();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
