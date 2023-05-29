package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dialog_NhapTien extends JDialog {
	private DataToTransfer dataTrans;
	private JTextField jTextField_NhapTienThemBanCong;
	private JTextField jTextField_NhapTienThemTang;

	public Dialog_NhapTien(QLCH_View view) {
		// TODO Auto-generated constructor stub
		super(view, "Nhap Tien", true);
		this.setLocation(300, 300);
		ActionListener ac = new Listener();
		JLabel jLabel_NhapTienThemBanCong = new JLabel("Nhập tiền thêm ban công: ");
		jTextField_NhapTienThemBanCong = new JTextField(50);
		JLabel jLabel_NhapTienThemTang = new JLabel("Nhập tiền thêm tầng: ");
		jTextField_NhapTienThemTang = new JTextField(50);
		JButton jButton_ok = new JButton("OK");
		jButton_ok.addActionListener(ac);
		JButton jButton_cancel = new JButton("Cancel");
		jButton_cancel.addActionListener(ac);
		this.setLayout(new GridLayout(3, 3));
		this.add(jLabel_NhapTienThemBanCong);
		this.add(jTextField_NhapTienThemBanCong);
		this.add(jLabel_NhapTienThemTang);
		this.add(jTextField_NhapTienThemTang);
		this.add(jButton_ok);
		this.add(jButton_cancel);

		this.pack();

	}

	public void showIt(DataToTransfer dataTrans) {
		this.dataTrans = dataTrans;
		this.setVisible(true);
	}

	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double tienThemTang = Double.valueOf(jTextField_NhapTienThemTang.getText());
			double tienThemBanCong = Double.valueOf(jTextField_NhapTienThemBanCong.getText());
			String cm = e.getActionCommand();
			if (cm.equals("OK")) {
				dataTrans.setAll(tienThemTang, tienThemBanCong, true);
				setVisible(false);
			} else if (cm.equals("Cancel")) {
				dataTrans.setAll(tienThemTang, tienThemBanCong, false);
				setVisible(true);
			}

		}

	}

}
