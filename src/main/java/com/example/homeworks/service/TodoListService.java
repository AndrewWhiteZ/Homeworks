package com.example.homeworks.service;

import com.example.homeworks.repositories.TodoListRepository;
import com.example.homeworks.domain.TodoList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class TodoListService {
    private final TodoListRepository todoListRepository;

    public List<TodoList> getAllLists() {
        return new ArrayList<>(todoListRepository.findAll());
    }

    public TodoList getListById(Long id) {
        return todoListRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void createList(TodoList todoList) {
        todoListRepository.save(todoList);
    }

    public void deleteListById(Long id) {
        todoListRepository.deleteById(id);
    }
}
