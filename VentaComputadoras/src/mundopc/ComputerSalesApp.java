package mundopc;

import mundopc.modelo.Computer;
import mundopc.modelo.Monitor;
import mundopc.modelo.Mouse;
import mundopc.modelo.Keyboard;
import mundopc.service.Sale;

public class ComputerSalesApp {
    public static void main(String[] args) throws Exception {
        // Crear objetos
    Mouse mouseLenovo = new Mouse("bluetooth", "Lenovo");
    //System.out.println(MouseLenovo);
    Keyboard keyboardLenovo = new Keyboard("bluetooth", "Lenovo");
    //System.out.println(KeyboardLenovo);
    Monitor monitorLenovo = new Monitor("Lenovo", 27);
    //System.out.println(monitorLenovo);
    // Creamos un objeto de tipo Computer
    Computer computerLenovo =
            new Computer("Computer Lenovo", monitorLenovo,
                    keyboardLenovo, mouseLenovo);
    //System.out.println(ComputerLenovo);

    // Objeto Computer
    Monitor monitorDell = new Monitor("Dell", 15);
    Keyboard keyboardDell = new Keyboard("usb", "Dell");
    Mouse mouseDell = new Mouse("usb", "Dell");
    Computer computerDell = new Computer("Computer Dell",
            monitorDell, keyboardDell, mouseDell);

    // Creamos una Sale
    Sale Sale1 = new Sale();
    Sale1.addComputer(computerLenovo);
    Sale1.addComputer(computerDell);
    Sale1.showSale();

    // Computer Mac
    Monitor monitorMac = new Monitor("Mac", 27);
    Keyboard keyboardMac = new Keyboard("bluetooth", "Mac");
    Mouse mouseMac = new Mouse("bluetooth", "Mac");
    Computer computerIMac = new Computer("iMac",
            monitorMac, keyboardMac, mouseMac);

    Sale Sale2 = new Sale();
    Sale2.addComputer(computerIMac);
    Sale2.addComputer(computerDell);
    Sale2.addComputer(computerLenovo);
    System.out.println();
    Sale2.showSale();
    }
}
