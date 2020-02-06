package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class QaServiceImpl implements TestService{

    @Override
    public String talk() {
        return "Qa 서비스 입니다.";
    }
}
