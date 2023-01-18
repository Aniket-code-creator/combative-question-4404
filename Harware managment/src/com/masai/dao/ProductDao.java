package com.masai.dao;

import com.masai.exception.SoftwareException;
import com.masai.model.Product;

public interface ProductDao {
	
	//fine grain details
	public String insertProductDetails(int ProductId, String ProductName, int ProductQuantity, String ProductDesc,String ProductCategory);

	
	//coarse grain details;
	public String insertProductDetails1 (Product product) throws SoftwareException;
	
	
	
	
	
}
