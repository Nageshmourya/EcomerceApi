package com.Nagesh.Ecommerce.API.Creation.repo;

import com.Nagesh1.Ecommerce.API.Creation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
