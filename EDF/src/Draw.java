
import java.awt.Color;
import java.awt.Graphics;
import edf.Processo;
import edf.Deadline;
import edf.Globais;
import edf.Job;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.Object;
import javax.swing.JOptionPane;

public class Draw extends JPanel {

//	public static int WINDOW_WIDTH = 1000;
//	public static int WINDOW_HEIGHT = 100;
    public void main1() {
//		JFrame frame = new JFrame();
//		frame = new JFrame();
//		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Titulo");
//		frame.setLocationRelativeTo(null);
//		frame.setResizable(false);
//		
//		Draw clase = new Draw();
//		clase.setBackground(new Color(0,0,0));
//		frame.add(clase);
//		clase.setFocusable(true);
//		clase.requestFocusInWindow();
//		frame.setVisible(true);
    }

    public int mmc(ArrayList<Processo> processos) {
        int aux = 1;
        for (int i = 0; i < processos.size(); i++) {
            aux = lcm(aux, processos.get(i).getT());
        }
        return aux;
    }


    public void paintComponent(Graphics g) {    
        int estado = 0;
        int termino = 1;
        termino = mmc(Globais.processos) + 1;
        if (Globais.escalonamento.equals("rm")) {
            for (int i = 0; i < 50; i++) {
                g.drawString(String.valueOf(i), i * 40, 65);
            }
            while (termino != estado) {
                //Atualiza os deadlines
                for (int k = 0; k < Globais.processos.size(); k++) {
                    Globais.processos.get(k).NovoDeadline(estado);// ele so vai executar se um novo deadline precisar ser criado, ver metodo em processos
                }

                //Seta os Deadlines Finalizados para Finalizados
                for (int a = 0; a < Globais.processos.size(); a++) {
                    for (int b = 0; b < Globais.processos.get(a).deadlines.size(); b++) {
                        Globais.processos.get(a).AtualizaDeadLines();
                    }
                }

                //A cada estado:
                for (int i = 0; i < Globais.processos.size(); i++) {
                    int aux = Globais.processos.get(i).deadlines.size() - 1;              //aux = deadline cabeça
                    if (Globais.processos.get(i).deadlines.get(aux).AdicionarJobaEsseDeadLine(estado)) {
                        g.setColor(Globais.processos.get(i).getCor());
                        g.fillRect(40 * estado, 15, 40, 40);
                        break;
                    }

                }
                estado++;
                }
            }
        if (Globais.deuruim == 1) {
                    JOptionPane.showMessageDialog(null, "Não é escalonavel");
        }
    }

    public int lcm(int numero1, int numero2) {
        int n = 2;
        int resultado = 1;
        while (numero1 != 1 || numero2 != 1) {
            while (numero1 % n != 0 && numero2 % n != 0) {
                n++;
            }
            if (numero1 % n == 0) {
                numero1 = numero1 / n;
            }
            if (numero2 % n == 0) {
                numero2 = numero2 / n;
            }
            resultado *= n;
        }
        return resultado;
    }
}
