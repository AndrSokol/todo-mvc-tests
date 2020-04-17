package com.todo.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Component
public class AddTaskWidget {
    private SelenideElement createTaskInputField = $x("//input[@ng-model='newTodo']");

    public void createNewTask(String taskName) {
        createTaskInputField.sendKeys(taskName);
        createTaskInputField.sendKeys(Keys.ENTER);
    }
}
