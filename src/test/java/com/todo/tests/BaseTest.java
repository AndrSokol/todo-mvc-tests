package com.todo.tests;

import com.todo.config.TestConfig;
import com.todo.pages.ToMvcPage;
import com.todo.widgets.AddTaskWidget;
import com.todo.widgets.TaskListWidget;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class BaseTest {

    @Autowired
    AddTaskWidget addTaskWidget;

    @Autowired
    TaskListWidget taskListWidget;

    @Autowired
    ToMvcPage toMvcPage;
}
