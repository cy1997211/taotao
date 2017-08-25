package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUTreeNode;

/**
 * 后台管理系统 内容管理 
 * @author Administrator
 *
 */
public interface ContentCategoryService {
	//将tb_content_category初始化 返回一颗树
	List<EUTreeNode> getCatgeoryList(Long parentId);
}
