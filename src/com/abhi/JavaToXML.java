package com.abhi;

import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXML {
	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Product.class);

		Marshaller m = context.createMarshaller();

		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Product object = new Product();
		object.setCode("WI1");
		object.setName("Widget Number One");
		object.setPrice(BigDecimal.valueOf(300.00));

		m.marshal(object, System.out);
	}
}