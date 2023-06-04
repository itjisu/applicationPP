package run.api.global.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import run.api.global.dto.user;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<user> getUserList();
}