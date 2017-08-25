package com.taotao.common.pojo;

import java.util.List;

public class EUDataGridResult {
	
	//将数据库查询出的结果集 封装成eu需要的值类型
	
	private long total;//eu的总行数
	private List<?> rows;//euGrid每行的值
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
