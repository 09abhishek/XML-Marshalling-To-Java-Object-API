package com.abhi;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XMLToJava {
	public static void main(String[] args)throws Exception {

		JAXBContext jc = JAXBContext.newInstance(Product.class);

		Unmarshaller u = jc.createUnmarshaller();

		File f = new File("D:\\ExternalFileLink\\product.xml");
		Product product = (Product) u.unmarshal(f);

		System.out.println(product.getCode());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	}
}

