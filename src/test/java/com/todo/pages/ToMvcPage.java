package com.todo.pages;

import com.codeborne.selenide.Selenide;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ToMvcPage {

    @Value("${url}")
    String url;

    public void open(){
        Selenide.open(url);
        Selenide.executeJavaScript("window.localStorage.clear();");
    }
}
