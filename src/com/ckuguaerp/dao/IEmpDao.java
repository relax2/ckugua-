package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.Emp;

public interface IEmpDao {
	
	/**
	 * 	�����û�����ѯ�û���Ϣ
	 * @param userPhone
	 * @return
	 * @throws Exception
	 */
	public Emp queryByEmpCode(String empCode) throws Exception;
	
	/**
	 *  ����Ա����Ϣ
	 * @param user
	 * @throws Exception
	 */
	public void addEmp(Emp emp) throws Exception;
	
	/**
	 * ��ѯԱ����Ϣ�б�
	 * @return
	 * @throws Exception
	 */
	public List<Emp> queryEmpss() throws Exception;
	
	/**
	 * ����id��ѯԱ����Ϣ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Emp queryById(Integer id) throws Exception;
	
	/**
	 * ����Ա��id�޸�Ա������״̬������ɾ��
	 * @param emp
	 * @throws Exception
	 */
	public void delEmp(Emp emp) throws Exception;
	
	/**
	 * �޸�Ա��������Ϣ
	 * @param emp
	 * @throws Exception
	 */
	public void updEmp(Emp emp) throws Exception;
	
}
