package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeePayRollServiceTest {
    //Checks File Exists
    @Test
    public void givenFileNameShouldReturnExists() throws IOException {
        Path path = Paths.get("E:\\JAVA");
        Assertions.assertTrue(Files.exists(path));

        //Create file
        Path path2 = Paths.get("E:\\JAVA\\Delete");
        Files.createFile(path2);
        Assertions.assertTrue(Files.exists(path2));

        //Delete File and check it not exists
        Path path1 = Paths.get("E:\\JAVA\\Delete");
        if (Files.exists(path1)){
            Files.delete(path1);
        }
        Assertions.assertFalse(Files.exists(path1));

        //Create Directory
        Path path3 = Paths.get("E:\\JAVA\\Create");
        Files.createDirectory(path3);

    }

}
