package activities;

import org.openqa.selenium.By;

import java.awt.*;

public class MainScreen {

    public Button addButton = new Button(By.id("com.splendapps.splendo:id/fabAddTask"));

    public Label getTaskName(String name){
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+name+"']")));
        return nameTask;
    }

}
