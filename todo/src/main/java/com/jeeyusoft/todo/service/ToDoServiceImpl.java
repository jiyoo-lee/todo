package com.jeeyusoft.todo.service;

import com.jeeyusoft.todo.entity.ToDo;
import com.jeeyusoft.todo.persistence.ToDoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService{

    private final ToDoRepository toDoRepository;
    
    
    //유효성 검사를 위한 메서드
    private void validate(final ToDo toDo){
        if(toDo == null){
            throw new RuntimeException("ToDo can not be null");
        }
        if(toDo.getUserId() == null) {
            throw new RuntimeException("UserId can not be null");
        }
    }

    @Override
    public List<ToDo> create(ToDo toDo) {
        validate(toDo);
        //데이터 추가
        toDoRepository.save(toDo);
        //데이터 자신의 데이터 목록을 리턴
        return toDoRepository.findByUserId(toDo.getUserId());
    }

    @Override
    public List<ToDo> retrieve(String userId) {
        return toDoRepository.findByUserId(userId);
    }

    @Override
    public List<ToDo> update(ToDo toDo) {
        validate(toDo);
        //데이터 추가
        toDoRepository.save(toDo);
        //데이터 자신의 데이터 목록을 리턴
        return toDoRepository.findByUserId(toDo.getUserId());
    }

    @Override
    public List<ToDo> delete(ToDo toDo) {
        validate(toDo);
        //데이터 추가
        toDoRepository.delete(toDo);
        //데이터 자신의 데이터 목록을 리턴
        return toDoRepository.findByUserId(toDo.getUserId());
    }
}
