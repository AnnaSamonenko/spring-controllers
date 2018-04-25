package com.course;

import com.course.domain.Task;
import com.course.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan
public class TaskRepositoryTest {

    @Autowired
    private TaskRepository repository;

    @Test
    public void verifyAddTask() {
        Task task = new Task("Spring", "Spring description");
        repository.save(task);
        Assert.assertTrue(repository.existsById(task.getId()));
    }

}
