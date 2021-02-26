package com.example.service.bdd.traditional;


import com.example.dao.UserDAO;
import com.example.domain.User;
import com.example.service.UserService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

/*
STUB - estado
MOCK - verificar comportamiento
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

    // before all y before each

    // tests
    @Test
    @DisplayName("Test name")
    public void testName() {

        // preparar escenario test - configuracion mocks
        Instant accessedDate = Instant.now();

        when(userDAO.findOne(anyLong())).thenReturn(
                new User(1L, "Joaquin", accessedDate)
        );

        User user = userService.findOne(1L);

        verify(userDAO, times(1)).findOne(anyLong());
        assertEquals(accessedDate, user.getAccessedDate());

        
    }

    // tests anidados


    // after each y after All
}
