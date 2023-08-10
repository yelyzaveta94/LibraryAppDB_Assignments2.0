

//package com.library.steps;

//import com.library.pages.BookPage;
//import com.library.utility.BrowserUtil;
//import com.library.utility.DB_Util;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;

//import java.util.Map;


/*public class US04_StepDefs {

    BookPage bookPage = new BookPage();
    String globalBookName;


    @When("the user searches for {string} book")
    public void the_user_searches_for_book(String BookBorrow2) {
        globalBookName = BookBorrow2;
        bookPage.bookSearch(BookBorrow2);

    }
    @When("the user clicks edit book button")
    public void the_user_clicks_edit_book_button() {
        bookPage.editBook(globalBookName).click();

    }
    @Then("book information must match the Database")
    public void book_information_must_match_the_database() {

        String queryForSpecificBook = "SELECT * from books where name='BookBorrow2';";
        DB_Util.runQuery(queryForSpecificBook);
        Map<String, String> mapDataFromDB = DB_Util.getRowMap(1);
        System.out.println(mapDataFromDB);

        //get the name from DB
        String name_db = mapDataFromDB.get("name");
        //get name from ui
        BrowserUtil.waitFor(3);
        String name_ui = bookPage.getBookInfo("BookBorrow2");
        Assert.assertEquals(name_db,name_ui);
        //get year from db
        String year_db = mapDataFromDB.get("year");
        //get year from ui
        String year_ui = bookPage.getBookInfo("Year");
        Assert.assertEquals(year_db,year_ui);


    }

}

 */

