/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import java.io.File;
import java.util.LinkedList;

public class StoreData{
    private File storageFolder;

    StoreData(File filepath){
        this.storageFolder = filepath;
    }

    public static Catalog loadLists(){
        // read catalog text file to create all lists in a new catalog
        // go through each list in the catalog and use csv parsing to read the data and add new items to each list
        // continue until all files are read and lists created
        return null;
    }

    public static Catalog loadLists(LinkedList<String> listNames){
        // use list name array to read list files from folder
        //use csv parsing to read the item data and add to list
        //continue until all lists in array is created-
        return null;
    }

    public static void saveToMemory(Catalog catalog){
        // go through each list in the catalog and parse the item data into a single large string
        // create a file writer for each list
        // create new file or overwrite old file with name of list '.txt'
        // read all file names in the folder that isn't the catalog file
        // create a new string with all the filenames as list names
        // print list name string to catalog file
    }

    public void saveToMemory(ToDoList list){
        // parse the item data into a single large string
        // create a file writer for list
        // create new file or overwrite old file with name of list '.txt'
        // read all file names in the folder that isn't the catalog file
        // create a new string with all the filenames as list names
        // print list name string to catalog file
    }
}
