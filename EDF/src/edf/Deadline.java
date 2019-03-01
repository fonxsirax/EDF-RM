/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Deadline {
    private int ID;
    private boolean finalizado;
    private int inicio;
    private int Final;
    private int periodo;
    public ArrayList<Job> jobs;
    public Deadline(int inicio, int Final,int ID)
    {
        this.inicio = inicio;
        this.Final = Final;
        this.periodo = Final - inicio;
        this.ID = ID;
        this.finalizado = false;
        this.jobs = new ArrayList();
    }
    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    public int getQtdjobs(){
        return jobs.size();
    }
    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }
    public int getID() {
        return this.ID;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public boolean AdicionarJobaEsseDeadLine(int estado)
    {
        if (estado >= this.inicio) {
        if(this.isFinalizado() == false){
            Job job1 = new Job(estado, estado +1);
            jobs.add(job1);
            //System.out.println("Job do processo " +this.ID +" foi criado no instante " + estado);
            Globais.ultimoJobarmengue = this.ID;
            return true;
        }
        else{
        return false;
        }
    }
        else{return false;}
    }
    
    
    /**
     * @return the inicio
     */
    public int getInicio()
    {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the Final
     */
    public int getFinal() {
        return Final;
    }

    /**
     * @param Final the Final to set
     */
    public void setFinal(int Final) {
        this.Final = Final;
    }
}