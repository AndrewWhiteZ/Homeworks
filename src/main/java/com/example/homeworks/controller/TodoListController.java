package com.example.homeworks.controller;

import com.example.homeworks.domain.TodoEvent;
import com.example.homeworks.domain.TodoList;
import com.example.homeworks.service.TodoEventService;
import com.example.homeworks.service.TodoListService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TodoListController {
    private final TodoListService todoListService;
    private final TodoEventService todoEventService;

    @GetMapping("/lists")
    @ResponseBody
    public List<TodoList> getAllLists() {
        return todoListService.getAllLists();
    }

    @GetMapping("/lists/{id}")
    @ResponseBody
    public TodoList getListById(@PathVariable Long id) {
        return todoListService.getListById(id);
    }

    @PostMapping("/lists")
    @ResponseBody
    public void createList(@RequestBody TodoList todoList) {
        todoList.getTodoEvents().forEach(event -> event.setTodoList(todoList));
        todoListService.createList(todoList);
    }

    @DeleteMapping("/lists/{id}")
    @ResponseBody
    public void deleteList(@PathVariable Long id) {
        todoListService.deleteListById(id);
    }


    @GetMapping("/events")
    @ResponseBody
    public List<TodoEvent> getAllEvents() {
        return todoEventService.getAllEvents();
    }

    @GetMapping("/events/{id}")
    @ResponseBody
    public TodoEvent getEventById(@PathVariable Long id) {
        return todoEventService.getEventById(id);
    }

    @GetMapping("/lists/{list_id}/events")
    @ResponseBody
    public List<TodoEvent> getAllEventsInList(@PathVariable Long list_id) {
        return todoListService.getListById(list_id).getTodoEvents();
    }

    @PostMapping("/lists/{list_id}/events")
    @ResponseBody
    public void createEvent(@RequestBody TodoEvent event, @PathVariable Long list_id) {
        event.setTodoList(todoListService.getListById(list_id));
        //event.setCategory(Category.valueOf(event.getCategory().name()));
        todoEventService.createEvent(event);
    }

    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable Long id) {
        todoEventService.deleteEventById(id);
    }
}
