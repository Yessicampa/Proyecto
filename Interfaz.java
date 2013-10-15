
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
		
        
/**
 *
 * @author Yessicampa
 */
public class Interfaz extends JFrame implements ActionListener{
    JLabel l1=new JLabel("Aspirantes Registrados en la bolsa");
//    JList lista= new JList();
    TextArea ta = new TextArea("Para desplegar la lista",5,20,TextArea.SCROLLBARS_BOTH);
    JLabel l2= new JLabel("Agregar Aspirante");
    JLabel l3= new JLabel("Nombre");
    JTextField t1= new JTextField();
    JLabel l4= new JLabel("Edad");
    JTextField t2= new JTextField();
    JLabel l5= new JLabel("Profesión");
    Choice ch1= new Choice();
    JLabel l6= new JLabel("Años experencia");
    JTextField t3= new JTextField();
    JLabel l7= new JLabel("Telefono");
    JTextField t4= new JTextField();
    JButton b1= new JButton("Agregar");
    JButton b2= new JButton("Buscar");
    
    JLabel l8= new JLabel("Datos del Aspirante");
    JLabel l9= new JLabel("Nombre");
    JTextField t5= new JTextField();
    JLabel l10= new JLabel("Edad");
    JTextField t6= new JTextField();
    JLabel l11= new JLabel("Profesión");
    JTextField t7= new JTextField();
    JLabel l12= new JLabel("Experencia");
    JTextField t8= new JTextField();
    JLabel l13= new JLabel("Telefono");
    JTextField t9= new JTextField();
    
    JLabel l14= new JLabel("Buscar y Ordenar");
    JButton b3= new JButton("Ordenar por experiencia");
    JButton b4= new JButton("Ordenar por edad");
    JButton b5= new JButton("Ordenar por profesión");
    JButton b6= new JButton("Buscar por nombre");
    
    JLabel l15= new JLabel("Consultas"); 
    JButton b7= new JButton("Más Joven");
    JButton b8= new JButton("Mayor Edad");
    JButton b9= new JButton("Mayor Experiencia");
    JButton b10= new JButton("Eliminar Aspirante");
    String cadena = "";
    //Instancia la clase metodos
    Metodos met = new Metodos();
    
    //Constructor
    
