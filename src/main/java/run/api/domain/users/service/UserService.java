package run.api.domain.users.service;

import run.api.domain.users.mapper.UserMapper;
import run.api.domain.users.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import java.text.SimpleDateFormat;
//import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {
    // 회원가입 시 저장시간을 넣어줄 DateTime
    //SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:sss");
    //Date time = new Date();
    //String localTime = format.format(time);

    @Autowired
    UserMapper userMapper;

    @Transactional
    public void joinUser(UserVo userVo){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
        //userVo.setUserAuth("USER");
        //userVo.setAppendDate(localTime);
        //userVo.setUpdateDate(localTime);
        userMapper.saveUser(userVo);
    }
}