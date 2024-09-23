package com.Revshop.p1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Revshop.p1.dao.ProductDAOImpl;
import com.Revshop.p1.dto.ProductRequest;
import com.Revshop.p1.dto.ProductResponse;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAOImpl productDAO;
	
	
	public boolean createProduct(ProductRequest productrequest) {
		return productDAO.createProduct(productrequest);
	}
	
	
	public ProductResponse getProductById(long productId) {
		return productDAO.getProductById(productId);
	}
	public ProductResponse getProductByName(String productName) {
		return productDAO.getProductByName(productName);
		
	}
	
	
	public boolean updateProductById(ProductRequest productrequest, long productId) {
		return productDAO.updateProductById(productrequest, productId);
	}
	
	public boolean deleteProduct(long productId) {
		return productDAO.deleteProduct(productId);
	}


	public List<ProductResponse> getAllProducts() {
		return productDAO.getAllProducts();
	}




}
