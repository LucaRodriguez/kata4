package kata4;

import kata4View.HistogramDisplay;
import kata4View.MailHistogramBuilder;
import kata4persistence.MailListReader;
import kata4model.Histogram;
import kata4model.Mail;
import java.util.List;

public class Kata4 {
   
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", histogram);
        histogramDisplay.execute();
    }
    
}
