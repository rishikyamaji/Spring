package sample_repository;

import java.util.List;

import spring_sample_model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

	



}