package com.course.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "taskId")
    private Long id;

    @Column(name = "taskTitle")
    private String title;

    @Column(name = "taskDescription")
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
