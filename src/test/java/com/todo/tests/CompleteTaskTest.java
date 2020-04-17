package com.todo.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompleteTaskTest extends BaseTest {

    @BeforeEach
    void setUp() {
        toMvcPage.open();
    }

    @Test
    void testCanCompleteTask() {
        // GIVEN
        String taskToComplete = "task to complete";
        addTaskWidget.createNewTask(taskToComplete);
        assertThat(taskListWidget.isTaskCompleted(taskToComplete)).isFalse();

        // WHEN
        taskListWidget.completeTask(taskToComplete);

        // THEN
        assertThat(taskListWidget.isTaskCompleted(taskToComplete)).isTrue();
    }
}
