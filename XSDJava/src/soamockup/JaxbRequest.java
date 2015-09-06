package soamockup;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import xsd.jaxb.request.RootType;

public class JaxbRequest{

	public static void main(String[] args) {

		

		try {
			
			File file = new File("./schemas/test.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(RootType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			RootType rt = (RootType) jaxbUnmarshaller.unmarshal(file);
			
			
			System.out.println(rt.toString());
			// output pretty printed
		

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
