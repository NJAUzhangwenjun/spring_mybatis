package com.njau;

import com.njau.dao.ProductDao;
import com.njau.domain.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1919:17
 */
public class TestMybatis {
	@Test
	public void select1() throws IOException {

		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = sessionFactory.openSession();
		ProductDao productDao = sqlSession.getMapper(ProductDao.class);

		List<Product> products = productDao.selectAllProduct();
		for (Product product : products) {
			System.out.println(product);
		}

		sqlSession.commit();
		sqlSession.close();
		inputStream.close();

	}

	@Test
	public void add() throws IOException {

		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		ProductDao productDao = sqlSession.getMapper(ProductDao.class);

		Product product = new Product();
		product.setName("橘子");
		product.setPrice(12f);

		productDao.addProduct(product);

		List<Product> products = productDao.selectAllProduct();
		for (Product product1 : products) {
			System.out.println(product1);
		}

		sqlSession.commit();
		sqlSession.close();
		inputStream.close();

	}
}
