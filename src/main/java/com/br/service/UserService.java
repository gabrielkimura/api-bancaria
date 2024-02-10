package com.br.service;

import com.br.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
