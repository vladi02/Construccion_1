/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2_practica;

import java.util.Date;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
//        Scanner cin=new Scanner(System.in);
//        personaNatural pn=new personaNatural();
//        personaJuridica pj=new personaJuridica();
//        pedido pd=new pedido();
//        Producto pr=new Producto("LECHE",8,10200,"cajas");
//        Producto pr1=new Producto("QUESO",10,8000,"MOLDE DE KILO");
//        Producto pr2=new Producto("MANTEQUILLA",3,12000,"BARRA");
//        FABRICA f1=new FABRICA();
//        int n,elegir,cantidad;
//        System.out.println("ELIGE QUE TIPO DE PERSONA ES :");
//        System.out.println("1 : PERSONA NATURAL");
//        System.out.println("2 : PERSONA JURIDICA");
//        n=cin.nextInt();
//        switch(n){
//            case 1:
//                   pn.setNombre("LUIS");
//                   pn.setApellidoP("RODRIGUEZ");
//                   pn.setApellidoM("TARAZONA");
//                   pn.setDNI("72550908");
//                   pn.setCorreo("LUIS@GMAIL.COM");
//                   pn.setTelefono("978234123");
//                   pn.setDireccion("AV.LOS PINOS");
//                   f1.AgregarPersonaN(pn);
//                   f1.AgregarProducto(pr);
//                   f1.AgregarProducto(pr1);
//                   f1.AgregarProducto(pr2);
//                   System.out.println("CLIENTE :");
//                   System.out.println(pn.PersonaNatural());
//                   System.out.println("ELIJA EL PRODUCTO A LLEVAR :");
//                   System.out.println("1: LECHE");
//                   System.out.println("2: QUESO ");
//                   System.out.println("3: MANTEQUILLA ");
//                   elegir=cin.nextInt();
//                   switch(elegir){
//                       case 1:
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                            pd.setCantidad(cantidad);
//                            pd.setFecha(new Date(118,04,25));
//                            pd.setNumero_pedido(2);
//                           if((cantidad<100)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr.getPrecio());
//                           }else
//                               System.out.println("CANTIDAD EXCEDIDAD PARA UNA PERSONA NATURAL");
//                           break;
//                       case 2:
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr1.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                            pd.setCantidad(cantidad);
//                            pd.setFecha(new Date(118,04,25));
//                            pd.setNumero_pedido(2);
//                           if((cantidad<100)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr1.getPrecio());
//                           }else
//                               System.out.println("CANTIDAD EXCEDIDAD PARA UNA PERSONA NATURAL");
//                           break;
//                       case 3:   
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr2.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                           pd.setCantidad(cantidad);
//                           pd.setFecha(new Date(118,04,25));
//                           pd.setNumero_pedido(2);
//                           if((cantidad<100)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr2.getPrecio());
//                           }else
//                               System.out.println("CANTIDAD EXCEDIDAD PARA UNA PERSONA NATURAL");
//                           break;
//                            default :
//                           System.out.println("ESE PRODUCTO AUN NO EXISTE");break;
//                   }
//                   System.out.println("DATOS COMPRA :");
//                   System.out.println(pd.toString());
//                   break;
//            case 2:
//                   pj.setNombreT("ASOCIADOS.SAC");
//                   pj.setRuc("01-43789");
//                   pj.setCorreo("ASOCIADOS.SAC@GMAIL.COM");
//                   pj.setDireccion("JR LOS BALCANES");
//                   pj.setTelefono("954645234");
//                   System.out.println("CLIENTE :");
//                   System.out.println(pj.personaJ());
//                   System.out.println("ELIJA EL PRODUCTO A LLEVAR :");
//                   System.out.println("1: LECHE");
//                   System.out.println("2: QUESO ");
//                   System.out.println("3: MANTEQUILLA ");
//                   elegir=cin.nextInt();
//                   switch(elegir){
//                       case 1:
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                            pd.setCantidad(cantidad);
//                            pd.setFecha(new Date(118,04,25));
//                            pd.setNumero_pedido(2);
//                           if((cantidad%100==0)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr.getPrecio());
//                           }else
//                               System.out.println("LA CANTIDAD A LLEVAR TIENE QUE SER MULTIPLO DE 100");
//                           break;
//                       case 2:
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr1.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                            pd.setCantidad(cantidad);
//                            pd.setFecha(new Date(118,04,25));
//                            pd.setNumero_pedido(2);
//                           if((cantidad%100==0)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr1.getPrecio());
//                           }else
//                               System.out.println("LA CANTIDAD A LLEVAR TIENE QUE SER MULTIPLO DE 100");
//                           break;
//                       case 3:   
//                           System.out.println("PRODUCTO :");
//                           System.out.println(pr2.toString());
//                           System.out.println("INGRESE LA CANTIDAD A LLEVAR :");
//                           cantidad=cin.nextInt();
//                           pd.setCantidad(cantidad);
//                           pd.setFecha(new Date(118,04,25));
//                           pd.setNumero_pedido(2);
//                           if((cantidad%100==0)){
//                           System.out.println("EL TOTAL A PAGAR SERA :");
//                           System.out.println(pd.getCantidad()*pr2.getPrecio());
//                           }else
//                               System.out.println("LA CANTIDAD A LLEVAR TIENE QUE SER MULTIPLO DE 100");
//                           break;
//                       default :
//                           System.out.println("ESE PRODUCTO AUN NO EXISTE");break;
//                   }
//                   System.out.println("DATOS COMPRA :");
//                   System.out.println(pd.toString());
//                   break;
//                
//                  default:
//                 System.out.println("NO EXISTE ESA OPCION DE PERSONA");break;
//        }
        
    }
}
