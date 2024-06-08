package model;

import java.util.Set;

public class FileComparisonResult {

  private final Set<String> missingRowsInTarget;
  private final Set<String> extraRowsInTarget;

  public FileComparisonResult(
    Set<String> missingRowsInTarget,
    Set<String> extraRowsInTarget
  ) {
    this.missingRowsInTarget = missingRowsInTarget;
    this.extraRowsInTarget = extraRowsInTarget;
  }

  public Set<String> getMissingRowsInTarget() {
    return missingRowsInTarget;
  }

  public Set<String> getExtraRowsInTarget() {
    return extraRowsInTarget;
  }
}
