package web.pack.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Recensioni {
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String content;
    private int numlike;

	public Recensioni() {
		super();
	}

	public Recensioni(Long id, String title, String content, int numlike) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.numlike = numlike;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLike() {
		return numlike;
	}

	public void setLike(int numlike) {
		this.numlike = numlike;
	}
}