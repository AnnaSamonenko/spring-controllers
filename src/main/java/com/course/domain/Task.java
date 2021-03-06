package com.course.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "task_id")
    private Long id;

    @Column(name = "task_title")
    private String title;

    @Column(name = "task_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
