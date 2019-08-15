package com.lg.mapper;

import com.lg.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> queryUserList();
}
