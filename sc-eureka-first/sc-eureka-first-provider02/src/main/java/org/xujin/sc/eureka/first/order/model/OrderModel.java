package org.xujin.sc.eureka.first.order.model;

import java.util.Date;

import lombok.Data;

@Data
public class OrderModel {
	private Long orderNo;
	private Date createTime;
	private Date payTime;

}
