package com.developia.hibernate;

import com.developia.hibernate.repository.BookRepository;
import com.developia.hibernate.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*        Book book = new Book();
        book.setAuthor("George Orwell");
        book.setTitle("1980");
        bookRepository.save(book);

        Car car = new Car();
        car.setName("Toyota");
        car.setYear(2012);
        car.setColor("Red");
        carRepository.save(car);

 */
    }
}
