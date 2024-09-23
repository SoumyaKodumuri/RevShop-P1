package com.Revshop.p1.dao;

import java.util.List;

import com.Revshop.p1.dto.ProductRequest;
import com.Revshop.p1.dto.ProductResponse;

public interface ProductDao {
	
	boolean createProduct(ProductRequest productrequest);
	public ProductResponse getProductById(long productId);
	public ProductResponse getProductByName(String productName);
	
	boolean updateProductById(ProductRequest productrequest, long productId);
     
	boolean deleteProduct(long productId);
	public List<ProductResponse> getAllProducts() ;
}
