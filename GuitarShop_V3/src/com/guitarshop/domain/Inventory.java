/**
 * 
 */
package com.guitarshop.domain;

import java.util.ArrayList;
import java.util.List;
import com.guitarshop.domain.Guitar;

/**
 * 仓库类 存在业务 即 添加 、删除、查询吉他
 * 
 * @author gyt
 *
 */
public class Inventory
{
	private List<Guitar> guitars;

	public Inventory()
	{
		guitars = new ArrayList<Guitar>();
	}

	// 添加吉他方法
	public void addGuitar(Guitar guitar)
	{
		guitars.add(guitar);
	}

	// 查询吉他方法
	public List<Guitar> searchGuitar()
	{
		return guitars;
	}

	// 删除吉他方法
	public void delGuitar(String serialNumber)
	{

	}

}
