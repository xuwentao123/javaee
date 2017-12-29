package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class ItemController {

	//注入service的接口代理对象
	@Autowired
	private ItemService itemService;

	/*
	 * 需求：根据商品id查询指定商品
	 * 参数；long itemid
	 * 返回值：TbItem
	 */
	@RequestMapping("item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		return itemService.findItemByID(itemId);
	}
}
