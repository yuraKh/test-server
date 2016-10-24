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
        createMocRemind();
        return repository.findAll();
    }

    private void createMocRemind() {
        Remind remind = new Remind();
        remind.setRemindDate(new Date());
        remind.setTitle("vjdbujd");
        repository.save(remind);
    }
}
