package Enitity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class actor{
	
	@Id
	private int actor_id;
	
	private String name;
	
	@ManyToMany
	private List<movie> movies;

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<movie> getMovies() {
		return movies;
	}

	public void setMovies(List<movie> movies) {
		this.movies = movies;
	}
}