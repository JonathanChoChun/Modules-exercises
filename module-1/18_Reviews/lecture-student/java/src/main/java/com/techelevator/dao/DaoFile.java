package com.techelevator.dao;

import com.techelevator.model.Album;
import com.techelevator.model.Track;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DaoFile {
    private String directoryName;

    public DaoFile(String directoryName) {
        this.directoryName = directoryName;
    }
    protected void Load(List<Object> listOfObjects, String fileIdentifier){
        //load files from directory
        File directory = new File(this.directoryName);
        if (!directory.isDirectory()) {
            throw new RuntimeException("Not a directory:" + directoryName);
        }
        //loop through all files

        for (File file : directory.listFiles()){
            try (Scanner currentFile = new Scanner(file)) {
                if (currentFile.hasNextLine()){
                    String typeOfFile = currentFile.nextLine();
                    if (typeOfFile.equalsIgnoreCase(fileIdentifier)) {
                        LoadDetail(currentFile,listOfObjects);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public abstract void LoadDetail(Scanner curFile, List<Object> listOfObjects );
}
