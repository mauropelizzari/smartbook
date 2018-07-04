package org.easysoft.smartbook.service;

import static org.junit.Assert.assertTrue;

import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PersonService;
import org.junit.Test;

public class PersonServiceTest {


	@Test
	public void addPerson() {
		Person p = new Person();
		p.setCode("XYZ");
		p.setName("Mauro");
		p.setSurname("Pelizzari");
		BaseService<Person> service = new PersonService();
		boolean result = service.save(p);
		assertTrue(result);
	}
}
