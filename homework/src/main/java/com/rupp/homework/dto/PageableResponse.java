package com.rupp.homework.dto;

import java.util.List;

public class PageableResponse <T> {
	private int page;
	private int total;
	private int records;
	private List<T> rows;
	
	public PageableResponse() { }
	
	public PageableResponse(PageableDto pageable, int count, List<T> list) { 
		int pageCount = (int) Math.ceil((double)count / pageable.getRows());
		
		setPage(pageable.getPage());
		setTotal(pageCount);
		setRecords(count);
		setRows(list);
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageableResponse [page=" + page + ", total=" + total + ", records=" + records + ", rows=" + rows + "]";
	}

}
