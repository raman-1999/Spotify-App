package com.example.challenge.proxy;

import com.example.challenge.domain.UserDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "authentication-service",url = "http://localhost:8080")
public interface IUserProxy {
        @PostMapping("/save")
        public ResponseEntity<?> saveUser(@RequestBody UserDomain user);
}

