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
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PermissionID", type = IdType.AUTO)
    private Integer permissionID;

    private String permissionName;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
