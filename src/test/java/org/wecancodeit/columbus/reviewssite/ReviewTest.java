package org.wecancodeit.columbus.reviewssite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
		underTest = new Review(ID, TITLE, URL, CATEGORY, CONTENT, DESCRIPTION);
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnId() {
		underTest = new Review(ID, TITLE, URL, CATEGORY, CONTENT, DESCRIPTION);
		long check = underTest.getId();
		assertEquals(1111L, check);
	}

	@Test
	public void shouldReturnTitle() {
		underTest = new Review(ID, TITLE, URL, CATEGORY, CONTENT, DESCRIPTION);
		String check = underTest.getTitle();
		assertEquals("title", check);
	}

}
