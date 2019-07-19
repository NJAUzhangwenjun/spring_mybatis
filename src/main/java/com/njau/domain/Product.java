package com.njau.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/1917:36
 */
@Data
public class Product implements Serializable {
	private String id;
	private String name;
	private Float price;
}
