package org.wecancodeit.columbus.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review anime = new Review(1L, "Gosick", "./images/gosick.jpg", "Mystery, Historical, Drama, Romance",
				"Licensed by Funimation, Episodes: 24, Rated R - 17+ (violence & profanity)",
				"A student by the name of Kujou, Kazuya attends a school where he comes across a young girl at the top of a,"
						+ " towering Library where they end up talking about Mysteris and Legends. Solving crime scenes and assisting,"
						+ " a detective while she remains at the top of the Library using her foresight to help solve crime while Kazuya,"
						+ " is known to other students as Black Reaper. They must rely on one another as these two solve the Ghost Ship & The Alchemist.");

		Review anime2 = new Review(2L, "D.Gray-man", "image", "Anime Content", "Anime Category", "Anime Description");

		Review anime3 = new Review(3L, "Is It Wrong to Try to Pick Up Girls in a Dungeon?", "image", "Anime Content",
				"Anime Category", "Anime Description");

		Review manga = new Review(4L, "Übel Blatt", "image", "Manga Content", "Manga Category", "Manga Description");

		reviews.put(anime.getId(), anime);
		reviews.put(anime2.getId(), anime2);
		reviews.put(anime3.getId(), anime3);
		reviews.put(manga.getId(), manga);
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