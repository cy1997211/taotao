package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long id) {
//		TbItemMapper itemMapper = new TbItemMapper();
		TbItem i = itemMapper.selectByPrimaryKey(id);
		
		return i;
	}

	@Override
	public EUDataGridResult getItemsList(int page,int rows) {
		EUDataGridResult result = new EUDataGridResult();
		
		TbItemExample example = new TbItemExample();
		
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		
		result.setRows(list);
		
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		result.setTotal(pageInfo.getTotal());
		
		return result;
	}
	
	

	
	

}












