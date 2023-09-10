import java.io.*;
import java.util.List;

public class ShowContactSummary {
    public static void main(String[] args) {
        String fileName = "/Users/anthelion/Desktop/java_practice/kisso2/contact.csv";
        File file = new File(fileName);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "Shift-JIS"
            ));

            System.out.println("|======|==========|=========|=====|=======|");
            System.out.println("| name | birthday | address | tel | email |");
            System.out.println("|======|==========|=========|=====|=======|");
            List<>

            for (String line; (line = reader.readLine()) != null; ) {
                System.out.println("|"+ line + "|");
            }
        }catch (UnsupportedEncodingException exception) {
            System.err.println(exception);
        }catch (FileNotFoundException exception) {
            System.err.println(exception);
        }catch (IOException exception) {
            System.err.println(exception);
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }
    }





}
