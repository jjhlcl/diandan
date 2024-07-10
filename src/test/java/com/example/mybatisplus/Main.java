package com.example.mybatisplus;

import com.example.mybatisplus.Entity.Staff;
import com.example.mybatisplus.mapper.StaffMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class Main {
    @Autowired
    StaffMapper stamapper;


    @Test
    public void staffTest(){
//        //插入数据
//        Staff sta1 = new Staff("0001", "狗俊", "18382233333",2 );
//        Staff sta2 = new Staff("0002", "牛刘", "19982299898", 1);
//        Staff sta3 = new Staff("0003", "狗乐", "18220200121",1 );
//        Staff sta4 = new Staff("0004", "鸡东", "17878787877", 3);
//        Staff sta5 = new Staff("0005", "辉少", "18382230611", 200000);
//
//        stamapper.insert(sta1);
//        stamapper.insert(sta2);
//        stamapper.insert(sta3);
//        stamapper.insert(sta4);
//        stamapper.insert(sta5);


        //查询数据
        List<Staff> staff = stamapper.selectList(null);
        for (int i = 0; i < staff.size(); i++) {
            Staff sta = staff.get(i);
            System.out.println(sta);

        }


    }

}
