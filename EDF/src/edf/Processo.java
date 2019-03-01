package edf;

import java.awt.Color;
import java.util.ArrayList;

public class Processo {

    private int ID;
    private int C;
    private int T;
    private Color cor;

    public ArrayList<Deadline> deadlines;

    public Processo(int custo, int periodo, int ID, Color cor) {
        this.C = custo;
        this.T = periodo;
        this.ID = ID;
        this.cor = cor;
        deadlines = new ArrayList();
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getT() {
        return T;
    }

    public Color getCor() {
        return cor;
    }

    public int getID() {
        return ID;
    }

    public void setT(int T) {
        this.T = T;
    }

    //Cria novo deadline
    public void NovoDeadline(int estado) {
        if (this.deadlines.isEmpty()) {
            Deadline novoDeadLine = new Deadline(0, this.T, this.ID);  //(int inicio, int Final, int periodo)
            deadlines.add(novoDeadLine);
        } else {
            if (this.deadlines.get(deadlines.size() - 1).isFinalizado() == true) {
                int inicio = this.deadlines.get(deadlines.size() - 1).getFinal();
                int Final = inicio + this.T;
                Deadline novoDeadLine = new Deadline(inicio, Final, this.ID);  //(int inicio, int Final, int periodo)
                deadlines.add(novoDeadLine);
            }
            else if(estado > this.deadlines.get(deadlines.size() - 1).getFinal() )
            {
                Globais.deuruim = 1;
            }
        }
    }

    public void AtualizaDeadLines() {
        int qtdjobs = deadlines.get(deadlines.size() - 1).getQtdjobs();
        if (qtdjobs == C) {
            deadlines.get(deadlines.size() - 1).setFinalizado(true);
        }
    }

//    public boolean ChecaSeDeuRuim(int estado) {
//        for (int i = 0; i < deadlines.size(); i++) {
//            if ((this.deadlines.get(i).jobs.size() < this.C) & (this.deadlines.size() !=  estado/this.T)) {
//                return true;
//            }
//        }
//        return false;
//    }

}
