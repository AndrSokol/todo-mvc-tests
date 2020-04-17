package com.todo.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTaskTest extends BaseTest {

    @BeforeEach
    void setUp() {
        toMvcPage.open();
    }

    @Test
    void testCanAddTasks() {
        // GIVEN
        String taskName1 = "test1";
        String taskName2 = "test2";

        // WHEN
        addTaskWidget.createNewTask(taskName1);
        addTaskWidget.createNewTask(taskName2);

        // THEN
        List<String> getActualTaskNames = taskListWidget.getTaskNames();
        assertThat(getActualTaskNames).hasSize(2);
        assertThat(getActualTaskNames).contains(taskName1, taskName2);
    }

    @Test
    void testCanAddTasksWithSameName() {
        // GIVEN
        String taskName = "test";

        // WHEN
        addTaskWidget.createNewTask(taskName);
        addTaskWidget.createNewTask(taskName);

        // THEN
        List<String> getActualTaskNames = taskListWidget.getTaskNames();
        assertThat(getActualTaskNames).hasSize(2);
        assertThat(getActualTaskNames).containsOnly(taskName);
    }
}
