package com.cognizant.junitspring.exercise7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {

        userRepository.save(new User(1L, "Anshuman Routray"));
        userRepository.save(new User(2L, "Rahul"));

        List<User> users = userRepository.findByName("Anshuman Routray");

        assertEquals(1, users.size());
        assertEquals("Anshuman Routray", users.get(0).getName());

    }

}