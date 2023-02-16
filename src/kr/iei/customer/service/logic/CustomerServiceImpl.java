package kr.iei.customer.service.logic;

import java.util.List;

import kr.iei.customer.domain.Customer;
import kr.iei.customer.service.CustomerService;
import kr.iei.customer.store.CustomerStore;
import kr.iei.customer.store.logic.CustomerStoreLogic;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerStore cStore;
	
	// 1. setter메소드를 이용한 의존성 주입
	// CustomerStore cStore = new CustomerStoreLogic(); 을 spring-context.xml의
	// <property name="store" ref="customerStore"></property> 가 대신함
	public void setStore(CustomerStore cStore) {
		this.cStore = cStore;
	}
	
	public CustomerServiceImpl() {
		// cStore = new CustomerStoreLogic();
	}
	// 2. 생성자를 이용한 의존성 주입
	// <property~></property> 대신 <constructor-arg ref="customerStore" /> 작성
	public CustomerServiceImpl(CustomerStore cStore) {
		this.cStore = cStore;
	}
		
	@Override
	public Customer findOneById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> cList = cStore.selectAllCustomers();
		return cList;
	}

}
