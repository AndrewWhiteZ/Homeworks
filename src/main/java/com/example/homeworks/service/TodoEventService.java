package com.example.homeworks.service;

import com.example.homeworks.repositories.TodoEventRepository;
import com.example.homeworks.domain.TodoEvent;
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
public class TodoEventService {
    private final TodoEventRepository todoEventRepository;

    public List<TodoEvent> getAllEvents() {
        return new ArrayList<>(todoEventRepository.findAll());
    }

    public TodoEvent getEventById(Long id) {
        return todoEventRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void createEvent(TodoEvent event) {
        todoEventRepository.save(event);
    }

    public void deleteEventById(Long id) {
        todoEventRepository.deleteById(id);
    }
}
