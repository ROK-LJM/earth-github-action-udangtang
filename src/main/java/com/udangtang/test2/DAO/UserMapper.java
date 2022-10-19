package com.udangtang.test2.DAO;

import com.udangtang.test2.DTO.UserDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //  회원가입
//    @Insert("INSERT INTO test_db.test_db1 (user_id, user_pw) VALUES (#{username}, #{password})")
//    void InsertUser(UserDto dto);

    // 로그인(회원가입) 정보 저장
    @Insert("INSERT INTO test_db.test_db2 (user_id, user_pw) VALUES (#{userId}, #{userPw}")
    void InsertUser(UserDto dto);

    // 로그인 정보 삭제
    @Delete("DELETE FROM test_db.test_db2 WHERE user_id = #{userId}")
    void DeleteUser(UserDto dto);
}
