package Adapter;

import java.sql.SQLOutput;

public class Adaptee implements USB{

    @Override
    public void USBType(){
        System.out.println("USB 插口");
    }
}
