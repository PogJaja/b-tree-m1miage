package fr.miage.fsgbd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataGenerate {
    public static void main(String[] args) throws IOException {
        FileWriter filewriter = new FileWriter("data.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        DataCreator dataCreator = new DataCreator();

        for (int i = 0; i < 10000; i++) {
            printWriter.println(dataCreator.generateSocialSecurityNumber() + "," +
                    dataCreator.generateFirstName() + "," + dataCreator.generateLastName() + "," +
                    dataCreator.generatePhoneNumber() + "," + dataCreator.generateAddress());
        }
    }
}

