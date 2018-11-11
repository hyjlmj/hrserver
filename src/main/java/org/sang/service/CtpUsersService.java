package org.sang.service;

import org.sang.bean.CtpUser;
import org.sang.mapper.CtpUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CtpUsersService implements UserDetailsService {

    @Autowired
    CtpUserMapper ctpUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CtpUser ctpUser = ctpUserMapper.loadUserByUsername(username);
        if (ctpUser == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return ctpUser;
    }

}
