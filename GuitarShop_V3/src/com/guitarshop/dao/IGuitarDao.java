package com.guitarshop.dao;

import java.util.List;

import com.guitarshop.domain.Guitar;
import com.guitarshop.domain.GuitarSpec;

/**
 * GuitarDao ���ݿ���ʲ㣬�ӿ�
 * 
 * @author gyt
 */
public interface IGuitarDao {

	/**
	 * ��Ӽ�������
	 * 
	 * @return
	 */
	public void addGuitar(Guitar guitar);

	/**
	 * ƥ��/��ѯ����
	 * @return
	 */
	public List<Guitar> searchGuitar();

	/**
	 * ɾ�����ݿ��ж�Ӧ��Guirtar��ͨ��serialNunmberɾ��
	 * 
	 * @param serialNumber
	 *        ���к�
	 * @return
	 */
	public void delGuitar(String serialNumber);

}
