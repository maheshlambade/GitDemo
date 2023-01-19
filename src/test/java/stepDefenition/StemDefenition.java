package stepDefenition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;

@RunWith(Cucumber.class)
public class StemDefenition {

    @Given("User launch browser")
    public void user_launch_browser() {
        System.out.println("chrome launch");
    }
    @When("User enter URL")
    public void user_enter_url() {
        System.out.println("user enter url");
    }
    @Then("Home page will display")
    public void home_page_will_display() {
        System.out.println("applicatin homepage is display");
    }



    @Given("User is on login page")
    public void user_is_on_login_page() {

    }
    @When("User enter valid username {string} and password {string}")
    public void user_enter_valid_username_and_password(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);

    }
    @When("User click on loging button")
    public void user_click_on_loging_button() {

    }


    @When("User enter following detail")
    public void user_enter_following_detail(DataTable data) {
        List<List<String>>li =data.asLists();
        System.out.println(li.get(0).get(0));
        System.out.println(li.get(0).get(1));
        System.out.println(li.get(0).get(2));
        System.out.println(li.get(0).get(3));
        System.out.println(li.get(0).get(4));
        System.out.println(li.get(0).get(5));

    }
    @When("User enter {string} in user field")
    public void user_enter_in_user_field(String Validuid) {
        System.out.println(Validuid);

    }
    @And("user enter {string} in password field")
    public void user_enter_in_password_field(String Vluablepwd) {
        System.out.println(Vluablepwd);
    }
    @And("user click on signin buttern")
    public void user_click_on_signin_buttern() {
        System.out.println("user click on login button");
    }
    @Then("faild login will display")
    public void faild_login_will_display() {
        System.out.println("faild screen will be displayed");
    }



    @Then("Title will display")
    public void title_will_display() {

    }

}
