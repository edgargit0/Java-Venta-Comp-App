package mundopc.modelo;

// Inheritance
class Keyboard extends InputDevice{
    private final int idKeyboard;
    private static int Keyboard_counter;
    
    //Constructor applies inheritance by calling the parent class
    public Keyboard(String device, String brand){
        super(device, brand);
        idKeyboard=++Keyboard_counter;
    }
    
    
    @Override
    public String toString(){
        return "Keyboard [" +
            "idKeyboard: " + idKeyboard +
            "]" + super.toString();
    }
    
}

