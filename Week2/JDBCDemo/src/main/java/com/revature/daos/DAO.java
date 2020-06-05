package com.revature.daos;

import java.io.Serializable;
import java.util.List;

public interface DAO<T, I extends Serializable> {
// REMEMBER, we use interfaces to create abstract methods that's shared across classes
// a class can implement many interfaces, but it can only extend ONE class.
	
	List<T> findAll();
	T findById(I id);
	T create(T obj);
	T update(T obj);
	// optional to create a T delete(T obj)
	
	/*
	 * I am adding default methods so that we can instantiate
	 * DAO concrete classes with a REFERENCE to the DAO interface
	 * and override these methods;
	 */
}
