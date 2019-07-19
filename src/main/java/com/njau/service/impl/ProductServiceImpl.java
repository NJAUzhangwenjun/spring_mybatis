package com.njau.service.impl;

import com.njau.dao.ProductDao;
import com.njau.domain.Product;
import com.njau.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1917:35
 */
@Service("productService")

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> selectAllProduct() {
		List<Product> products = productDao.selectAllProduct();
		return products;
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
//		int i = 1 / 0;
	}
}
