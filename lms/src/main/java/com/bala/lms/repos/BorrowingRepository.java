package com.bala.lms.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.lms.models.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
	List<Borrowing> findByReturnDate(Date date);

	

}
