package org.wecancodeit.columbus.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review anime = new Review(1L, "Gosick", "image",
				"Licensed by Funimation, Episodes: 24, Rated R - 17+ (violence & profanity)",
				"Mystery, Historical, Drama, Romance", "Anime Description");
		Review game = new Review(2L, "Dragon Age", "image", "Anime Content", "Anime Category", "Anime Description");
		Review manga = new Review(3L, "Is It Wrong To Pick Up Girls in the Dungeon?", "image", "Anime Content",
				"Anime Category", "Anime Description");
		Review anime2 = new Review(4L, "Ubel Blight", "image", "Manga Content", "Manga Category", "Manga Description");

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