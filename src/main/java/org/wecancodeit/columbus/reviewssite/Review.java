package org.wecancodeit.columbus.reviewssite;

public class Review {

	private long iD;
	private String title;
	private String imageURL;
	private String category;
	private String content;

	public Review(long iD, String title, String imageURL, String category, String content, String dESCRIPTION) {
		this.iD = iD;
		this.title = title;
		this.imageURL = imageURL;
		this.category = category;
		this.content = content;
	}

	public long getId() {
		return iD;
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

}
