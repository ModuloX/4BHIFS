/**
 * 
 */
package modulo.school.xml.jaxbtest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException; import
javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import modulo.school.xml.jaxb.*;
import modulo.school.xml.jaxb.Character;
/**
 * @author ModuloX
 *
 */
public class ServerTest {

	private static final String SERVER_XML ="./server-jaxb.xml";
	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Character> charlist = new ArrayList<Character>();
		
		//create Characters
		Character char1 = new Character();
		char1.setName("Eramor");
		char1.setRace("Undead");
		char1.setCl("Warlock");
		char1.setLevel(90);
		char1.setGender("male");
		char1.setCreator("ModuloX");
		charlist.add(char1);
		
		Character char2 = new Character();
		char2.setName("Caelestis");
		char2.setRace("Bloodelf");
		char2.setCl("Priest");
		char2.setLevel(90);
		char2.setGender("female");
		char2.setCreator("Makaki");
		charlist.add(char2);
		
		//create Server, assigning characters
		Server server = new Server();
		server.setName("TestServer");
		server.setIp_adr("153.112.252.112");
		server.setCharacterList(charlist);
		
		//create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(Server.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		//Write to System.out
		m.marshal(server, System.out);
		
		//Write to File
		m.marshal(server, new File(SERVER_XML));
		
		//get variable from the xml file, created in the lines above
		System.out.println();
		System.out.println("Output from the xml file");
		Unmarshaller um = context.createUnmarshaller();
		Server server2 = (Server)um.unmarshal(new FileReader(SERVER_XML));
		ArrayList<Character> list = server2.getCharacterList();
		for(Character c:list){
			System.out.println();
			System.out.println(c.getName()+" @ "+server2.getName()+"\n\rLevel "+c.getLevel()+" "+c.getGender()+" "+c.getRace()+" "+c.getCl()+"\n\rCreated by: "+c.getCreator());
		}
	}

}
