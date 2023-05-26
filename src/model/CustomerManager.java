package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerManager {
	private ArrayList<Customer> customers;

	public CustomerManager() {
		customers = new ArrayList<Customer>();
	}

	// Xem danh sách khách hàng
	public void showCustomers() {
		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	// Thêm khách hàng
	public void addCustomer(String customerCode, String name, String email, String phone, CanHo ch) {
		Customer c = new Customer(customerCode, name, email, phone, ch);
		customers.add(c);
	}

	// Chỉnh sửa thông tin khách hàng
	public void editCustomer(String customerCode, String name, String email, String phone, CanHo ch) {
		for (Customer c : customers) {
			if (c.getCustomerCode().equals(customerCode)) {
				c.setName(name);
				c.setEmail(email);
				c.setPhone(phone);
				c.setCanHoCanMua(ch);
			}
		}
	}

	// Xóa thông tin khách hàng
	public void deleteCustomer(String customerCode) {
		Customer cToRemove = null;
		for (Customer c : customers) {
			if (c.getCustomerCode().equals(customerCode)) {
				cToRemove = c;
			}
		}

		if (cToRemove != null) {
			customers.remove(cToRemove);
		}
	}

	// Tìm kiếm khách hàng theo mã khách hàng
	public Customer findCustomer(String customerCode) {
		for (Customer c : customers) {
			if (c.getCustomerCode().equals(customerCode)) {
				return c;
			}
		}

		return null;
	}

	// Sắp xếp khách hàng theo mã khách hàng
	public void sortByCustomerCode() {
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getCustomerCode().compareTo(c2.getCustomerCode());
			}
		});
	}

}
