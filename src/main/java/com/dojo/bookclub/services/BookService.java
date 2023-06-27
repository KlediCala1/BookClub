package com.dojo.bookclub.services;

import java.util.List;
import java.util.Optional;

import com.dojo.bookclub.models.Book;
import com.dojo.bookclub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public Book findById(Long id) {

        Optional<Book> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        }

        return null;
    }


    public List<Book> all() {
        return repo.findAll();
    }

    public Book create(Book book) {
        return repo.save(book);
    }



    public void deleteBook(Long id){
        repo.deleteById(id);
    }
}
