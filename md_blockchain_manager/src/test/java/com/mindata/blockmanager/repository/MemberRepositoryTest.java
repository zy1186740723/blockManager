package com.mindata.blockmanager.repository;

import com.mindata.blockmanager.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: zhangyan
 * @Date: 2019/3/12 0:18
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    public void findOneTest(){
        List<Member> memberList=repository.findByGroupId("1");
        System.out.println(memberList);

    }

    @Test
    public void findByGroupId() {
        List<Member> members=repository.findByGroupId("1");
        System.out.println(members);
    }

}