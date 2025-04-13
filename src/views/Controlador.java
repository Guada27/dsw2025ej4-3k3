package views;

import data.Persistencia;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Controlador {
    public static Agregaranimal agregaranimales;
    public static Menuanimales menuanimales;
    
    public static TipoAlimentacion[] getTiposAlimentacion(){
        return  TipoAlimentacion.values();
    }
    public static ArrayList<Especie> getEspecies(){
        return Persistencia.getEspecies();
    }
    public static ArrayList<Sector> getSectores(){
        return Persistencia.getSectores();
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
    
     public static void vistalista(Menuanimales vista){
            vista.dispose();
            new ListarAnimalesView().setVisible(true);
    } 
     
     public static void salir(Menuanimales vista)
    {
        vista.dispose();
    }
     
     public static void vistaagregar (Menuanimales vista){
        vista.dispose();
        new Agregaranimal().setVisible(true);
    }
}
