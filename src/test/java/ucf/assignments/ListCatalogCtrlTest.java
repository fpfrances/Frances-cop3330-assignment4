/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import org.junit.jupiter.api.Test;

class ListCatalogCtrlTest{

    @Test
    void renameButtonClicked(){
        // create a new list
        // select list
        // click edit list button
        // fill prompt field with new list name
        // click submit button
        // assert that the list's name is the new name
    }

    @Test
    void newButtonClicked(){
        // click button
        // fill out text field for name
        // click submit button
        // assert that a new list exists with that name and 0 items
    }

    @Test
    void deleteButtonClicked(){
        // create new list
        // select list
        // click delete button
        // click confirm delete button
        // assert that no list with the original name exists
    }

    @Test
    void saveListButtonClicked(){
        // create list
        // add example items to list
        // select list
        // click save list
        // assert that the contents of the text file are a csv string of the list data
    }

    @Test
    void saveAllListsButtonClicked(){
        // create 2 lists
        // add example items to lists
        // click save all lists
        // assert that the contents of the text files are a csv string of the list data
    }
}