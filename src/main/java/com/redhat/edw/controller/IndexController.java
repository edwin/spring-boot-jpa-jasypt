package com.redhat.edw.controller;

import com.redhat.edw.model.UserAccount;
import com.redhat.edw.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <pre>
 *     com.redhat.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Mei 2020 12:14
 */
@RestController
public class IndexController {
    @Autowired
    private UserAccountRepository userAccountRepository;

    @GetMapping("/")
    public List<UserAccount> showAll() {
        return userAccountRepository.findAll();
    }

    @PostMapping("/")
    public UserAccount save(@RequestBody UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }
}
