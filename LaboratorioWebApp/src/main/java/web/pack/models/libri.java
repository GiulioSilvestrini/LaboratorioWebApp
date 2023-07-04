package web.pack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class libri {
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String content;
    private int like;

	public libri() {
		super();
	}

	public libri(String title, String content, int like) {
		super();
		this.title = title;
		this.content = content;
		this.like = like;
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

	public String getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}
}