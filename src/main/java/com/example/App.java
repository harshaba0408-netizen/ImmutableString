package com.example;

import com.google.common.collect.ImmutableList;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        // Immutable String Example
        String s1 = "Hello";
        String s2 = s1;

        s1 = s1.concat(" World");

        System.out.println("Original String : " + s2);
        System.out.println("Modified String : " + s1);

        // Immutable List using Guava
        ImmutableList<String> fruits =
                ImmutableList.of("Apple", "Banana", "Cherry");

        System.out.println("Immutable List = " + fruits);

        // Source and destination files
        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        try {

            FileUtils.copyFile(sourceFile, destinationFile);

            System.out.println("File copied successfully!");

        }
        catch (IOException e) {

            System.out.println("Error : " + e.getMessage());

        }
    }
}
