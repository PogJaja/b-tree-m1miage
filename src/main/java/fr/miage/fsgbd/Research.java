package fr.miage.fsgbd;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Research {

    public void writeInReportFile(String string){
        try {
            File myObj = new File("report.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            try {
                FileWriter myWriter = new FileWriter("report.txt",true);
                myWriter.write(string+"\n");
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
