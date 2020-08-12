package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;
    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    TaskList doneList;


    @Bean
    public Board board () {
        return new Board(toDoList,inProgressList,doneList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList("doDoList");
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList("inProgressList");
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList("doneList");
    }
}
