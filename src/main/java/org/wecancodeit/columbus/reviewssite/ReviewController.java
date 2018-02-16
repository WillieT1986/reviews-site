package org.wecancodeit.columbus.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

}
