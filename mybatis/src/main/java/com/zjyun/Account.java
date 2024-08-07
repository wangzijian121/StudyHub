package com.zjyun;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/7/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Integer balance;
}
