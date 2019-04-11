package com.mindata.blockmanager.manager;

import com.mindata.blockmanager.bean.MemberData;
import com.mindata.blockmanager.model.Member;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberManagerTest {

    @Autowired
    private MemberManager memberManager;

    @Test
    public void findGroupId() throws  Exception{
        String groupId=memberManager.findGroupId("maida");
        Assert.assertEquals("1",groupId);
    }


}