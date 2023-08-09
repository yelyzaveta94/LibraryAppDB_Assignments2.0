package com.library.steps;

import com.library.pages.DashBoardPage;
import com.library.pages.LoginPage;
import com.library.utility.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefs {

    // US02
    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {


        loginPage.login(user);
        BrowserUtil.waitFor(2);

    }
    @When("the librarian gets borrowed books number")
    public void the_librarian_gets_borrowed_books_number() {

        // OPT 1 --> WEBELEMENT
        String actualBorrowedBook = dashBoardPage.borrowedBooksNumber.getText();
        System.out.println("actualBorrowedBook = " + actualBorrowedBook);

        // OPT 2 --> METHOD
        System.out.println("dashBoardPage.getModuleCount(\"Borrowed Books\") = " + dashBoardPage.getModuleCount("Borrowed Books"));

    }
    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {

    }
}
