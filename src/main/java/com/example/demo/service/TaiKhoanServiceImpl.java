package com.example.demo.service;

import com.example.demo.Entity.TaiKhoan;
import com.example.demo.exception.NotFoundException;
import com.example.demo.respository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    TaiKhoanRepository userRepository;
    @Autowired
    TaiKhoanRepository accountRepository;
    @Autowired
    private PasswordEncoder encoder;
    @Override
    public List<TaiKhoan> getListTK() {
        return userRepository.findAll().stream().map(TaiKhoan::new).collect(Collectors.toList());
    }

    @Override
    public TaiKhoan getTK(String tenDN){
        TaiKhoan taiKhoan = new TaiKhoan(userRepository.findById(tenDN).orElseThrow(() -> new NotFoundException("Not found User with username: " + tenDN)));
        return taiKhoan;

    }

    /*@Override
    public UserDTO insert(Account account) {
        User user = account.getUser();
        if(accountRepository.existsById(account.getUsername())) throw new DuplicateException("Username is exists");
        if(userRepository.existsByCMND(user.getCMND())) throw new DuplicateException("CMND is exists");
        if(userRepository.existsByEmail(user.getEmail())) throw new DuplicateException("Email is exists");
        if(userRepository.existsByPhone(user.getPhone())) throw new DuplicateException("Phone number is exists");
        account.setPassword(encoder.encode(account.getPassword()));
        return new UserDTO(accountRepository.save(account).getUser());

    }*/
}
