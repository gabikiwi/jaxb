package soamockup;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xsd.jaxb.reply.ReplyType;
import xsd.jaxb.request.RootType;

public class JaxbResponse {

	public static void main(String[] args) {

		try {
			File file = new File("./schemas/test.xml");
			JAXBContext jaxbContext;

			jaxbContext = JAXBContext.newInstance(RootType.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			RootType root = (RootType) jaxbUnmarshaller.unmarshal(file);
			
			
			//prepare reply
			ReplyType reply = new ReplyType();
			reply.setName(root.getFirstName() + " " +root.getLastName());
			reply.setAddress(root.getAddress());
			
			File fileResponse = new File("./schemas/output.xml");
			JAXBContext jaxbContextReply = JAXBContext.newInstance(ReplyType.class);
			Marshaller jaxbMarshaller = jaxbContextReply.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(reply, fileResponse);
			jaxbMarshaller.marshal(reply, System.out);
			
			
		}

		catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
