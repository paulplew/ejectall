import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// see ~/Automation/ejectall for bash script that calls getDisks.java

// getDisks
// sends the name of a file and searchString to parseDisks(String String)
public class getDisks {
  public static void main(String[] args) throws FileNotFoundException{
    System.out.println(parseDisks("/Users/paulplew/Automation/eject/diskUtilOutput", "/dev/disk"));
  }

// A File is the name of a file that exists in the System
// ex ~/Documents/file1
// ex /Users/$USER/Desktop/file2

// A SearchParamater is a case insensitive string
// ex "fIrE" would return the number of lines with: fIRE, fIRe, fIre, FiRe... ect.
// ex "iPhone"

// parseDisks : File SearchParamater -> int
// recieves a File as the first string and counts the number of lines
// that conatin at least one searchParamater

// test case files are available in ~/Automation/eject/TestCases
// parseDisks("~/Automation/eject/TestCase/test1" "p") will return 2
// parseDisks("~/Automation/eject/TestCase/test2" "milk") will return 5
  public static int parseDisks(String fileName, String searchString) throws FileNotFoundException {
    int numberOfDisks = 0;
    Scanner scan = new Scanner(new File(fileName));
    while (scan.hasNext()) {
      String line = scan.nextLine().toLowerCase().toString();
      if (line.contains(searchString)) {
        numberOfDisks++;
      }
    }
    return numberOfDisks;
  }
}
