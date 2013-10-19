/**
 * 
 */
package modulo.school.xml.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;
/**
 * @author ModuloX
 *
 */
@XmlRootElement
public class Server {

	//Writing the Annotations to the Attributes is not a good idea, because JAXB uses the getters which leads to double entries and errors such as "two properties with the same name"
	private ArrayList<Character> characterLists;
	private String name;
	private String ip_adr;
	
	@XmlElementWrapper(name = "CharacterList")
	@XmlElement(name = "character")
	public ArrayList<Character> getCharacterList() {
		return characterLists;
	}
	
	public void setCharacterList(ArrayList<Character> characterList) {
		this.characterLists = characterList;
	}
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute(name = "IP")
	public String getIp_adr() {
		return ip_adr;
	}
	
	public void setIp_adr(String ip_adr) {
		this.ip_adr = ip_adr;
	}
	
	
}
