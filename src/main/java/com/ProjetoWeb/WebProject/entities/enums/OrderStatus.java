package com.ProjetoWeb.WebProject.entities.enums;

public enum OrderStatus {

	Waiting_Payment(1),
	paid(2),
	shipped(3),
	delivered(4),
	canceled(5);
	
	private int code;
	private OrderStatus(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo invalido");
	}
}
