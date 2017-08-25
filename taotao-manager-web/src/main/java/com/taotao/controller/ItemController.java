package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
public class ItemController {
		@Autowired
		ItemService itemService;
		
		@RequestMapping("/item/{itemId}")
		@ResponseBody
		public TbItem getItemById(@PathVariable Long itemId) {
			TbItem item = itemService.getItemById(itemId);
			
			return item;
		}
		
		@RequestMapping("/item/list")
		@ResponseBody
		public EUDataGridResult getItemList(Integer page,Integer rows){
			EUDataGridResult itemsList = itemService.getItemsList(page,rows);
			return itemsList;
			
		}

		
}