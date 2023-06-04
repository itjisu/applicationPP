package run.api.domain.users.mapper;

import run.api.domain.users.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void saveUser(UserVo userVo);
}
