/**
 * 
 */
package com.Neon.Bean;

/**
 * @author user364
 *
 */
public class Registration {

	private int RegistStudId;
	private String RegistStatus;
	
	public int getRegistStudId() {
		return RegistStudId;
	}
	public void setRegistStudId(int registStudId) {
		RegistStudId = registStudId;
	}
	public String getRegistStatus() {
		return RegistStatus;
	}
	public void setRegistStatus(String registStatus) {
		RegistStatus = registStatus;
	}
	@Override
	public String toString() {
		return "Registration [RegistStudId=" + RegistStudId + ", RegistStatus=" + RegistStatus + "]";
	}
	public Registration(int registStudId, String registStatus) {
		super();
		RegistStudId = registStudId;
		RegistStatus = registStatus;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
