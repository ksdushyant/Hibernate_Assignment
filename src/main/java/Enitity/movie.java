package Enitity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class movie{
	

	@Id
	private int movie_id;
	
	private String name;
	
	@ManyToMany
	private List<actor> actors;

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<actor> getActors() {
		return actors;
	}

	public void setActors(List<actor> actors) {
		this.actors = actors;
	}
}