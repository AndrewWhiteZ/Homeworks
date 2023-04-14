package com.example.homeworks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TODO_LIST")
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @OneToMany(mappedBy = "todoList", cascade = CascadeType.ALL)
    @JsonProperty("events")
    private List<TodoEvent> todoEvents;
}
