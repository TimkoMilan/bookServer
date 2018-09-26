package com.akademiasovz.apibook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<BookModel,Long> {

       List<BookModel> findByBookAuthor (String author);
       BookModel findByBookTitle(String title);
}
