/**
 * 
 */
package modulo.school.xml.jaxb;
import javax.xml.bind.annotation.*;
/**
 * @author ModuloX
 */
@XmlRootElement(name = "Character")
public class Character {
	private String name;
	private String race;
	private String cls;
	private String creator;
	private String level;
	private String gender;
	
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name = "race")
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	@XmlElement(name = "class")
	public String getCl() {
		return cls;
	}
	
	public void setCl(String cl) {
		this.cls = cl;
	}
	@XmlAttribute(name = "creator")
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	@XmlElement(name = "level")
	public int getLevel() {
		return Integer.parseInt(level);
	}
	
	public void setLevel(int level) {
		this.level = level+"";
	}
	@XmlElement(name = "gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
