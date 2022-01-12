package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_info_tbl")
public class AddressEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//auto-increment
	@Column(name="id")
	private int customerID;
	
	@Column(name="first_name")
	private String customerFirstName;
	
	@Column(name="last_name")
	private String customerLastName;
	
	@Column(name="address")
	private String customerAddress;

	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressEntity( String customerFirstName, String customerLastName, String customerAddress) {
		super();
		
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "AddressPojo [customerID=" + customerID + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
	
	
}
