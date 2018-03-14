package com.zhiyou100.wscrm.service.helllo;

import java.util.List;

import javax.jws.WebService;

import com.zhiyou100.wscrm.clint.model.Customer;

@WebService
public interface ICustomerService {
	
	/** 查询所有的客户  */
	public List<Customer> findAll();
	
	/** 查询 所有未关联的定区的客户  */
	public List<Customer> findListNotAssocation();
	
	/** 查询 所有关联的定区的客户  */
	public List<Customer> findListAssocation();

}
