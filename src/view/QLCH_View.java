package view;

import java.awt.Choice;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class QLCH_View extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;
	private JTextField textField_8;
	private JTextField textField_9;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\icon.png"));
		setTitle("Quản Lý Căn Hộ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\open.png"));
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\save.png"));
		mnFile.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1264, 659);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Quản Lý Căn Hộ", new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\house.png"), panel, null);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Căn Hộ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 32, 122, 23);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(140, 32, 196, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(140, 80, 196, 23);
		panel.add(textField_1);
		
		JLabel lblGiTin = new JLabel("Giá Tiền");
		lblGiTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiTin.setBounds(10, 80, 100, 23);
		panel.add(lblGiTin);
		
		JLabel lblLoiCn = new JLabel("Loại Căn");
		lblLoiCn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLoiCn.setBounds(10, 133, 86, 23);
		panel.add(lblLoiCn);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(651, 32, 196, 23);
		panel.add(textField_3);
		
		JLabel lblDinTch = new JLabel("Diện Tích");
		lblDinTch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinTch.setBounds(521, 32, 121, 23);
		panel.add(lblDinTch);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(651, 80, 196, 23);
		panel.add(textField_4);
		
		JLabel lblSTng = new JLabel("Số Tầng");
		lblSTng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSTng.setBounds(521, 80, 121, 23);
		panel.add(lblSTng);
		
		JLabel lblBanCng = new JLabel("Ban Công");
		lblBanCng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBanCng.setBounds(521, 133, 121, 23);
		panel.add(lblBanCng);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách Căn Hộ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 188, 205, 27);
		panel.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Có");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(651, 133, 100, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxKhng = new JCheckBox("Không");
		chckbxKhng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxKhng.setBounds(766, 133, 100, 23);
		panel.add(chckbxKhng);
		
		Choice choice = new Choice();
		choice.setBounds(140, 136, 196, 79);
		panel.add(choice);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\+.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(10, 524, 131, 50);
		panel.add(btnNewButton);
		
		JButton btnTm = new JButton("Tìm");
		btnTm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTm.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\find.png"));
		btnTm.setBounds(364, 30, 107, 33);
		panel.add(btnTm);
		
		JButton btnChnhSa = new JButton("Chỉnh sửa");
		btnChnhSa.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\edit.png"));
		btnChnhSa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChnhSa.setBounds(151, 524, 196, 50);
		panel.add(btnChnhSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\delete.png"));
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnXa.setBounds(357, 524, 131, 50);
		panel.add(btnXa);
		
		JButton btnNewButton_3 = new JButton("Sắp Xếp");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\arrange.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBounds(498, 524, 171, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Căn hộ đã bán");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\list.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_4.setBounds(679, 524, 238, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Căn hộ còn lại");
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\list.png"));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_4_1.setBounds(927, 524, 253, 50);
		panel.add(btnNewButton_4_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "M\u00E3 c\u0103n h\u1ED9"
			}
		));
		table.setBounds(10, 226, 1239, 285);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Quản Lý Khách Hàng", new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\user1.png"), panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblMKhchHng = new JLabel("Mã Khách Hàng");
		lblMKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng.setBounds(10, 33, 163, 23);
		panel_1.add(lblMKhchHng);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(183, 33, 210, 23);
		panel_1.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(183, 81, 210, 23);
		panel_1.add(textField_5);
		
		JLabel lblHVTn = new JLabel("Họ và Tên");
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHVTn.setBounds(10, 81, 100, 23);
		panel_1.add(lblHVTn);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(720, 33, 196, 23);
		panel_1.add(textField_6);
		
		JLabel lblDinTch_1 = new JLabel("Email");
		lblDinTch_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinTch_1.setBounds(590, 33, 65, 23);
		panel_1.add(lblDinTch_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(720, 81, 196, 23);
		panel_1.add(textField_7);
		
		JLabel lblSTng_1 = new JLabel("Mã Căn mua");
		lblSTng_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSTng_1.setBounds(590, 81, 120, 27);
		panel_1.add(lblSTng_1);
		
		JLabel lblSinThoi = new JLabel("Số Điện Thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSinThoi.setBounds(10, 134, 149, 23);
		panel_1.add(lblSinThoi);
		
		JLabel lblNewLabel_1_1 = new JLabel("Danh sách Khách Hàng");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(10, 189, 408, 27);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\+.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(10, 525, 131, 50);
		panel_1.add(btnNewButton_1);
		
		JButton btnTm_1 = new JButton("Tìm");
		btnTm_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTm_1.setBounds(421, 28, 107, 33);
		panel_1.add(btnTm_1);
		
		JButton btnChnhSa_1 = new JButton("Chỉnh sửa");
		btnChnhSa_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\edit.png"));
		btnChnhSa_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChnhSa_1.setBounds(151, 525, 196, 50);
		panel_1.add(btnChnhSa_1);
		
		JButton btnXa_1 = new JButton("Xóa");
		btnXa_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\delete.png"));
		btnXa_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnXa_1.setBounds(357, 525, 131, 50);
		panel_1.add(btnXa_1);
		
		JButton btnNewButton_3_1 = new JButton("Sắp Xếp");
		btnNewButton_3_1.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\list.png"));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3_1.setBounds(498, 525, 171, 50);
		panel_1.add(btnNewButton_3_1);
		
		table_1 = new JTable();
		table_1.setBounds(10, 227, 1239, 285);
		panel_1.add(table_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(183, 134, 210, 23);
		panel_1.add(textField_8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Quản Lý Hóa Đơn", new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\HD.png"), panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblMKhchHng_1 = new JLabel("Mã Khách Hàng");
		lblMKhchHng_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1.setBounds(10, 60, 163, 23);
		panel_2.add(lblMKhchHng_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(183, 60, 210, 23);
		panel_2.add(textField_9);
		
		JButton btnNewButton_2 = new JButton("In Hóa Đơn");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Son\\OneDrive - VNU-HCMUS\\Desktop\\TN\\print.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(78, 111, 210, 57);
		panel_2.add(btnNewButton_2);
		
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
		
		JLabel lblMKhchHng_1_1_3 = new JLabel("");
		lblMKhchHng_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_3.setBounds(233, 88, 163, 23);
		panel_3.add(lblMKhchHng_1_1_3);
		
		JLabel lblMKhchHng_1_1_4 = new JLabel("");
		lblMKhchHng_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_4.setBounds(233, 136, 163, 23);
		panel_3.add(lblMKhchHng_1_1_4);
		
		JLabel lblMKhchHng_1_1_5 = new JLabel("");
		lblMKhchHng_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_5.setBounds(233, 189, 163, 23);
		panel_3.add(lblMKhchHng_1_1_5);
		
		JLabel lblMKhchHng_1_1_6 = new JLabel("");
		lblMKhchHng_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMKhchHng_1_1_6.setBounds(233, 258, 163, 23);
		panel_3.add(lblMKhchHng_1_1_6);
	}
}
