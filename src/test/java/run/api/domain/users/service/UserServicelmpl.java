package run.api.domain.users.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import run.api.global.dao.UserMapper;
import run.api.global.dto.user;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServicelmpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public List<user> getUserList() {
        return userMapper.getUserList();
    }

}