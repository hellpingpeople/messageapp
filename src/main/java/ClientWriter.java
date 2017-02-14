import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by Alexander Vashurin on 2/14/17.
 */
public class ClientWriter {

    private String firstName;
    private String lastName;

    {

        try(FileWriter writer = new FileWriter("/home/alex/mnt/apache-servicemix-6.1.3/camel/outbox/message.xml", false))
        {
            // запись всей строки
            String t1 = setFirstName("Alexander");
            String t2 = setLastName("Vashurin");
            String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + '\n'+"<text>" + '\n'
                    +"<firstName>"+t1+"</firstName>" + '\n'+ "<lastName>"+t2+"</lastName>"+'\n'+ "<time>"+
                    Calendar.getInstance().getTime().toString()+"</time>" +'\n'+"</text>";
            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }


}