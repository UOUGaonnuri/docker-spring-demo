package com.example.dockerspringdemo.service;

import com.example.dockerspringdemo.constant.exception.CustomException;
import com.example.dockerspringdemo.constant.exception.ErrorCode;
import com.example.dockerspringdemo.model.TestEntity;
import com.example.dockerspringdemo.model.repository.TestEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final TestEntityRepository testEntityRepository;

    public List<TestEntity> getAllUser(){
        return testEntityRepository.findAll();
    }

    public TestEntity findUserById(Long userId){
        TestEntity result = testEntityRepository.findById(userId)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return result;
    }

}
