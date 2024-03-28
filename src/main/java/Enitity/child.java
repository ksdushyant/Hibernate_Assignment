package Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class child{
	
	public child(int child_id, String name) {
		super();
		this.child_id = child_id;
		this.name = name;
	}

	@Id
	private int child_id;
	
	private String name;

	public int getChild_id() {
		return child_id;
	}

	public void setChild_id(int child_id) {
		this.child_id = child_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}