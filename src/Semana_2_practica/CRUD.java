/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2_practica;

/**
 *
 * @author Vladimir
 */
public interface CRUD {
      double platinum=250.50;
      double gold=150.50;
      double vip=95.00;
    public void agregarExpositor(Expositor e);
    public void AgregarAsistente(Asistente a);
    public void EliminarExpositor(String cod);
    public void EliminarAsistente(String cod);
}
