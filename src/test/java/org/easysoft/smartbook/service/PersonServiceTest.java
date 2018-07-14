package org.easysoft.smartbook.service;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.function.Function;

import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PersonService;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
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
		List<Person> results = service.search();
		assertTrue(results.size()>0);
	}
	
//	@Test
//	public void getCecksum() throws IOException {
//		File contentFile = new File("C:\\Users\\mauropelizzari\\Desktop\\XXXX.pdf");
//		 byte[] bytesArray = new byte[(int) contentFile.length()]; 
//
//		  FileInputStream fis = new FileInputStream(contentFile);
//		  fis.read(bytesArray); //read file into bytes[]
//		  fis.close();
//		  
//		System.out.println(calcolaMD5(bytesArray));
//	}
//	
//	private String calcolaMD5(byte[] content)  {
//		try {
//
//
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			md.update(content);
//
//			byte[] digest = md.digest();
//
//			String printHexBinary = "";
//
//			for (int i=0; i < digest.length; i++) {
//				printHexBinary += Integer.toString( ( digest[i] & 0xff ) + 0x100, 16).substring( 1 );
//			}
//
//			System.out.println("printHexBinary="+printHexBinary.toUpperCase());
//
//			return printHexBinary.toUpperCase();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	
}
