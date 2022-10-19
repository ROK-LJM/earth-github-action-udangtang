package com.udangtang.test2.controller;

import com.udangtang.test2.DAO.UserMapper;
import com.udangtang.test2.DTO.UserDto;
import com.udangtang.test2.service.SttService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;


@RestController
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserMapper userMapper;

    // 로그인 정보 처리
    @PostMapping("/join")
    public UserDto post(@RequestBody UserDto userDto) {
        System.out.println(userDto.getUsername());
        System.out.println(userDto.getPassword());

        userMapper.InsertUser(userDto);

        return userDto;
    }


    @PostMapping("testing")
    public String running(@RequestBody UserDto userDto) {
        Boolean check = false;
        SttService sttService = new SttService();
        System.out.println(userDto.getUsername());
        System.out.println(userDto.getPassword());
        try {
//            sttService.test();    // 토큰 만들기
            String resultId = sttService.run();     // 녹음 파일 ID 생성하기
            check = sttService.get(resultId);       // 녹음 파일 ID로 AI로 텍스트 json 형태로 저장하기
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(check == false) {
            return "음성 텍스트로 변환 실패";
        }

        return "음성 텍스트로 변환 성공";
    }







//    @PostMapping("/join")
//    public void post(@RequestBody Map<String, String> requestData) {
//        requestData.entrySet().forEach(stringStringEntry -> {
//            System.out.println("key: " + stringStringEntry.getKey());
//            System.out.println("value: " + stringStringEntry.getValue());
//        });
//    }

//    @PostMapping("/join")
//    public void post(@RequestBody UserEntity userEntity) {
//        System.out.println(userEntity.getUsername());
//        System.out.println(userEntity.getPassword());
//    }


}