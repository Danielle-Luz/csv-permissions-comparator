package services;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

import model.FileComparisonResult;

public class FileComparator {

  public static FileComparisonResult compareFileContents(
    String targetFileName,
    String referenceFileName
  ) {
    Set<String> targetFileLines = FileReader.readUniqueLinesFromFile(targetFileName);
    Set<String> referenceFileLines = FileReader.readUniqueLinesFromFile(referenceFileName);
    
    Set<String> extraRowsInTarget = Sets.difference(targetFileLines, referenceFileLines);
    Set<String> missingRowsInTarget = Sets.difference(referenceFileLines, targetFileLines);

    return new FileComparisonResult(missingRowsInTarget, extraRowsInTarget);
  }
}
