package com.library.steps;

import com.library.pages.BookPage;
import com.library.utility.BrowserUtil;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs {



    @When("I execute query to find most popular book genre")
    public void i_execute_query_to_find_most_popular_book_genre() {
        String queryOfMostPopularCategory="select name from book_categories\n" +
                "            where id=(select book_category_id from books\n" +
                "             where id=(select book_id from book_borrow group by book_id order by count(*) desc limit 1))\n" +
                ";";
        DB_Util.runQuery(queryOfMostPopularCategory);

    }
    @Then("verify {string} is the most popular book genre.")
    public void verify_is_the_most_popular_book_genre(String expectedFromUser) {
        String actualFromDB = DB_Util.getFirstRowFirstColumn();
        System.out.println("actualFromDB =" + actualFromDB);
        Assert.assertEquals(expectedFromUser, actualFromDB);
        System.out.println("expectedFromUser = " + expectedFromUser);


    }



}





