package com.example.mybatisplus.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("staff")
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private String id;
    private String name;
    private String mobile;
    private Integer salary;

}
