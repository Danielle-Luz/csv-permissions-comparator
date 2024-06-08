package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FileReader {

  public static Set<String> readUniqueLinesFromFile(String fileName) {
    String filePath = Paths.get("../resources/input", fileName).toString();
    Set<String> fileLines = new HashSet<>();

    try (
      BufferedReader reader = new BufferedReader(
        new java.io.FileReader(filePath)
      )
    ) {
      String line = reader.readLine();

      while (line != null) {
        fileLines.add(line);
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    return fileLines;
  }
}
