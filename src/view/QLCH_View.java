package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class QLCH_View extends JFrame {

	private JPanel contentPane;
	private JTextField MacanHo;
	private JTextField GiaTien;
	private JTextField DienTich;
	private JTextField SoTang;
	private JTextField MaKhachHang;
	private JTextField HoVaTen;
	private JTextField Email;
	private JTextField MaCanMua;
	private JTextField SDT;
	private JTextField InHoaDon;
	private JTable TableCanHo;
	private JTable TableKhachHang;
	private JLabel InMaKH;
	private JLabel InHoVaTen;
	private JLabel InCanHoDaMua;
	private JLabel InThanhTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					QLCH_View frame = new QLCH_View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QLCH_View() {

		setIconImage(Toolkit.getDefaultToolkit().createImage(QLCH_View.class.getResource("icon.png")));
		setTitle("Quản Lý Căn Hộ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.setIcon(new ImageIcon(QLCH_View.class.getResource("open.png")));
		mnFile.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mntmNewMenuItem_1.setIcon(new ImageIcon(QLCH_View.class.getResource("save.png")));
		mnFile.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1264, 659);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Quản Lý Căn Hộ", new ImageIcon(QLCH_View.class.getResource("house.png")), panel, null);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Mã Căn Hộ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 32, 120, 27);
		panel.add(lblNewLabel);

		MacanHo = new JTextField();
		MacanHo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MacanHo.setBounds(140, 32, 196, 27);
		panel.add(MacanHo);
		MacanHo.setColumns(10);

		GiaTien = new JTextField();
		GiaTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GiaTien.setColumns(10);
		GiaTien.setBounds(140, 90, 196, 27);
		panel.add(GiaTien);

		JLabel lblGiTin = new JLabel("Giá Gốc");
		lblGiTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiTin.setBounds(10, 90, 83, 27);
		panel.add(lblGiTin);

		JLabel lblLoiCn = new JLabel("Loại Căn");
		lblLoiCn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLoiCn.setBounds(10, 140, 101, 27);
		panel.add(lblLoiCn);

		DienTich = new JTextField();
		DienTich.setFont(new Font("Tahoma", Font.PLAIN, 20));
		DienTich.setColumns(10);
		DienTich.setBounds(651, 32, 196, 27);
		panel.add(DienTich);

		JLabel lblDinTch = new JLabel("Diện Tích");
		lblDinTch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinTch.setBounds(521, 32, 101, 27);
		panel.add(lblDinTch);

		SoTang = new JTextField();
		SoTang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SoTang.setColumns(10);
		SoTang.setBounds(651, 80, 196, 27);
		panel.add(SoTang);

		JLabel lblSTng = new JLabel("Số Tầng");
		lblSTng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSTng.setBounds(521, 80, 101, 27);
		panel.add(lblSTng);

		JLabel lblBanCng = new JLabel("Ban Công");
		lblBanCng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBanCng.setBounds(521, 133, 101, 27);
		panel.add(lblBanCng);

		JLabel lblNewLabel_1 = new JLabel("Danh sách Căn Hộ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 199, 196, 27);
		panel.add(lblNewLabel_1);

		JCheckBox CheckCo = new JCheckBox("Có");
		CheckCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CheckCo.setBounds(651, 133, 96, 27);
		panel.add(CheckCo);

		JCheckBox CheckKhong = new JCheckBox("Không");
		CheckKhong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CheckKhong.setBounds(766, 133, 96, 27);
		panel.add(CheckKhong);

		JButton btnThemCH = new JButton("Thêm");
		btnThemCH.setBackground(Color.GREEN);
		btnThemCH.setIcon(new ImageIcon(QLCH_View.class.getResource("+.png")));
		btnThemCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemCH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnThemCH.setBounds(10, 524, 131, 50);
		panel.add(btnThemCH);

		JButton btnTim = new JButton("Tìm");
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setIcon(new ImageIcon(QLCH_View.class.getResource("find.png")));
		btnTim.setBounds(364, 30, 100, 30);
		panel.add(btnTim);

		JButton btnChinhSuaCH = new JButton("Chỉnh sửa");
		btnChinhSuaCH.setBackground(Color.YELLOW);
		btnChinhSuaCH.setIcon(new ImageIcon(QLCH_View.class.getResource("edit.png")));
		btnChinhSuaCH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChinhSuaCH.setBounds(151, 524, 196, 50);
		panel.add(btnChinhSuaCH);

		JButton btnXoaCH = new JButton("Xóa");
		btnXoaCH.setBackground(Color.RED);
		btnXoaCH.setIcon(new ImageIcon(QLCH_View.class.getResource("delete.png")));
		btnXoaCH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnXoaCH.setBounds(357, 524, 131, 50);
		panel.add(btnXoaCH);

		JButton btnSapXepCH = new JButton("Sắp Xếp");
		btnSapXepCH.setBackground(Color.DARK_GRAY);
		btnSapXepCH.setIcon(new ImageIcon(QLCH_View.class.getResource("arrange.png")));
		btnSapXepCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSapXepCH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSapXepCH.setBounds(498, 524, 171, 50);
		panel.add(btnSapXepCH);

		JButton btnSapXepBan = new JButton("Căn hộ đã bán");
		btnSapXepBan.setBackground(Color.BLUE);
		btnSapXepBan.setIcon(new ImageIcon(QLCH_View.class.getResource("list.png")));
		btnSapXepBan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSapXepBan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSapXepBan.setBounds(679, 524, 238, 50);
		panel.add(btnSapXepBan);

		JButton btnSapXepCon = new JButton("Căn hộ còn lại");
		btnSapXepCon.setBackground(Color.BLUE);
		btnSapXepCon.setIcon(new ImageIcon(QLCH_View.class.getResource("list.png")));
		btnSapXepCon.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSapXepCon.setBounds(927, 524, 253, 50);
		panel.add(btnSapXepCon);

		TableCanHo = new JTable();
		TableCanHo.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				 "M\u00E3 C\u0103n H\u1ED9", "Gi\u00E1 Ti\u1EC1n", "Lo\u1EA1i C\u0103n", "Di\u1EC7n T\u00EDch", "S\u1ED1 T\u1EA7ng", "Ban C\u00F4ng","Tình Trạng"
			}
		));
		JScrollPane scrollPane = new JScrollPane(TableCanHo);
		scrollPane.setBounds(10, 226, 1240, 277);
		panel.add(scrollPane);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 514, 1240, 2);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 187, 1240, 2);
		panel.add(separator_1);
		
		JComboBox LoaiCan = new JComboBox();
		LoaiCan.setBounds(140, 140, 196, 27);
		panel.add(LoaiCan);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Quản Lý Khách Hàng", new ImageIcon(QLCH_View.class.getResource("user.png")), panel_1, null);
		panel_1.setLayout(null);

		JLabel lblMKhchHng = new JLabel("Mã Khách Hàng");
		lblMKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng.setBounds(10, 33, 163, 23);
		panel_1.add(lblMKhchHng);

		MaKhachHang = new JTextField();
		MaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MaKhachHang.setColumns(10);
		MaKhachHang.setBounds(181, 35, 183, 27);
		panel_1.add(MaKhachHang);

		HoVaTen = new JTextField();
		HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		HoVaTen.setColumns(10);
		HoVaTen.setBounds(731, 82, 238, 27);
		panel_1.add(HoVaTen);

		JLabel lblHVTn = new JLabel("Họ và Tên");
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHVTn.setBounds(560, 86, 100, 23);
		panel_1.add(lblHVTn);

		Email = new JTextField();
		Email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Email.setColumns(10);
		Email.setBounds(731, 27, 238, 27);
		panel_1.add(Email);

		JLabel lblDinTch_1 = new JLabel("Email");
		lblDinTch_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinTch_1.setBounds(560, 33, 65, 23);
		panel_1.add(lblDinTch_1);

		MaCanMua = new JTextField();
		MaCanMua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MaCanMua.setColumns(10);
		MaCanMua.setBounds(181, 86, 183, 27);
		panel_1.add(MaCanMua);

		JLabel lblSTng_1 = new JLabel("Mã Căn mua");
		lblSTng_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSTng_1.setBounds(10, 86, 120, 27);
		panel_1.add(lblSTng_1);

		JLabel lblSinThoi = new JLabel("Số Điện Thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSinThoi.setBounds(560, 139, 149, 23);
		panel_1.add(lblSinThoi);

		JLabel lblNewLabel_1_1 = new JLabel("Danh sách Khách Hàng");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(10, 200, 269, 27);
		panel_1.add(lblNewLabel_1_1);

		JButton btnThemKH = new JButton("Thêm");
		btnThemKH.setBackground(Color.GREEN);
		btnThemKH.setIcon(new ImageIcon(QLCH_View.class.getResource("+.png")));
		btnThemKH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnThemKH.setBounds(10, 536, 131, 50);
		panel_1.add(btnThemKH);

		JButton btnTimKH = new JButton("Tìm");
		btnTimKH.setIcon(new ImageIcon(QLCH_View.class.getResource("/view/find.png")));
		btnTimKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTimKH.setBounds(388, 33, 100, 30);
		panel_1.add(btnTimKH);

		JButton btnChinhKH = new JButton("Chỉnh sửa");
		btnChinhKH.setBackground(Color.YELLOW);
		btnChinhKH.setIcon(new ImageIcon(QLCH_View.class.getResource("edit.png")));
		btnChinhKH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChinhKH.setBounds(151, 536, 196, 50);
		panel_1.add(btnChinhKH);

		JButton btnXoaKH = new JButton("Xóa");
		btnXoaKH.setBackground(Color.RED);
		btnXoaKH.setIcon(new ImageIcon(QLCH_View.class.getResource("delete.png")));
		btnXoaKH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnXoaKH.setBounds(357, 536, 131, 50);
		panel_1.add(btnXoaKH);

		JButton btnSapXepKH = new JButton("Sắp Xếp");
		btnSapXepKH.setBackground(Color.BLUE);
		btnSapXepKH.setIcon(new ImageIcon(QLCH_View.class.getResource("list.png")));
		btnSapXepKH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSapXepKH.setBounds(498, 536, 171, 50);
		panel_1.add(btnSapXepKH);

		SDT = new JTextField();
		SDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SDT.setColumns(10);
		SDT.setBounds(731, 135, 238, 27);
		panel_1.add(SDT);

		TableKhachHang = new JTable();
		TableKhachHang.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Mã Khách Hàng", "Họ và tên", "Email", "Số Điện Thoại", "Mã Căn Mua" }));
		JScrollPane scrollPane_1 = new JScrollPane(TableKhachHang);
		scrollPane_1.setBounds(10, 227, 1240, 287);
		panel_1.add(scrollPane_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 191, 1240, 2);
		panel_1.add(separator_1_1);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(10, 525, 1240, 2);
		panel_1.add(separator_1_2);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Quản Lý Hóa Đơn", new ImageIcon(QLCH_View.class.getResource("HD.png")), panel_2, null);
		panel_2.setLayout(null);

		JLabel lblMKhchHng_1 = new JLabel("Mã Khách Hàng");
		lblMKhchHng_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1.setBounds(10, 60, 163, 23);
		panel_2.add(lblMKhchHng_1);

		InHoaDon = new JTextField();
		InHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		InHoaDon.setColumns(10);
		InHoaDon.setBounds(183, 60, 210, 27);
		panel_2.add(InHoaDon);

		JButton btnInHoaDon = new JButton("In Hóa Đơn");
		btnInHoaDon.setBackground(Color.BLUE);
		btnInHoaDon.setIcon(new ImageIcon(QLCH_View.class.getResource("print.png")));
		btnInHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInHoaDon.setBounds(78, 111, 210, 57);
		panel_2.add(btnInHoaDon);

		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 255, 224));
		panel_3.setBounds(788, 30, 436, 538);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Hóa Đơn Bán Hàng ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(101, 11, 268, 48);
		panel_3.add(lblNewLabel_2);

		JLabel lblMKhchHng_1_1 = new JLabel("Mã Khách Hàng");
		lblMKhchHng_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1.setBounds(10, 88, 163, 23);
		panel_3.add(lblMKhchHng_1_1);

		JLabel lblMKhchHng_1_1_1 = new JLabel("Họ và Tên");
		lblMKhchHng_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_1.setBounds(10, 136, 107, 23);
		panel_3.add(lblMKhchHng_1_1_1);

		JLabel lblMKhchHng_1_1_2 = new JLabel("Mã Căn Hộ đã mua");
		lblMKhchHng_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_2.setBounds(10, 189, 202, 23);
		panel_3.add(lblMKhchHng_1_1_2);

		Panel panel_4 = new Panel();
		panel_4.setBounds(44, 229, 352, 3);
		panel_3.add(panel_4);
		panel_4.setBackground(new Color(0, 0, 0));

		JLabel lblMKhchHng_1_1_2_1 = new JLabel("Thành Tiền");
		lblMKhchHng_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_2_1.setBounds(10, 258, 119, 23);
		panel_3.add(lblMKhchHng_1_1_2_1);

		InMaKH = new JLabel("");
		InMaKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		InMaKH.setBounds(233, 88, 163, 23);
		panel_3.add(InMaKH);

		InHoVaTen = new JLabel("");
		InHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		InHoVaTen.setBounds(233, 136, 163, 23);
		panel_3.add(InHoVaTen);

		InCanHoDaMua = new JLabel("");
		InCanHoDaMua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		InCanHoDaMua.setBounds(233, 189, 163, 23);
		panel_3.add(InCanHoDaMua);

		InThanhTien = new JLabel("");
		InThanhTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		InThanhTien.setBounds(233, 258, 163, 23);
		panel_3.add(InThanhTien);
	}
}
