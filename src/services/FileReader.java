package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FileReader {

  public static Set<String> readUniqueLinesFromFile(String fileName) {
    String projectRootFolderPath = new File("").getAbsolutePath();
    String filePath = Paths
      .get(projectRootFolderPath, "src/resources/input", fileName)
      .toString();

    Set<String> fileLines = new HashSet<>();

    try (
      BufferedReader reader = new BufferedReader(
        new java.io.FileReader(filePath)
      )
    ) {
      String line;
      do {
        line = reader.readLine();
        fileLines.add(line);
      } while (line != null);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    return fileLines;
  }
}
