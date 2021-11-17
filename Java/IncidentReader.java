import java.io.*;
import java.util.*;

public class IncidentReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "incidents1.txt";
        Scanner fileReader = new Scanner(new FileInputStream(fileName));
        String wholeFile = "";
        while(fileReader.hasNextLine()) {
            wholeFile += fileReader.nextLine() + "\n";
        }
        Scanner wholeFileScanner = new Scanner(wholeFile);
        // delmited by #
        wholeFileScanner.useDelimiter("\r?\n?[#]");
        while (wholeFileScanner.hasNext()) {
            // process the block
            String serviceGroup = wholeFileScanner.next();

            String lines[] = serviceGroup.split("\\r?\\n");
            // got the title
            for (int index = 0; index < lines.length; index++) {
                String currentLine = lines[index];
                if (index == 0) {
                    String title = currentLine;
                    System.out.println(title.trim());
                    continue;
                } 

                if (currentLine.charAt(0) == '*') {
                    System.out.println("\tThis is your splat: " + currentLine);
                }
            }
        }

        // get the incident

        
        // }
        wholeFileScanner.close();
    }

    public static String processIncident(String serviceGroup) {
        return "";
    }
    
}
