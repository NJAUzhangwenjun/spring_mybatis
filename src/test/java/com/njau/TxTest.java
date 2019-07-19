package com.njau;

import com.njau.domain.Product;
import com.njau.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1918:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TxTest {
	@Autowired
	private ProductService productService;

	@Test
	public void findTset() {
		List<Product> products = productService.selectAllProduct();
		for (Product product : products) {
			System.out.println(product);
		}

	}

	@Test
	public void testAdd() {
		Product product = new Product();
		product.setName("麻辣条");
		product.setPrice(112f);
		productService.addProduct(product);
		findTset();
	}

}
