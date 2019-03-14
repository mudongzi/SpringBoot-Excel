package com.xudong.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xudong.mapper.BookService;
import com.xudong.pojo.Book;
import com.xudong.util.ImportExcel;

@RestController
public class ExcelController {
	@Resource
	private BookService service;
	@ResponseBody
	@RequestMapping("/save.action")
	public String save() throws Exception
	{
	    String sheetName="图书列表";
	    String titleName="我的图书";
	    String[] headers = { "图书id", "图书名称", "图书价格", "入库时间" };
	    List<Book> dataSet = service.selectBookList();
	    String resultUrl="E:\\book.xls";
	    String pattern="yyyy-MM-dd";
	    ExcelUtil.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);

	    return "success";
	}
	
	@ResponseBody
	@RequestMapping("/importExcel.action")
	public String importExcel() throws Exception
	{
	    String originUrl="E:\\book.xls";
	    int startRow=2;
	    int endRow=0;
	    List<Book> bookList = (List<Book>) ImportExcel.importExcel(originUrl, startRow, endRow, Book.class);
	    for (Book book : bookList) {
	        service.insertBook(book);
	    }

	    return "success";
}
}