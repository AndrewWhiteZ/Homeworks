package com.example.homeworks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity
@Table(name = "TODO_EVENT")
@JsonIgnoreProperties("todoList")
public class TodoEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "todolist_id")
    private TodoList todoList;

    //@Enumerated(EnumType.STRING)
    //private Category category = Category.NONE;

    @Temporal(value = TemporalType.DATE)
    private Calendar expiryDate;
}
