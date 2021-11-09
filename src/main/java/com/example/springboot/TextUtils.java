import com.thoughtworks.xstream.XStream;

public class TextUtils{

    public static String getText(){
        XStream xstream = new XStream(new StaxDriver());
        Customer customer = new Customer();
        return xstream.toXML(customer);
    }

}