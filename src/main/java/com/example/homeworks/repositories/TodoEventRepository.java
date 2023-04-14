package com.example.homeworks.repositories;

import com.example.homeworks.domain.TodoEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoEventRepository extends JpaRepository<TodoEvent, Long> {
}
