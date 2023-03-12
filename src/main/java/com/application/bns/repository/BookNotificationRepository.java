package com.application.bns.repository;

import com.application.bns.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookNotificationRepository extends JpaRepository<Book, Long> {
}
