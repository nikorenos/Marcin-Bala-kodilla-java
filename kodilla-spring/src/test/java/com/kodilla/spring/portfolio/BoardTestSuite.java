package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testDisplay() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.displayLists();
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("task to do");
        board.inProgressList.addTask("task in progress");
        board.doneList.addTask("task done");
        //Then
        Assert.assertEquals("task to do", board.toDoList.getTasks().get(0));
        Assert.assertEquals("task in progress", board.inProgressList.getTasks().get(0));
        Assert.assertEquals("task done", board.doneList.getTasks().get(0));
    }

}
