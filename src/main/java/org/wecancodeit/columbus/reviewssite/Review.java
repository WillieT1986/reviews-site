package org.wecancodeit.columbus.reviewssite;

public class Review {

	private long iD;
	private String title;

	public Review(long iD, String title, String imageURL, String cATEGORY, String cONTENT, String dESCRIPTION) {
		this.iD = iD;
		this.title = title;
	}

	public long getId() {
		return iD;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return null;
	}

}
