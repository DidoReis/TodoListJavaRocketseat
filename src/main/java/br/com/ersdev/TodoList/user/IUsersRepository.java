package br.com.ersdev.TodoList.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<UserModel, UUID> {
    
    UserModel findByUsername(String username);
   

}
