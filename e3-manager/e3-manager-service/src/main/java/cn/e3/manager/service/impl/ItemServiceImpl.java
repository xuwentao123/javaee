package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService{

	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	
	/*
	 * 需求：根据商品id查询指定商品
	 * 参数；long itemid
	 * 返回值：TbItem
	 */
	@Override
	public TbItem findItemByID(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

}
