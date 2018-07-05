package org.easysoft.smartbook.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PersonService;
import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class PersonServiceTest {


	@Test
	public void insert() {
		Person p = new Person();
		p.setCode("XYZ");
		p.setName("Mauro");
		p.setSurname("Pelizzari");
		BaseService<Person> service = new PersonService();
		boolean result = service.insert(p);
		assertTrue(result);
	}

	@Test
	public void list() {
		Person p = new Person();
		BaseService<Person> service = new PersonService();
		List<Person> results = service.list(p);
		assertTrue(results.size()>0);
	}
}
