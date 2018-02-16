package org.wecancodeit.columbus.reviewssite;

import org.junit.Test;

public class ReviewTest {
	private Review underTest;

	private long ID = 1111;
	private String TITLE = "title";
	private String URL = "url";
	private String CATEGORY = "category";
	private String CONTENT = "content";
	private String DESCRIPTION = "description";

	@Test
	public void shouldConstructIdTitleImageurlCategoryContentDescription() {
		underTest = new Review(0L, TITLE, URL, CATEGORY, CONTENT, DESCRIPTION);
	}

}
