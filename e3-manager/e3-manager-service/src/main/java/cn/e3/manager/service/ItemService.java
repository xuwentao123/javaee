package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/*
	 * 需求：根据商品id查询指定商品
	 * 参数；long itemid
	 * 返回值：TbItem
	 */
	public TbItem findItemByID(Long itemId);
}
