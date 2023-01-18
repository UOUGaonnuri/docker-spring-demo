package com.example.dockerspringdemo.controller;

import com.example.dockerspringdemo.dto.BaseResponse;
import com.example.dockerspringdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {

    private final UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<BaseResponse> sayHello() {
        return ResponseEntity.ok(BaseResponse.success("Helo World"));
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<BaseResponse> getAllUser() {
        return ResponseEntity.ok(BaseResponse.success(userService.getAllUser()));
    }

    @GetMapping("/findUser")
    public ResponseEntity<BaseResponse> findUserByUserId(@RequestParam("id") Long userId){
        return ResponseEntity.ok(BaseResponse.success(userService.findUserById(userId)));
    }

}
