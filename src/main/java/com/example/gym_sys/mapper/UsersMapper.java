package com.example.gym_sys.mapper;

import com.example.gym_sys.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pcl
 * @since 2024-11-24
 */
public interface UsersMapper extends BaseMapper<Users> {


//    @Select("select users.Username from users where Username=#{username1}")
//    Users getUserByUsername(@Param("username1") String username);
}
