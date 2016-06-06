/**
 * 
 */
package com.guitarshop.dao;

import com.guitarshop.mysqlDao.MysqlGuitarDaoImpl;
import com.guitarshop.sqliteDao.SqliteGuitarDaoImpl;

/**
 * Dao�Ĺ������������л�����Դ
 * 
 * @author gyt
 *
 */
public class DaoFactory
{

	// private static String db="sqlite";
	private static String db = "mysql";

	public static IGuitarDao createGuitarDao()
	{
		IGuitarDao test = null;
		switch (db)
		{
		case "sqlite":
			test = new SqliteGuitarDaoImpl();
			break;
		case "mysql":
			test = new MysqlGuitarDaoImpl();
			break;
		}
		return test;

	}

}
