package com.example.gym_sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author pcl
 * @since 2024-11-24
 */
@Getter
@Setter
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "UserRoleID", type = IdType.AUTO)
    private Integer userRoleID;

    private Integer userID;

    private Integer roleID;

    private LocalDateTime createdAt;
}
