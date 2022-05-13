package com.example.demo.security.services;

import com.example.demo.Entity.TaiKhoan;
import com.example.demo.respository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TaiKhoanRepository accountRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TaiKhoan account = accountRepository.findById(username).orElseThrow(
                () -> new UsernameNotFoundException("User Not Found with -> username: " + username));

        return UserDetailsImpl.build(account);
    }
}
