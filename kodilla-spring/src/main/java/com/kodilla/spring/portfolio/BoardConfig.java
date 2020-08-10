package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    TaskList taskList;

    @Bean
    public Board board () {
        return new Board();
    }
    @Bean(name = "toDoList")
    public TaskList getTaskList() {
        return new TaskList();
    }
    /*@Bean(name = "inProgressList")
    public TaskList getTaskList() {
        return new TaskList();
    }*/
}
