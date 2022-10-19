package com.udangtang.test2.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Table(name="test_db1")
public class UserDto {

    // 로그인 정보 관리
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String username;
    private String password;
}