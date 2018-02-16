package org.wecancodeit.columbus.reviewssite;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewID = 101L;
	private Review firstReview = new Review(firstReviewID, "first title", "imageURL 1", "first category", "content 1",
			"descritpion of first review");

	private long secondReviewID = 201L;
	private Review secondReview = new Review(secondReviewID, "second title", "imageURL 2", "second category",
			"content 2", "descritpion of second review");

}