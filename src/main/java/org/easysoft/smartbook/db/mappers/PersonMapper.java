package org.easysoft.smartbook.db.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.easysoft.smartbook.beans.Person;

public interface PersonMapper {

	@Insert("INSERT INTO PERSON(CODE, NAME, SURNAME) VALUES(#{code}, #{name}, #{surname})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	public void insert(Person person);
	
	
	@Select("SELECT * FROM PERSON")
	public List<Person> list(Person person);

}
