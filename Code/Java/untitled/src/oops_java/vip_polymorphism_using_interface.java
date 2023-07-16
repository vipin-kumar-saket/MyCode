package oops_java;


interface MyCamera02{
    void takeSnap();
    void recordVideo();

    default void record4KVideo(){

        System.out.println("Recording in 4k...");
    }
}

interface MyWifi02{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone02{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone02 extends MyCellPhone02 implements MyWifi02, MyCamera02{
    public void takeSnap(){
        System.out.println("Taking snap....");
    }
    public void recordVideo(){
        System.out.println("Taking video....");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Vip", "Saurabh", "Resham"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class vip_polymorphism_using_interface {
    public static void main(String[] args) {

        MyCamera02 cam= new MySmartPhone02();  // This is a smartphone but use it as camera.
//        cam.getNetworks(); --->  Not allowed
//        cam.simpleMeth(); --->  Not allowed
        cam.record4KVideo();

        MySmartPhone02 s= new MySmartPhone02();
        s.connectToNetwork("hello VipinBhi");
        s.callNumber(7477);
        s.pickCall();
        s.recordVideo();
        s.takeSnap();
        s.sampleMeth();

    }
}
