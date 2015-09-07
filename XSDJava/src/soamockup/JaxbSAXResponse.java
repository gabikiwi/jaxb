package soamockup;

import java.io.File;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class JaxbSAXResponse {

	public static void main(String[] args) {

		try {

			
			String parserClass = "org.apache.crimson.parser.XMLReaderImpl";			
			XMLReader reader = XMLReaderFactory.createXMLReader(parserClass);
			SAXSource source = new SAXSource(reader, new InputSource("./schemas/input1.xml"));
			
			
			File transformFile = new File("./xslt/input_to_output.xsl");
			Source xsl = new StreamSource(transformFile);
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(xsl);
			
			StreamResult result = new StreamResult(System.out);
			
			transformer.transform(source, result);

		}

		catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
