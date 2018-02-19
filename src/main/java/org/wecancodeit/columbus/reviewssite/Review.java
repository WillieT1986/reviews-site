package org.wecancodeit.columbus.reviewssite;

public class Review {

	private long id;
	private String title;
	private String imageURL;
	private String category;
	private String content;
	private String description;

	public Review(long id, String title, String imageURL, String category, String content, String description) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.category = category;
		this.content = content;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}
}