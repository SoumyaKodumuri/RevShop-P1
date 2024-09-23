package com.Revshop.p1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Revshop.p1.dto.ProductRequest;
import com.Revshop.p1.dto.ProductResponse;
import com.Revshop.p1.service.ProductService;

@RestController
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("add")
	public boolean createProduct(@RequestBody ProductRequest productrequest) {
		try {
			return productservice.createProduct(productrequest);
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@GetMapping
	public ProductResponse getProductById(@RequestParam long productId) {
		try {
		return productservice.getProductById(productId);
	}
		catch(Exception e) {
			return null;
		}
	}
	@GetMapping("name")
	public ProductResponse getProductByName(@RequestParam  String productName) {
		try {
			return productservice.getProductByName(productName);
		}
		catch (Exception e) {
			return null;		}
	}


	@PutMapping
	public boolean updateProductById(@RequestBody ProductRequest productrequest,@RequestParam long productId) {
		try {
			return productservice.updateProductById(productrequest, productId);
		}
		catch (Exception e) {
			return false;		}
		
	}
	@DeleteMapping
	public boolean deleteProduct(@RequestParam long productId) {
		try {
			return productservice.deleteProduct(productId);
		}
		catch (Exception e) {
			return false;		}
		
	}
	
	@GetMapping("all")
	public List<ProductResponse> getAllProducts() {
		try {
			return productservice.getAllProducts();
		}
		catch (Exception e) {
			return null;		}
	}

//	@GetMapping("searchProduct")
//	public String searchProducts(@RequestParam String query, Model model) {
//		
//	}



}
