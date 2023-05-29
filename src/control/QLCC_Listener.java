package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.QLCH_View;

public class QLCC_Listener implements ActionListener {
	private QLCH_View view;

	public QLCC_Listener(QLCH_View view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if (command.equals("Mua_KH")) {
			this.view.themKhachHang();
		}else if(command.equals("Chỉnh sửa_KH")) {
			this.view.chinhSua();
		}else if(command.equals("Tìm")) {
			this.view.layDuLieuTuBang();
		}else if(command.equals("Xóa_KH")) {
			this.view.xoa();
		}else if(command.equals("Sắp Xếp_KH")) {
			this.view.sapXep();
		}
	}
}
