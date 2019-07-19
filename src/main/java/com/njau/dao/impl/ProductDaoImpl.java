package com.njau.dao.impl;

import com.njau.dao.ProductDao;
import com.njau.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1917:45
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> selectAllProduct() {
		System.out.println("获取了Product");
		List<Product> products = jdbcTemplate.query("select * from product ",new BeanPropertyRowMapper<Product>(Product.class));
		return products;
	}

	@Override
	public void addProduct(Product product) {
		System.out.println("插入数据------------------------------------------");
		jdbcTemplate.update("insert into product(name, price) values (?,?)", product.getName(), product.getPrice());
	}
}
