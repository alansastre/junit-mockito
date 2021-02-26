package com.example.service.bdd.bdd;


import com.example.dao.UserDAO;
import com.example.domain.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

/**
 * Behavior Driven Development
 *
 * Cucumber Framework
 * Sintaxis gherkin
 */
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


    // dependencias
    // captors

    // mocks
    @Mock
    UserDAO userDAO;

    // SUT
    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("BDD Style")
    public void bddStyle() {

        Instant accessedDate = Instant.now();

        // Given
        given(userDAO.findOne(anyLong())).willReturn(
                new User(1L, "Joaquin", accessedDate)
        );

        // When
        User user = userService.findOne(1L);

        // Then
        then(userDAO).should(times(1)).findOne(anyLong());
        assertNotEquals(accessedDate, user.getAccessedDate());


    }
}
