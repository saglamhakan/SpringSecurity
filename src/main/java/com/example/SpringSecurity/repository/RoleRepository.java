package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.model.Role;
import com.example.SpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<User,Long> {

    void save(Role roleAdmin);

}
