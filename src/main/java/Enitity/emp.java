package Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class emp{
	@Id
	private int emp_id;
	
	private String job_title;
	
	@OneToOne
	private Badge access_level;

	public int getId() {
		return emp_id;
	}

	public void setId(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getjob_title() {
		return job_title;
	}

	public void setjob_title(String job_title) {
		this.job_title = job_title;
	}

	public Badge getaccess_level() {
		return access_level;
	}

	public void setaccess_level(Badge access_level) {
		this.access_level = access_level;
	}
	
	
}