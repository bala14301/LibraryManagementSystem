package com.bala.lms.services;

import com.bala.lms.models.Borrowing;

public interface BorrowingService {

	Borrowing borrowBook(Long bookId,Long memberId);
	
	Borrowing returnBook(Long borrowingId);


}
