package org.wecancodeit.columbus.reviewssite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ReviewTest {
	private Review underTest;

	private long ID = 1111;
	private String TITLE = "title";
	private String IMAGEURL = "ImageURL";
	private String CATEGORY = "category";
	private String CONTENT = "content";
	private String DESCRIPTION = "description";

	@Before
	public void setup() {
		underTest = new Review(ID, TITLE, IMAGEURL, CATEGORY, CONTENT, DESCRIPTION);
	}

	@Test
	public void shouldConstructIdTitleImageURLCategoryContentDescription() {
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnId() {
		long check = underTest.getId();
		assertEquals(1111L, check);
	}

	@Test
	public void shouldReturnTitle() {
		String check = underTest.getTitle();
		assertEquals("title", check);
	}

	@Test
	public void shouldReturnImageURL() {
		String check = underTest.getImageURL();
		assertEquals("imageURL", check);
	}

}
