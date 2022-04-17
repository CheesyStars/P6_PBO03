package TP03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Animal {
    protected String name;
    protected String food;
    protected String location;

    public abstract void makeNoise ();
    public abstract void eat ();

    public void sleep () {
        System.out.println(name+ " Is Sleeping");
    }

    public void roam () {
        System.out.println(name+ " Is Roaming");
    }

    public void displayInfo () {
        System.out.println("Animal Name : " +name+ ", Food : " +food+ ", Location : " +location);
    }

}
