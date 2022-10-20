package com.jeeyusoft.todo.service;

import com.jeeyusoft.todo.entity.ToDo;

import java.util.List;

public interface ToDoService {

    //데이터 삽입
    //ToDo 대신에 DTO로 설정해도 된다.
    //주의 할 점은 ToDo를 받을거라면 수정할 수 없도록 final로 설정해야한다.
    public List<ToDo> create(final ToDo toDo);
    public List<ToDo> retrieve (final String userId);
    public List<ToDo> update(final ToDo toDo);
    public List<ToDo> delete(final ToDo toDo);

}
