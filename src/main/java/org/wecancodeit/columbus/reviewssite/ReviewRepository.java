package org.wecancodeit.columbus.reviewssite;

import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review anime = new Review(1L, "Anime", "imageURL", "Anime Content", "Anime Category", "Anime Description");
		Review game = new Review(2L, "Game", "imageURL", "Game Content", "Game Category", "Game Description");

		reviews.put(anime.getCourseID(), anime);
		reviews.put(game.getCourseID(), game);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getCourseID(), review);
		}
	}

	public Review findOne(long courseID) {
		return reviews.get(courseID);
	}

}
