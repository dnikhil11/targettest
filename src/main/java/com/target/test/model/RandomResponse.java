package com.target.test.model;

public class RandomResponse {

	private String status;
	private int txn_id;
	
	public RandomResponse(String status, int txn_id) {
		super();
		this.status = status;
		this.txn_id = txn_id;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(int txn_id) {
		this.txn_id = txn_id;
	}
	
	@Override
	public String toString() {
		return "RandomResponse [status=" + status + ", txn_id=" + txn_id + "]";
	}	
}
