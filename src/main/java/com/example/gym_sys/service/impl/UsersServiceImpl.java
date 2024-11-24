package com.example.gym_sys.service.impl;

import com.example.gym_sys.entity.Users;
import com.example.gym_sys.mapper.UsersMapper;
import com.example.gym_sys.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pcl
 * @since 2024-11-24
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
