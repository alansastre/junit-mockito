package com.example.service.datastructures;

import com.example.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repaso {

    @Test
    @DisplayName("Test name")
    public void testName() {

        
        int[] numbers = new int[4];
        User[] usersArray = new User[4]; // array estático

        List<User> users = new ArrayList<>();


        User user1 = new User(1L, "Pepe");

        usersArray[0] = user1;

        users.add(user1);

        List<User> subLista = new ArrayList<>();
        //subLista.add()

        users.addAll(subLista);


        User dssdf ;

        // array 1 dimension
        User[] array1 = new User[230];
        User[][] usersMatrix = new User[5][5];
        User[][][] usersMatrix2 = new User[5][5][];
        User[][][][] usersMatrix23 = new User[5][5][][];

        // Collections

        // List elementos

        // Map clave valor
//        Map<>

//        List<User>

//        var pepe = "";
//        var number = 3;
//
//


        List<User> userList = new ArrayList<>();
//
        Map<Long, User> userMap = new HashMap<>();

        User alan = new User(1L, "Alan", Instant.now());
        User miguel = new User(2L, "Miguel", Instant.now());

        userList.add(alan);
        userList.add(miguel);

        userMap.put(alan.getId(), alan);
        userMap.put(miguel.getId(), miguel);

        Map<Long, List<User>> mapUserList = new HashMap<>();
        mapUserList.put(1L, userList);

        Map<Long, Map<Long, List<User>>> mapUserMap = new HashMap<>();

    }
}
