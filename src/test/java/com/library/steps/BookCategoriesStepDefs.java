package com.library.steps;

import com.library.pages.BookPage;
import com.library.utility.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BookCategoriesStepDefs {
    BookPage bookPage=new BookPage();

    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String moduleName) {
        bookPage.navigateModule(moduleName);
        BrowserUtil.waitFor(2);

    }
    @When("the user clicks book categories")
    public void the_user_clicks_book_categories() {
        List<String> actualCategories = BrowserUtil.getAllSelectOptions(bookPage.mainCategoryElement);
        System.out.println("actualCategories = " + actualCategories);

        // EXCLUDE ALL FROM UI
        actualCategories.remove(0);
        System.out.println("----AFTER EXCLUDE ALL FROM LIST ----");
        System.out.println("actualCategories = " + actualCategories);



    }
    @Then("verify book categories must match book_categories table from db")
    public void verify_book_categories_must_match_book_categories_table_from_db() {

    }
}
