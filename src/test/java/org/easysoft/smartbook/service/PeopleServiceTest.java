package org.easysoft.smartbook.service;

import static org.junit.Assert.assertTrue;

import org.easysoft.smartbook.beans.People;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PeopleService;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class PeopleServiceTest {

	
	@Test
	public void addPeople() {
		
		People people = new People();
		BaseService<People> service = new PeopleService();
		boolean result = service.save(people);
		assertTrue(result);
		
	}
}
