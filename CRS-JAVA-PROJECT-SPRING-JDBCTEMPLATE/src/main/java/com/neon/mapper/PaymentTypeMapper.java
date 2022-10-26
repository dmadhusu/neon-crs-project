/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.PaymentType;
import com.neon.bean.Professor;

/**
 * @author user364
 *
 */
public class PaymentTypeMapper implements RowMapper<PaymentType> {

	@Override
	public PaymentType mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		PaymentType paymentType=new PaymentType();
		paymentType.setStudentId(rs.getInt("studentId"));
		paymentType.setPaymentType(rs.getString("paymentType"));
		
	      return paymentType;
}
}