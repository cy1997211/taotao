package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	
	TbItem getItemById(long id);
	EUDataGridResult getItemsList(int page,int rows);
	
}
