package com.aliens.redis.repository;


import com.aliens.redis.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Override
    List<Book> findAll();
}
