/**
 * Imports
 */
package com;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author Aashish Bansal
 *
 */
public class CustomerXMLToObject {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\aashi\\GitHub\\My Repositories\\REST-API\\MyRESTAPI\\src\\resources\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
