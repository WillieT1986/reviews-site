package org.wecancodeit.columbus.reviewssite;

public class Review {

	private long courseID;
	private String title;
	private String imageURL;
	private String category;
	private String content;
	private String description;

	public Review(long courseID, String title, String imageURL, String category, String content, String description) {
		this.courseID = courseID;
		this.title = title;
		this.imageURL = imageURL;
		this.category = category;
		this.content = content;
		this.description = description;
	}

	public long getCourseID() {
		return courseID;
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
