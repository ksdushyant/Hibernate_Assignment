package Enitity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class parent{
	@Id
	private int parent_id;
	
	private String name;

	@OneToMany
	private List<child> children;
	
	public List<child> getChildren() {
		return children;
	}

	public void setChildren(List<child> children) {
		this.children = children;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}