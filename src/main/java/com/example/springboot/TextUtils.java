package com.example.springboot;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class TextUtils{

    public static String getText(){
        XStream xstream = new XStream(new StaxDriver());
        Customer customer = new Customer();
        return xstream.toXML(customer);
    }

}