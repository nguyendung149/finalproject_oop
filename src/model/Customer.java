package model;

import java.util.Objects;

public class Customer {
	private String customerCode;
	private String name;
	private String email;
	private String phone;
	private CanHo canHoCanMua;

	public Customer(CanHo ch) {
		this.customerCode = "";
		this.name = "";
		this.email = "";
		this.phone = "";
		this.canHoCanMua = ch;
	}

	public Customer(String customerCode, String name, String email, String phone, CanHo ch) {
		this.customerCode = customerCode;
		this.name = name;
		this.email = email;
		this.canHoCanMua = ch;
		this.phone = phone;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the canHoCanMua
	 */
	public CanHo getCanHoCanMua() {
		return canHoCanMua;
	}

	/**
	 * @param canHoCanMua the canHoCanMua to set
	 */
	public void setCanHoCanMua(CanHo canHoCanMua) {
		this.canHoCanMua = canHoCanMua;
	}

	@Override
	public int hashCode() {
		return Objects.hash(canHoCanMua, customerCode, email, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(canHoCanMua, other.canHoCanMua) && Objects.equals(customerCode, other.customerCode)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", canHoCanMua=" + canHoCanMua + "]";
	}

}
