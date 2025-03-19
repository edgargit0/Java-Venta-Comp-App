package mundopc.Modelo;

class Computer{
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computer_counter;
    
    //Constructor
    private Computer(){
        idComputer = ++computer_counter;
    }
    
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this(); //calling private constructor
        this.name=name;
        this.monitor=monitor;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
    
    @Override
    public String toString(){
        return "Computer [" +
            "idComputer: " + idComputer + ", " +
            "name: " + name + ", " +
            "Monitor: " + monitor + ", " +
            "Keyboard: " + keyboard + ", " +
            "Mouse: " + mouse +
            "]";
    }   
}