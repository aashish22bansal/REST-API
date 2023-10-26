/**
 * Imports
 */
package com;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Aashish Bansal
 *
 */
public class JAXBCustomerExample {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1456732);
		customer.setName("IBM Pvt India Ltd");
		customer.setAge(108);
		try {
			File file = new File("C:\\Users\\aashi\\GitHub\\My Repositories\\REST-API\\MyRESTAPI\\src\\resources\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
