package savefiletoDB.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name ="profileimage")

public class ProfileImage {
	
	@Id
	private String username;
	private String name;
	private byte[] photo;
	
	
	public ProfileImage(String username, String name, byte[] photo) {
		super();
		this.username = username;
		this.name = name;
		this.photo = photo;
	}
	
	public ProfileImage() {
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	
}
