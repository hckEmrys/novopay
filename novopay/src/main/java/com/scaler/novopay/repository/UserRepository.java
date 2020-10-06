package com.scaler.novopay.repository;

import com.scaler.novopay.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
