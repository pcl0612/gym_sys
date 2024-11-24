package com.example.gym_sys;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.gym_sys.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GymSysApplicationTests {

    @Autowired
    UsersMapper usersMapper;

    @Test
    void contextLoads() {
      //  usersMapper.selectList(null).forEach(System.out::println);
        System.out.println(usersMapper.getUserByUsername("admin"));
    }

}
