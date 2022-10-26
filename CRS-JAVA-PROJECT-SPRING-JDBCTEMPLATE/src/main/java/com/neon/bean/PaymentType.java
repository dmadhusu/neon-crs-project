/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class PaymentType {

	private int studentId;
	private String paymentType;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "PaymentType [studentId=" + studentId + ", paymentType=" + paymentType + "]";
	}
	
	
}
