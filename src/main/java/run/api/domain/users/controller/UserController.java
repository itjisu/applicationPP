package run.api.domain.users.controller;

import run.api.domain.users.service.UserService;
import run.api.domain.users.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 회원가입 폼
     * @return
     */
    @GetMapping("/account")
    public String account() {
        return "account";
    }

    /**
     * 회원가입 진행
     * @param userVo
     * @return
     */
    @PostMapping("/account")
    public String account(UserVo userVo) {
        userService.joinUser(userVo);
        return "redirect:/login"; //로그인 구현 예정
    }
}