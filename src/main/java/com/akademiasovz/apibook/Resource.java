package com.akademiasovz.apibook;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class Resource {

    @Autowired
    private ModelRepository modelRepository;

    @GetMapping("/all")
    public List<BookModel> getAllAdvert() {
        return modelRepository.findAll();
    }
    @GetMapping("/author/{author}")
    public List<BookModel> findByAuthor(@PathVariable(value = "author") String author){
        return modelRepository.findByBookAuthor(author);
    }
    @GetMapping("/title/{title}")
    public BookModel findByTitle(@PathVariable(value = "title") String title){
        return modelRepository.findByBookTitle(title);
    }
    @PostMapping("/new")
    public void createNew(@RequestBody BookModel bookModel){
        modelRepository.save(bookModel);
    }

}
