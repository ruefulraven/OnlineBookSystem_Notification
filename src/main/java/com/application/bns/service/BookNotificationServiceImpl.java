package com.application.bns.service;

import com.application.bns.repository.BookNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookNotificationServiceImpl implements BookNotificationService {


    JmsTemplate jmsTemplate;

    @Autowired
    BookNotificationRepository bookNotificationRepository;


    public BookNotificationServiceImpl(JmsTemplate jmsTemplate, BookNotificationRepository bookNotificationRepository) {
        this.jmsTemplate = jmsTemplate;
        this.bookNotificationRepository = bookNotificationRepository;
    }

    @Override
    public String bookCount() {
        String bookCount = Long.toString(bookNotificationRepository.count());
        System.out.println("BookCount: " + bookCount);
        jmsTemplate.convertAndSend("book-notification", bookCount);
        return bookCount;
    }

    @Override
    public String getGreeting() {
        return getGreeting();
    }

}
