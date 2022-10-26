/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class Payment {

	private int payId;
	private double payAmount;
	private String paymentStatus;
	private String paymentType;
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payAmount=" + payAmount + ", paymentStatus=" + paymentStatus
				+ ", paymentType=" + paymentType + "]";
	}
	public Payment(int payId, double payAmount, String paymentStatus, String paymentType) {
		super();
		this.payId = payId;
		this.payAmount = payAmount;
		this.paymentStatus = paymentStatus;
		this.paymentType = paymentType;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
