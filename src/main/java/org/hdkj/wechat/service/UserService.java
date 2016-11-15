package org.hdkj.wechat.service;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.User;
import org.hdkj.wechat.dao.IUserDao;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
