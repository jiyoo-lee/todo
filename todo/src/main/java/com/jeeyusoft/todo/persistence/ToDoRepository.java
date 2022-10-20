package com.jeeyusoft.todo.persistence;

import com.jeeyusoft.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository  extends JpaRepository<ToDo,String> {

    //userId를 가지고 조회하는 메서드
    public List<ToDo> findByUserId(String userId);

}
