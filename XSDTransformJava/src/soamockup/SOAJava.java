package soamockup;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xsd.jaxb.input.PurchaseOrderType;
import xsd.jaxb.output.WebMessageType;


public class SOAJava {

	public static void main(String[] args) {
		try {

			File file = new File("./xmlSamples/inputPO.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseOrderType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PurchaseOrderType pot = (PurchaseOrderType) jaxbUnmarshaller.unmarshal(file);

			System.out.println(pot.toString());
			
			
			
			
			
			
			//prepare reply
			WebMessageType reply = new WebMessageType();
			//reply.setName(root.getFirstName() + " " +root.getLastName());
			//reply.setAddress(root.getAddress());
			
			
			JAXBContext jaxbContextReply = JAXBContext.newInstance(WebMessageType.class);
			Marshaller jaxbMarshaller = jaxbContextReply.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			File fileResponse = new File("./schemas/output.xml");
			jaxbMarshaller.marshal(reply, fileResponse);
			jaxbMarshaller.marshal(reply, System.out);
		
			
			

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
