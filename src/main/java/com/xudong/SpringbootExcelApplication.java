package com.xudong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * excel的导入导出
* @Title: SpringbootExcelApplication 
* @Description:   
* @author xudong  
* @date 2019年3月14日
 */
@MapperScan("com.xudong.mapper")
@SpringBootApplication
public class SpringbootExcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExcelApplication.class, args);
	}

}
