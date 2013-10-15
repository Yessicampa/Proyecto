
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yessicampa
 */
public class Metodos {
//el puntero al primer elemento
    private Nodo root;
    //el total de nodos en la lista
    private int numNodos;
//el constructor inicializa las variables
    public Metodos(){
        root = null;
        numNodos = 0;
    }
    
    //Agrega un nodo a la lista
    public void agregar(Nodo newNodo){
        
        int i =0;
        
        //puntero temporal para recorreme en la lista
        Nodo tmp = root;
       
              
                   //si la lista esta vacia
                    if(tmp==null){
                        //lo agregamos al root
                        root = newNodo;
                    }else{
                        //de lo contrario nos recorremos hasta el ultimo
                        while(tmp.ptr!=null)
                            tmp = tmp.ptr;

                        //en el ultimo hacemos el enlace 
                        tmp.ptr = newNodo;
                         
                    }
                    //incrementamos el numero de nodos
                    numNodos++;
                    
              
    }
       public String listar(){
        //puntero que se movera sobre la lista
        Nodo tmp = root;
         String cadena="Nombre Profesion";
        //sercirandonos que no este vacia
        if(tmp==null){
        	JOptionPane.showMessageDialog(new JDialog(), "Lista Vacia");
        }else{
            //nos movemos hasta el final imprimiendo nodo por nodo
            int i=0;
            String mapto = "";
            while (tmp != null){
            	cadena = cadena +"\n"+tmp.Nombre+" ("+tmp.Profesion+")";
            		if(tmp.Profesion==0){
                            mapto = "Ingeniero de Sistemas";
                       }
                       if(tmp.Profesion==1){
                            mapto = "Ingeniero Industrial";
                       }
                       if(tmp.Profesion==2){
                            mapto = "Ingeniero Mecánico";
                       }
                       if(tmp.Profesion==3){
                            mapto = "Ingeniero Agroindustrial";
                       }                       
                       if(tmp.Profesion==4){
                            mapto = "Ingeniero Agroindustrial";
                       }                        
                       if(tmp.Profesion==5){
                            mapto = "Ingeniero Electrónico";
                       } 
                       if(tmp.Profesion==6){
                            mapto = "Economista";
                       } 
                       if(tmp.Profesion==7){
                            mapto = "Administrador";
                       } 
                       if(tmp.Profesion==8){
                            mapto = "Contador";
                       } 
                       if(tmp.Profesion==9){
                            mapto = "Enfermera";
                       } 
                       
         
        		cadena = cadena + "("+mapto+ ")";
        		tmp = tmp.ptr;
                i++;
            }
        }
        return (cadena);
    }

    public String OrdenamientoBurbuja(Nodo no) {
        
    }
   
       
}