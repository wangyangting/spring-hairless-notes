package com.github.hairless.dao;

import com.github.hairless.po.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author wangyangting
 * @date 2020-06-11
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
