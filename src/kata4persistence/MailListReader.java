package kata4persistence;

import kata4model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName) {
        BufferedReader reader = null;
        List<Mail> list = new ArrayList<>();
        try {
            
            reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if(line == null) break;
                if(Mail.isMail(line)){
                    list.add(new Mail(line));
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader:: read (File not found)" + exception.getMessage());          
        } catch (IOException exception){
            System.out.println("ERROR MailListReader:: read (File not found)" + exception.getMessage());
        }
        return list;
    }
    
}
