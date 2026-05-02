package org.example.services;
import java.io.File;
import java.util.List;

import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService 
{
   private User user; 

   private List<User> userList;

   private static final String USERS_PATH="../localDb/Users.json";

   private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

   public UserBookingService(User user1){
      this.user = user1;
      File users = new File(USERS_PATH);
      userList= OBJECT_MAPPER.readValue(users,new TypeReference<List<User>>() {});
   }

   
}
  