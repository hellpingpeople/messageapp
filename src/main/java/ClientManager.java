import java.io.*;
import java.nio.file.*;
import java.util.Calendar;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by Alexander Vashurin on 2/14/17.
 */


/** Этот класс сделан для чтения из файла*/

public class ClientManager {

    {

        try(FileReader reader = new FileReader("/home/alex/mnt/apache-servicemix-6.1.3/camel/outbox/test.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
