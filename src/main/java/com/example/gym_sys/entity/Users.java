package com.example.gym_sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
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
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "UserID", type = IdType.AUTO)
    private Integer userID;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String password;

}
