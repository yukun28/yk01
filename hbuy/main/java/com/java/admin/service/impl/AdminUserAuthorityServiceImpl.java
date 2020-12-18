package com.java.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.admin.model.AdminUserAuthorityEntity;
import com.java.admin.service.AdminUserAuthorityService;

/**
 * 
 * @author djin
 *    AdminUserAuthority业务层实现类
 * @date 2019-09-18 15:17:59
 */
@Service
@Transactional
public class AdminUserAuthorityServiceImpl extends BaseServiceImpl<AdminUserAuthorityEntity> implements AdminUserAuthorityService {
	
}
