package com.udangtang.test2.controller;

import com.udangtang.test2.DAO.RoomMapper;
import com.udangtang.test2.DAO.UserMapper;
import com.udangtang.test2.DTO.RoomDto;
import com.udangtang.test2.DTO.UserDto;
import com.udangtang.test2.service.SttService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class RoomController {
    // 회의방 관련 컨트롤러

//    @Autowired
//    private RoomMapper roomMapper;
//
////    @Autowired
////    private UserMapper userMapper;
//
//
//    // 로비방 생성
//    @PostMapping("/createRoom")
//    public void createRoom(@RequestBody RoomDto roomDTo){
//
//        roomMapper
//    }

    // 로비방 상세정보


    // 로비방 삭제


    // 회의 목록


    // 회의방 생성


    // 회의방 상세정보


    // 음성 녹음 처리
//    @PostMapping("testing")
//    public String running(@RequestBody UserDto userDto) {
//        SttService sttService = new SttService();
//        System.out.println(userDto.getUsername());
//        System.out.println(userDto.getPassword());
//        try {
//            sttService.test();
//            sttService.run();
//            sttService.get();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return "";
//    }
}
