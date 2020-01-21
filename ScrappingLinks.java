import java.net.URL;
import java.util.Scanner;
import java.io.IOException;

public class ScrappingLinks {
    
    public static void main(String[] args) throws IOException{
        
        String address = "https://codeforces.com/";
        URL pageLocation = new URL(address);
        Scanner scn = new Scanner(pageLocation.openStream());
        
        while(scn.hasNext()){
            String line = scn.next();
            if(line.contains("href=\"http://") || line.contains("href=\"https://")){
                int basla = line.indexOf("\"");
                int bitir= line.lastIndexOf("\"");
                System.out.println(line.substring(basla + 1,bitir));
            }
        
        }
    }
    
}
