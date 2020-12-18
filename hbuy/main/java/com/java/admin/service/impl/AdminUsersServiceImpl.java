package com.java.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.admin.model.AdminUsersEntity;
import com.java.admin.service.AdminUsersService;

/**
 * 
 * @author djin
 *    AdminUsers业务层实现类
 * @date 2019-09-18 15:17:59
 */
@Service
@Transactional
public class AdminUsersServiceImpl extends BaseServiceImpl<AdminUsersEntity> implements AdminUsersService {
	
}
