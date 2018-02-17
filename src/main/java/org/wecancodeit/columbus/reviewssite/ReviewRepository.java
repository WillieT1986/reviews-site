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
				"Licensed by Funimation, \n Episodes: 24, \n Rated R - 17+ (violence & profanity)",
				"A student by the name of Kujou, Kazuya attends a school where he comes across a young girl at the top of a"
						+ " towering Library where they end up talking about Mysteris and Legends. Solving crime scenes and assisting"
						+ " a detective while she remains at the top of the Library using her foresight to help solve crime while Kazuya"
						+ " is known to other students as Black Reaper. They must rely on one another as these two solve the Ghost Ship & The Alchemist.");

		Review anime2 = new Review(2L, "D.Gray-man", "./images/dgrayman.jpeg",
				"Action, Adventure, Comedy, Super Power, Demons, Shounen",
				"Licensed by Funimation, Episodes: 103, PG-13 - Teens 13 or older",
				"The Millennium Earl is back and wrecking havoc on Earth once again with his mechanical demons known as Akuma."
						+ "Allen Walker, a young boy raised by General Cross of the Black Order along with his new friends from the Order fight against the Millennium Earl."
						+ " Can Allen and his friends save the world?");

		Review anime3 = new Review(3L, "Is It Wrong to Try to Pick Up Girls in a Dungeon?", "./images/dungeon.jpg",
				"Action, Adventure, Comedy, Romance, Fantasy",
				"Licensed by Sentai Filmworks, Episodes: 13, PG-13 - Teens 13 or older",
				"This story is about a young boy named Bell who's under the protection of the Goddess Hestia."
						+ "Bell explores the Dungeon which is underground, with a tower built on top of it which is managed by The Guild and other varios Gods & Goddesses."
						+ " Bell hopes to one day catch up to a girl that he likes who's at the top of her class when it comes to being an Adventurer.");

		Review manga = new Review(4L, "Übel Blatt", "./images/ubel.jpg", "Action, Adventure, Ecchi, Fantasy, Seinen",
				"Serialized by Big Gangan, Authored by Shiono, Etorouji, Unknown Volumes & Chapters",
				"This story is about a boy named Kóinzell who's much older than he seems. Once know to be apart of a group of"
						+ " Hero's who ended up being betrayed. Kóinzell, seeks vengeance against the Hero's who betrayed him and his comrades and made them out to be traitors."
						+ "Kóinzell is not just an object of fear but also of hope to those around him.");

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