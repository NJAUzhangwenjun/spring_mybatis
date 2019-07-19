package com.njau.dao;

import com.njau.domain.Product;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1917:44
 */
public interface ProductDao {
	List<Product> selectAllProduct();

	void addProduct(Product product);
}
