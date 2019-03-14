package com.xudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.xudong.pojo.Book;
@Mapper
public interface BookService {
	
	@Select(value = { "select * from book" })
	public List<Book> selectBookList();
	@Insert(value = { "insert into book values(#{bookId},#{bookName},#{price},#{bookTime}) " })
	public void insertBook(Book book);
}
