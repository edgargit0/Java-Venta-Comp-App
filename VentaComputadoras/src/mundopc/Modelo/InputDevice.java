package mundopc.Modelo;

// Computer Sales App
class InputDevice{
    private String device;
    private String brand;
    
    public InputDevice(String device, String brand){
        this.device=device;
        this.brand=brand;
    }
    
    //getters-setters
    public String getDevice(){
        return device;
    }
    
    public void setDevice(String device){
        this.device=device;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    @Override
    public String toString(){
        return "InputDevice [" + 
            "device: " + device + ", " +
            "brand: " + brand +
            "]";
    }
    
}
