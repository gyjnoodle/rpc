package com.gyj.common;

/**
 * @author: noodle
 */
public interface IUserService {
    /**
     * query user info
     * @param id
     * @return
     */
    User findUserById(Integer id);
}
