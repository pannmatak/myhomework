package com.rupp.homework.dto;

public class PageableDto {
	private int rows = 10;
	private int page = 1;
	private String sord = "desc";
	private String sidx;
	
	private String user_id;
	private String coa_acc_code;
	private String bran_code;
	private String clas_code;
	private String prep_serial;
	private String accr_serial;
	
	private String  ref_data;
	private String cas_number;
	private String stu_code;
	
	public String getCas_number() {
		return cas_number;
	}
	public void setCas_number(String cas_number) {
		this.cas_number = cas_number;
	}
	public String getRef_data() {
		return ref_data;
	}
	public void setRef_data(String ref_data) {
		this.ref_data = ref_data;
	}
	public int getStartIndex() {
		return (getPage() - 1 ) * getRows() + 1;
	}
	public int getEndIndex() {
		return (getPage() - 1 ) * getRows() + getRows();
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public String getSord() {
		return sord;
	}
	public void setSord(String sord) {
		this.sord = sord;
	}
	
	public String getSidx() {
		return sidx;
	}
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getCoa_acc_code() {
		return coa_acc_code;
	}
	public void setCoa_acc_code(String coa_acc_code) {
		this.coa_acc_code = coa_acc_code;
	}
	
	public String getBran_code() {
		return bran_code;
	}
	public void setBran_code(String bran_code) {
		this.bran_code = bran_code;
	}
	
	public String getClas_code() {
		return clas_code;
	}
	public void setClas_code(String clas_code) {
		this.clas_code = clas_code;
	}
	
	public String getPrep_serial() {
		return prep_serial;
	}
	public void setPrep_serial(String prep_serial) {
		this.prep_serial = prep_serial;
	}
	
	public String getAccr_serial() {
		return accr_serial;
	}
	public void setAccr_serial(String accr_serial) {
		this.accr_serial = accr_serial;
	}
	
	public String getStu_code() {
		return stu_code;
	}
	public void setStu_code(String stu_code) {
		this.stu_code = stu_code;
	}
	
	@Override
	public String toString() {
		return "PageableDto [rows=" + rows + ", page=" + page + ", sord=" + sord + ", sidx=" + sidx + ", user_id="
				+ user_id + ", coa_acc_code=" + coa_acc_code + ", bran_code=" + bran_code + ", clas_code=" + clas_code
				+ ", prep_serial=" + prep_serial + ", accr_serial=" + accr_serial + ", ref_data=" + ref_data
				+ ", cas_number=" + cas_number + ", stu_code=" + stu_code + "]";
	}
	
}
