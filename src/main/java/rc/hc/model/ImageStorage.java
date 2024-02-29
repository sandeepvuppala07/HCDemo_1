package rc.hc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public class ImageStorage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long imgid;
	
	private String name;
	private String type;
	@Lob
	@Column(name="imagedata",length=1000)
	private byte[] imagedata;
	public long getImgid() {
		return imgid;
	}
	public void setImgid(long imgid) {
		this.imgid = imgid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getImagedata() {
		return imagedata;
	}
	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}
	
	
}
