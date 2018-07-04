package org.easysoft.smartbook.db.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.easysoft.smartbook.beans.Person;

public interface PersonMapper {

	@Insert("INSERT INTO PERSON(CODE, NAME, SURNAME) VALUES(#{code}, #{name}, #{surname})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	public void insert(Person person);

}
