package soamockup;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import xsd.jaxb.input.PurchaseOrderType;

public class JaxbRequest {

	public static void main(String[] args) {

		try {

			File file = new File("./xmlSamples/inputPO.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseOrderType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PurchaseOrderType pot = (PurchaseOrderType) jaxbUnmarshaller.unmarshal(file);

			System.out.println(pot.toString());
			// output pretty printed

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
