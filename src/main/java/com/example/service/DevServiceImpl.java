package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class DevServiceImpl implements TestService{
    @Override
    public String talk() {
        return "Dev 서비스 입니다.";
    }
}
