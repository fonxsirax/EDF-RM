/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edf;

/**
 *
 * @author afons
 */
public class Job {
    private int Inicio;
    private int Final;
    private int ID;
    private int Ordem;
    private boolean Finalizado;
    public Job(int Inicio, int Final)
    {
        this.Inicio = Inicio;
        this.Final = Final;
    }
    
    
    /**
     * @return the Inicio
     */
    public int getInicio() {
        return Inicio;
    }

    /**
     * @param Inicio the Inicio to set
     */
    public void setInicio(int Inicio) {
        this.Inicio = Inicio;
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

    /**
     * @return the Ordem
     */
    public int getOrdem() {
        return Ordem;
    }

    /**
     * @param Ordem the Ordem to set
     */
    public void setOrdem(int Ordem) {
        this.Ordem = Ordem;
    }

    /**
     * @return the Finalizado
     */
    public boolean isFinalizado() {
        return Finalizado;
    }

    /**
     * @param Finalizado the Finalizado to set
     */
    
    
}
