package com.bala.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.lms.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	

}
