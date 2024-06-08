package services;

import java.util.Set;

import model.FileComparisonResult;

public class FileDifferencesWriter {
  public static void writeDifferencesToFile(FileComparisonResult comparisonResult) {
    Set<String> missingRowsInTarget = comparisonResult.getMissingRowsInTarget();
    Set<String> extraRowsInTarget = comparisonResult.getExtraRowsInTarget();

    missingRowsInTarget.stream().forEach(line -> System.out.println(line + ",ADD"));
    extraRowsInTarget.stream().forEach(line -> System.out.println(line + ",REMOVE"));
  }
}
