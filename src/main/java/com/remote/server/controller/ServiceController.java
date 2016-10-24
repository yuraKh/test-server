package com.remote.server.controller;

import com.remote.server.entity.Remind;
import com.remote.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private RemindRepository repository;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getHello(ModelMap modelMap) {
        return repository.findAll();
        //return createMocRemind();
    }

    private Remind createMocRemind() {
        Remind remind = new Remind();
        // remind.setId(1L);
        remind.setRemindDate(new Date());
        remind.setTitle("vjdbujd");
        repository.save(remind);
        return remind;
    }
}
