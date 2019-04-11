package com.mindata.blockmanager.manager;

import com.mindata.blockmanager.model.Permission;
import com.mindata.blockmanager.repository.PermissionRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: zhangyan
 * @Date: 2019/3/15 22:13
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionManagerTest {

    @Autowired
    private PermissionRepository permissionRepository;

    @Test
    public void findPermission() throws  Exception{
        List<Permission> res= permissionRepository.findByGroupId("1");
        System.out.println(res);
    }}