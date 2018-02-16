package org.wecancodeit.columbus.reviewssite;

public class Review {

	private long iD;

	public Review(long iD, String tITLE, String uRL, String cATEGORY, String cONTENT, String dESCRIPTION) {
		this.iD = iD;
	}

	public long getId() {
		return iD;
	}

}
