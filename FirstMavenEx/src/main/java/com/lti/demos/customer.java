package com.lti.demos;

public class customer {
	private int custno;
	private String custname;
	private double billamount;
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBillamount() {
		return billamount;
	}
	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	public customer(int custno, String custname, double billamount) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.billamount = billamount;
		
		
	}
	@Override
	public String toString() {
		return "customer [custno=" + custno + ", custname=" + custname + ", billamount=" + billamount + "]";

}
}
