package org.wecancodeit.columbus.reviewssite;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewID = 101L;
	private Review firstReview = new Review(firstReviewID, "first title", "imageURL 1", "first category", "content 1",
			"descritpion of first review");

	private long secondReviewID = 201L;
	private Review secondReview = new Review(secondReviewID, "second title", "imageURL 2", "second category",
			"content 2", "descritpion of second review");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewID);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Review result = underTest.findOne(secondReviewID);
		assertThat(result, is(secondReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}

}