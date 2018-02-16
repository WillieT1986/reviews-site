package org.wecancodeit.columbus.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review anime = new Review(1L, "Anime", "image", "Anime Content", "Anime Category", "Anime Description");
		Review game = new Review(2L, "Game", "image", "Game Content", "Game Category", "Game Description");
		Review manga = new Review(3L, "Manga", "image", "Manga Content", "Manga Category", "Manga Description");
		Review anime2 = new Review(4L, "Anime2", "image", "Anime2 Content", "Anime2 Category", "Anime2 Description");

		reviews.put(anime.getId(), anime);
		reviews.put(game.getId(), game);
		reviews.put(manga.getId(), manga);
		reviews.put(anime2.getId(), anime2);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Review findOne(long reviewID) {
		return reviews.get(reviewID);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
