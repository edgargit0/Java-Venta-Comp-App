package mundopc.Modelo;

class Mouse extends InputDevice{
    private final int idMouse;
    private static int mouse_counter;
    
    //Constructor
    public Mouse(String device, String brand){
        super(device, brand);
        idMouse = ++mouse_counter;
    }
    
    @Override
    public String toString(){
        return "Mouse [" + 
            "idMouse: " + idMouse +
            "] " + super.toString();
    }
    
}
