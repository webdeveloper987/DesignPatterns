package my.design.creational.singleton;


public class PrintSpooler { 
    private static PrintSpooler spooler; 
 
    private PrintSpooler() { 
    } 
  //return only one spooler instance 
    public static synchronized PrintSpooler getSpooler() { 
        if (spooler == null)              //if none created 
            spooler = new PrintSpooler(); //create one 
        return spooler;                   //return it 
    } 
    public void print(String s) { 
        System.out.println(s); 
    } 
} 
