import model.FileComparisonResult;
import services.FileComparator;
import services.FileDifferencesWriter;

public class FileComparisonApp {

  public static void main(String[] args) {
    String targetFileName = "appPermissions.csv";
    String referenceFileName = "idmsPermissions.csv";

    FileComparisonResult comparisonResult = FileComparator.compareFileContents(
      targetFileName,
      referenceFileName
    );

    FileDifferencesWriter.writeDifferencesToFile(comparisonResult);
  }
}
