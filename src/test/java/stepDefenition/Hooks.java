package stepDefenition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Regration")
    public  void  launchApp(){
        System.out.println("launch the mobile App");

    }


    @After("@Mobile")
    public void closeApp(){
        System.out.println("close the mobile app");


    }

}
