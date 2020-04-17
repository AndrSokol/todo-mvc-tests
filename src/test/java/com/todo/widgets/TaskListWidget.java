package com.todo.widgets;

import org.springframework.stereotype.Component;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class TaskListWidget {

    public List<String> getTaskNames() {
        return $$x("//div[@class='view']/label").texts();
    }

    public void completeTask(String taskName) {
        $x(String.format("//label[text()='%s']/../input", taskName)).click();
    }

    public boolean isTaskCompleted(String taskName) {
        return $x(String.format("//label[text()='%s']/../..", taskName))
                .getAttribute("class")
                .contains("completed");
    }
}
