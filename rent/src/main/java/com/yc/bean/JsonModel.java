package com.yc.bean;

import java.io.Serializable;
import java.util.List;

public class JsonModel<T> implements Serializable {

	private static final long serialVersionUID = -2954055469314992140L;
	private Integer code;
	private String msg;
	private Object obj;

	private Integer total;// 总共的页数
	private Integer page;// 当前页
	private Integer pagesize;// 每页多少条
	private List<T> rows;// 记录集合
	public JsonModel() {

	}
	public JsonModel(Integer code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "JsonModel [code=" + code + ", msg=" + msg + ", obj=" + obj
				+ ", total=" + total + ", page=" + page + ", pagesize="
				+ pagesize + ", rows=" + rows + "]";
	}

}
