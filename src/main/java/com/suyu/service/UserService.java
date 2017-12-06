package com.suyu.service;

import com.suyu.domain.User;

public interface UserService {
    int insertSelective(User record);
}
