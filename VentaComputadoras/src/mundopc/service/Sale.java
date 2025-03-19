package mundopc.service;

import mundopc.modelo.Computer;
import java.util.List;
import java.util.ArrayList;

class Sale{
    private final int idSale;
    private final List<Computer> computers;
    private static int sale_counter;
    
    public Sale(){
        computers=new ArrayList<>();
        this.idSale=++sale_counter;
    }
    
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    
    public void showSale(){
        System.out.println("Sale #: " + idSale);
        System.out.println("Total Computers: " + computers.size());
        computers.forEach(System.out::println);
    }
    
}
