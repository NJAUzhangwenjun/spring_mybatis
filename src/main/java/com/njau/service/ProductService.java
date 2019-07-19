package com.njau.service;

import com.njau.domain.Product;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1917:34
 */
public interface ProductService {
	List<Product> selectAllProduct();

	void addProduct(Product product);
}
