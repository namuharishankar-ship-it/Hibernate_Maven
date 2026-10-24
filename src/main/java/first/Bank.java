package first;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	private String bankname;
	@Id
	private int accountnumber;
	private String accountname;
	Bank(){
		
	}
	
	Bank(String a, int b, String c){
		this.bankname = a;
		this.accountnumber = b;
		this.accountname = c;
	}
	
	public void setBankName(String a) {
		this.bankname = a;
	}
	public void setAccountNo(int b) {
		this.accountnumber = b;
	}
	public void setAccountName(String c) {
		this.accountname = c;
	}
	
	public String getBankname() {
		return bankname;
	}
	public int getAccountno() {
		return accountnumber;
	}
	public String getAccountname() {
		return accountname;
	}
}
