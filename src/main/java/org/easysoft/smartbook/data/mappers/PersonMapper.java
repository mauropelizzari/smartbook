package org.easysoft.smartbook.data.mappers;

import java.util.List;

import org.easysoft.smartbook.beans.Person;

public interface PersonMapper {

	List<Person> search();
	
	Person insert(Person entityToAdd);
}
