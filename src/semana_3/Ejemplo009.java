/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import java.util.ArrayList;
import java.util.Iterator;

class Empleado{
    private String codigo;
    private String nombre;
    private String area_laboral;
    private double sueldo;
    private int h_extras;
    private String afil_Seguro;

    public Empleado() {
    }

    
    public Empleado(String codigo, String nombre, String area_laboral, double sueldo, int h_extras, String afil_Seguro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area_laboral = area_laboral;
        this.sueldo = sueldo;
        this.h_extras = h_extras;
        this.afil_Seguro = afil_Seguro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea_laboral() {
        return area_laboral;
    }

    public void setArea_laboral(String area_laboral) {
        this.area_laboral = area_laboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getH_extras() {
        return h_extras;
    }

    public void setH_extras(int h_extras) {
        this.h_extras = h_extras;
    }

    public String getAfil_Seguro() {
        return afil_Seguro;
    }

    public void setAfil_Seguro(String afil_Seguro) {
        this.afil_Seguro = afil_Seguro;
    }
    public double MontoHExtras(){
        return ((this.getSueldo()*this.getH_extras())/240);
    }
    public double MontoSeguro(){
        double sueldo=0.0;
        if(this.getAfil_Seguro().equals("AFP")){
            sueldo=this.getSueldo()*0.17;
        }else
            sueldo=this.getSueldo()*0.05;
        
        return sueldo;
    }
    public double MontoEsSalud(){
        return this.getSueldo()*0.03;
    }
    public double Descuento(){
        return this.MontoSeguro()+this.MontoEsSalud();
    }
    public double SueldoBruto(){
        return this.sueldo+this.MontoHExtras();
    }
    public double SueldoNeto(){
        return this.SueldoBruto()-this.Descuento();
    }

    @Override
    public String toString() {
        return "Empleado :"+ "\ncodigo :"+codigo+"\nnombre :"+nombre+"\narea_laboral :"+area_laboral+
               "\nsueldo :"+sueldo+"\nh_extras :"+h_extras+"\nafil_Seguro :"+afil_Seguro+
                "\nMONTO HORAS EXTRAS :"+this.MontoHExtras()+ "\nMONTO SEGURO :"+this.MontoSeguro()+
                 "\nMONTO ESSALUD :"+this.MontoEsSalud()+ "\nMONTO DESCUENTO :"+this.SueldoBruto()+
                 "\nMONTO SUELDO NETO :"+this.SueldoNeto();
    }
    
}
 class trabajador {
     ArrayList<Empleado>ListEmpleado=new ArrayList<>();
     Empleado e1;
     public trabajador(){
         
     }
     public void agregar(Empleado e){
         ListEmpleado.add(e);
     }
     public void modificar(int pos,Empleado e){
         ListEmpleado.set(pos, e);
     }
      public String MayorSueldo(){
         double mayor=0.0;
         String cad="";
         for(Empleado e1:ListEmpleado){
             if(e1.SueldoNeto()>mayor){
                 mayor=e1.SueldoNeto();
             }    
          for(Empleado e:ListEmpleado){
             if(e1.SueldoNeto()==mayor){
                 cad=e1.getNombre()+" ";
             }
         }
     }
         return cad;
    } 
     public double PromedioNeto(){
         double promedio=0.0;
         for(int i=0;i<ListEmpleado.size();i++){
             if(ListEmpleado.get(i).getArea_laboral().equalsIgnoreCase("SNP")){
                 promedio+=e1.SueldoNeto();
             }
         }
         return promedio;
     }
     public int Num_Empleados(){
         int cont=0;
         for(Empleado e1:ListEmpleado){
             if(e1.MontoSeguro()>100){
                 cont++;
             }    
         }
         return cont;
     }
     public int Num_Horas(){
         int nhoras=0;
         for(Empleado e1:ListEmpleado){
             if((e1.getH_extras()>=500)&&(e1.getH_extras()<=800)){
                 nhoras++;
             }
         }
         return nhoras;
     }
     public String Menor_SNP(){
         String nom = "";
        double min = ListEmpleado.get(0).Descuento();
        for(int i=0;i<ListEmpleado.size();i++){
            if(ListEmpleado.get(i).getArea_laboral().equalsIgnoreCase("SNP"))
                if(ListEmpleado.get(i).Descuento()<min)
                    nom = ListEmpleado.get(i).getNombre();
        }
        return nom;
     }
     public double Gasto_total(){
         double sum=0.0;
         for(Empleado e1:ListEmpleado){
             sum+=e1.SueldoNeto();
         }
         return sum;
     }

     @Override
    public String toString() {
    return "Empleado con Mayor Sueldo Neto: "+MayorSueldo()+"\nPromedio de Sueldos netos del área de Marketing: "+this.PromedioNeto()+
   "\nNumero de Empleados Monto Seguro superen los 100 soles : "+this.Num_Empleados()+" \nHoras Extras entre 500 y 800 : "+this.Num_Horas()
   +"\nEmpleado del SNP con el menor monto de Descuento :"+this.Menor_SNP()+"\nTotal Pagar la Empresa: "+this.Gasto_total();
    }
 }
public class Ejemplo009 {
     static int aleatorio(int min,int max){
        return (int) ((Math.random() * (max - min)) + min);
      }
    public static void main(String[] args) {
        final String AREALABORAL[] ={"Sistemas","Administración","Marketing"};    
        final String AFILIACION[] = {"AFP","SNP"};  
        trabajador t1=new trabajador();
        Empleado emp1 = new Empleado("0002", "Carlos",AREALABORAL[aleatorio(0, 2)],2000,110,AFILIACION[aleatorio(0, 1)]);
        Empleado emp2 = new Empleado("0002", "Luis",AREALABORAL[aleatorio(0, 2)],5000,100,AFILIACION[aleatorio(0, 1)]);
        Empleado emp3 = new Empleado("1232", "Pedro",AREALABORAL[aleatorio(0, 2)],5000,120,AFILIACION[aleatorio(0, 1)]);
        Empleado emp4 = new Empleado("1232", "Pablo",AREALABORAL[aleatorio(0, 2)],5000,99,AFILIACION[aleatorio(0, 1)]);
        emp1.MontoHExtras();
        emp1.MontoSeguro();
        emp1.MontoEsSalud();
        emp1.Descuento();
        
        emp2.MontoHExtras();
        emp2.MontoSeguro();
        emp2.MontoEsSalud();
        emp2.Descuento();
        
        emp3.MontoHExtras();
        emp3.MontoSeguro();
        emp3.MontoEsSalud();
        emp3.Descuento();
        
        emp4.MontoHExtras();
        emp4.MontoSeguro();
        emp4.MontoEsSalud();
        emp4.Descuento();
        
        t1.agregar(emp1);
        t1.agregar(emp2);
        t1.agregar(emp3);
        t1.agregar(emp4);
        //t1.modificar(0, emp4);
        t1.MayorSueldo();
        t1.Gasto_total();
        t1.Num_Empleados();
        t1.Num_Horas();
        t1.PromedioNeto();
        t1.Gasto_total();
        System.out.println(t1.toString());
       
       }
   
}
  