class Lamp{
    public boolean isOn;
    public static void main(String args[]){
        Lamp led=new Lamp();
        Lamp halogen=new Lamp();
        led.switchOff();
        led.switchOn();
        System.out.println("Hello World");
    }
    public void switchOn(){
        isOn=true;
        System.out.println("Lights are on"+isOn);
    }
    public void switchOff(){
        isOn=false;
        System.out.println("Lights are on"+isOn);
    }
}