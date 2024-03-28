package Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Badge{
	
	@Id
	private int badge_id;
	
	private String access_level;
	
	@OneToOne(mappedBy = "access_level")
	private emp emp_id;

	public emp getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(emp emp_id) {
		this.emp_id = emp_id;
	}

	public int getId() {
		return badge_id;
	}

	public void setId(int badge_id) {
		this.badge_id = badge_id;
	}

	public String getBadge() {
		return access_level;
	}

	public void setBadge(String access_level) {
		this.access_level = access_level;
	}
	
	
	
}