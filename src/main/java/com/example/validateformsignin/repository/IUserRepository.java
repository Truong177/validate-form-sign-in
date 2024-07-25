package com.example.validateformsignin.repository;

import com.example.validateformsignin.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Long> {
}
