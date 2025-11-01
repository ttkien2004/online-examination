package cnpmnc.demo.controller;

import cnpmnc.demo.model.*;
import cnpmnc.demo.repository.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class DemoController {
    private final UserRepository userRepo;
    private final BookRepository bookRepo;

    public DemoController(UserRepository userRepo, BookRepository bookRepo) {
        this.userRepo = userRepo;
        this.bookRepo = bookRepo;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PostMapping("/books/{userId}")
    public Book addBook(@PathVariable Long userId, @RequestBody Book book) {
        User user = userRepo.findById(userId).orElseThrow();
        book.setUser(user);
        return bookRepo.save(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId) {
        bookRepo.deleteById(bookId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public Book patchBook(@RequestBody Book newBook) {
        // hello
        System.out.println("Received Book ID: " + newBook.getId());
        Book book = bookRepo.findById(newBook.getId()).orElseThrow();
        book.setTitle(newBook.getTitle());
        return bookRepo.save(book);
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("PING CALLED!");
        return "PONG: " + System.currentTimeMillis();
    }
    @GetMapping("/Hello")
    public String getMethodName(@RequestParam String param) {
        return new String("Hello " + param);
    }

    @GetMapping("/Welcome")
    public String getWelcomeName(@RequestParam String param) {
        return new String("Welcome " + param);
    }
    
    @GetMapping("/Bye")
    public String getByeName(@RequestParam String param) {
        return new String("Bye " + param);
    }
       
}
