package com.inventory.inventory.Repository;

import com.inventory.inventory.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
