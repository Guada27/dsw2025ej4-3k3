package views;

import data.Persistencia;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador {
    
    public static Agregaranimal agregaranimales;
    public static MenuPrincipalView menuanimales;


    public static void inicio()
    {
        new MenuPrincipalView().setVisible(true);
    }
    
    public static TipoAlimentacion[] getTiposAlimentacion(){
        return  TipoAlimentacion.values();
    }
    public static ArrayList<Especie> getEspecies(){
        return Persistencia.getEspecies();
    }
    public static ArrayList<Sector> getSectores(){
        return Persistencia.getSectores();
    }
    
    public static ArrayList<Pais> getPaises(){
        return Persistencia.getPaises();
        
    }
    
    public static ArrayList<AnimalViewModel> getAnimales(){
        ArrayList<AnimalViewModel> animales = new ArrayList<>();
        for(Mamifero animal : Persistencia.getAnimales()){
            animales.add(new AnimalViewModel(animal));
        }
        return animales;
    }
    
    public static ComidaViewModel  calcularComida(){
        double totalCarnivoros = Persistencia.getTotalComida(TipoAlimentacion.CARNIVORO);
        double totalHerbivoros = Persistencia.getTotalComida(TipoAlimentacion.HERBIVORO);
        return new ComidaViewModel(totalCarnivoros, totalHerbivoros);
    }
    
    
    public static void salir(MenuPrincipalView vista)
    {
        vista.dispose();
    }
    
    public static void vistaagregar (MenuPrincipalView vista){
        vista.dispose();
        new Agregaranimal().setVisible(true);
    }
    
    public static void volver(Agregaranimal vista)
    {
        vista.dispose();
        new MenuPrincipalView().setVisible(true);
    }
    
    
    public static void vistalista(MenuPrincipalView vista){
            vista.dispose();
            new ListarAnimalesView().setVisible(true);
    } 

    public static void volveer (ListarAnimalesView vista){
          vista.dispose();
           new MenuPrincipalView().setVisible(true);
    }
    
    
  public static void guardarAnimal(Mamifero mamifero){
        Persistencia.agregarAnimal(mamifero);
    }

  
}
