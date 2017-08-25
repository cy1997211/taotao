package com.taotao.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.*;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemCatService;
import com.taotao.service.ItemService;
import com.taotao.service.impl.ItemCatServiceImpl;
import com.taotao.service.impl.ItemServiceImpl;

public class TestPageHelper {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

	@Test
	public void testPageHelper(){
		//创建一个spring的容器
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		
		TbItemExample example = new TbItemExample();
		
		PageHelper.startPage(1, 8);//分页设置 设在查询之前 mybatis里的过滤器 
		
		List<TbItem> list = mapper.selectByExample(example);
		
		for(TbItem item : list){
			System.out.println(item.getTitle());
			
		}
		
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);//注意list 
		long total = pageInfo.getTotal();
		System.out.println("商品总数量为："+total);
		
	}
	
	
	@Test
	public void testPageHelper2(){
		//创建一个spring的容器
		ItemService bean = applicationContext.getBean(ItemService.class);
		
		System.out.println(bean.getItemById(2222222));
		
	}
	
	
	@Test
	public void testItemCat(){
		//创建一个spring的容器
		ItemCatService bean = applicationContext.getBean(ItemCatService.class);
		
		List<EUTreeNode> list = bean.getItemCatList(1);
		
		for(EUTreeNode i : list){
			System.out.println(i.getId()+","+i.getState()+","+i.getText());
			
		}
		
	}
}