    public Interfaz(){
        super("Bolsa de Empleo");
        this.setLayout(null);
        ch1.addItem("Ingeniero de Sistemas");
        ch1.addItem("Ingeniero Industrial");
        ch1.addItem("Ingeniero Mecánico");
        ch1.addItem("Ingeniero AgroIndustrial");
        ch1.addItem("Ingeniero Electronico");
        ch1.addItem("Economista");
        ch1.addItem("Administrador");
        ch1.addItem("Contador");
        ch1.addItem("Enfermera(o)");
        
        //Se crean las etiquetas y se agregan al 
        
        this.l1.setBounds(10, 10, 220, 23);
	this.add(l1);
        
        //this.lista.setBounds(10,40,480,150);
        //this.add(lista);
        
        this.ta.setBounds(10,40,480,150);
        this.add(ta);
        this.l2.setBounds(10, 200, 120, 23);
	this.add(l2);
        
        this.l3.setBounds(10, 230, 110, 23);
	this.add(l3);
        this.t1.setBounds(120,230,170,23);
        this.add(t1);
        
        this.l4.setBounds(10, 260, 110, 23);
	this.add(l4);
        this.t2.setBounds(120,260,170,23);
        this.add(t2);
        
        this.l5.setBounds(10, 290, 110, 23);
	this.add(l5);
        this.ch1.setBounds(120,290,170,23);
        this.add(ch1);
        
        this.l6.setBounds(10, 320, 110, 23);
	this.add(l6);
        this.t3.setBounds(120,320,170,23);
        this.add(t3);
        
        this.l7.setBounds(10, 350, 110, 23);
	this.add(l7);
        this.t4.setBounds(120,350,170,23);
        this.add(t4);
        
        this.b1.setBounds(10, 380, 130, 25);
        this.b1.addActionListener(this);
        this.add(b1);
        
        this.b2.setBounds(160, 380, 130, 25);
        this.b2.addActionListener(this);
        this.add(b2);
        
        this.l8.setBounds(520, 10, 220, 23);
        this.add(l8);
        
        this.l9.setBounds(520, 40, 110, 23);
        this.add(l9);
        this.t5.setBounds(630, 40, 170, 23);
        this.add(t5);
        
        this.l10.setBounds(520, 70, 110, 23);
        this.add(l10);
        this.t6.setBounds(630, 70, 170, 23);
        this.add(t6);
        
        this.l11.setBounds(520, 100, 110, 23);
        this.add(l11);
        this.t7.setBounds(630, 100, 170, 23);
        this.add(t7);
        
        this.l12.setBounds(520, 130, 110, 23);
        this.add(l12);
        this.t8.setBounds(630, 130, 170, 23);
        this.add(t8);
        
        this.l13.setBounds(520, 160, 110, 23);
        this.add(l13);
        this.t9.setBounds(630, 160, 170, 23);
        this.add(t9);
    
        this.l14.setBounds(330, 200, 170, 23);
        this.add(l14);
    
        this.b3.setBounds(390, 240, 180, 25);
        this.b3.addActionListener(this);
        this.add(b3);
        
        this.b4.setBounds(390, 280, 180, 25);
        this.b4.addActionListener(this);
        this.add(b4);
        
        this.b5.setBounds(390, 320, 180, 25);
        this.b5.addActionListener(this);
        this.add(b5);
        
        this.b6.setBounds(390, 360, 180, 25);
        this.b6.addActionListener(this);
        this.add(b6);
        
        this.l15.setBounds(650,200,180,23);
        this.add(l15);
        
        this.b7.setBounds(690, 240, 180, 25);
        this.b7.addActionListener(this);
        this.add(b7);
        
        this.b8.setBounds(690, 280, 180, 25);
        this.b8.addActionListener(this);
        this.add(b8);
        
        this.b9.setBounds(690, 320, 180, 25);
        this.b9.addActionListener(this);
        this.add(b9);
        
        this.b10.setBounds(690, 360, 180, 25);
        this.b10.addActionListener(this);
        this.add(b10);
        
        
        //Se hace inmodificables algunas cajas de texto
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t9.setEditable(false);
        
        //Cerrar el formulario
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Tamaño del freme
        this.setSize(900,440);
        //No se puede modificar tamaño
        this.setResizable(false);
        //hace visible el frame
        this.setVisible(true);
	
    }
    //MAIN
    /**
     * Ejecuta la aplicacion
     * @param args son los parámetros de ejecución de la aplicación.
     */
    public static void main(String[] args) {
        new Interfaz();
    }
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource()==b1){

                if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog( this, "Debe ingresar valores en todos los campos", "Error", JOptionPane.ERROR_MESSAGE );
                }else{
                    
                        Nodo no=  new Nodo();no.Nombre=t1.getText();
                        no.Edad=Integer.parseInt(t2.getText());
                        no.Profesion=ch1.getSelectedIndex();                           
                        no.AnosExperiendia=Integer.parseInt(t3.getText());
                        no.Telefono=Integer.parseInt(t4.getText());
                        if(no.Edad<no.AnosExperiendia){
                        JOptionPane.showMessageDialog( this, "La experiencia no debe superar la edad", "Error", JOptionPane.ERROR_MESSAGE );
                        }
                        else
                        {
                        if(no.Edad<18){
                        JOptionPane.showMessageDialog( this, "Aspirante Menor de Edad", "Error", JOptionPane.ERROR_MESSAGE );
                        }
                        else
                        {
                        met.agregar(no);
                        cadena = met.listar();
                        ta.setText(cadena);
                        limpiar();
                        }
                        }
                }
        }
        
        if (evento.getSource()==b2){
        Nodo no=new Nodo();
        Nodo tmp = null;

        
        if(no==tmp){
        	       JOptionPane.showMessageDialog( this, "No hay Aspirantes que buscar", "Error", JOptionPane.ERROR_MESSAGE );
        }else{
            //nos movemos hasta el final imprimiendo nodo por nodo
            int i=0;
            String idNombre;
            idNombre=JOptionPane.showInputDialog("Digite el nombre a buscar");
            
            while (tmp != null){
            	if(idNombre.equals(tmp.Nombre)){
            		String mapto = "";

                        t5.setText(tmp.Nombre);
                       
                       
                }
                tmp = tmp.ptr;
                i++;
            }
        }}
   
    if (evento.getSource()==b4){
        Nodo no=new Nodo();
        cadena= met.OrdenamientoBurbuja(no);
        ta.setText(cadena);
    }
     
    }
          
    private void limpiar() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
	t1.requestFocus();

    }
    
}
