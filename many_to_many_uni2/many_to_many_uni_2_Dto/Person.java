package many_to_many_uni_2_Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Language> getList() {
		return list;
	}
	public void setList(List<Language> list) {
		this.list = list;
	}
	private String name;
	private String adress;
	private long phone;
	@ManyToMany
	private List<Language>list;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + ", list=" + list
				+ "]";
	}
	

}
