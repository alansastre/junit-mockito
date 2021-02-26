package com.example.service;

import com.example.dao.UserDAO;
import com.example.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
// import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserDAO userDAO; // dependencia

    @InjectMocks
    UserService userService; // SUT - System Under Test (dependiente)

    @Test
    void findAll() {

        // 1 Configurar mocks
        when(userDAO.findAll()).thenReturn(
                Arrays.asList(
                        new User(1L, "Pepito"), // 0
                        new User(2L, "David"), // 1
                        new User(3L, "Mike") // 2
                )
        );

        // 2 - Probar el SUT
        List<User> users = userService.recuperarUsuarios();
        assertEquals(3, users.size());
        assertEquals("David", users.get(1).getName());

        // 3 - Verificar datos y mock
        verify(userDAO, times(1)).findAll();

    }


    @Test
    @DisplayName("findOneTest")
    public void findOneTest() {

        // Configurar mock
        when(userDAO.findOne(anyLong())).thenReturn(
               new User(1L,"Mike")
        );

        // Ejecucion
        User user = userService.findOne(6L);
        //User user2 = userService.findOne(2L);

        // Verificaciones
        verify(userDAO, times(1)).findOne(1L);
        //verify(userDAO, times(1)).findOne(user2.getId());


    }


}