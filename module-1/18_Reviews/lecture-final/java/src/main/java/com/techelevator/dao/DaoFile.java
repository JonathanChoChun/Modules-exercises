package com.techelevator.dao;

import com.techelevator.handler.Logger;
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
    private Logger logger;

    public DaoFile(String directoryName, Logger logger) {
        this.directoryName = directoryName;
        this.logger = logger;
    }
    protected void Load(List<Object> listOfObjects, String fileIdentifier){
        //load files from directory
        File directory = new File(this.directoryName);
        if (!directory.isDirectory()) {
            throw new RuntimeException("Not a directory:" + directoryName);
        }
        //loop through all files

        for (File file : directory.listFiles()){
            this.logger.writeAudit("Reading - " + file.getName());
            try (Scanner currentFile = new Scanner(file)) {
                if (currentFile.hasNextLine()){
                    String typeOfFile = currentFile.nextLine();
                    if (typeOfFile.equalsIgnoreCase(fileIdentifier)) {
                        this.logger.writeAudit("Reading detail for - " + file.getName() + " - as a " + fileIdentifier);
                        LoadDetail(currentFile,listOfObjects);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public abstract void LoadDetail(Scanner curFile, List<Object> listOfObjects );

    protected Logger getLogger(){
        return this.logger;
    }
}
