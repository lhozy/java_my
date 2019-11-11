package com.lhozy.dao;

import com.lhozy.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
