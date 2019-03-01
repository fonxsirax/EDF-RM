//package edf;
//
//import java.util.ArrayList;
//import java.util.Set;
//import javax.swing.plaf.basic.BasicSplitPaneUI;
//import java.util.Scanner;
//public class EDF{
//
//    /**
//     * @param args the command line arguments
//     */
////    public static void main(String[] args) {
////        ArrayList<Processo> processos = new ArrayList<>();
////        while(true){
////        System.out.println("Bem vindo ao menu (1)Iniciar um novo processo (2) Iniciar escalonamento por RM (3) debug");
////        System.out.println("Atualmente existem " + processos.size() + " processos adicionados");   
////        Scanner keyboard = new Scanner(System.in);
////        int opcoes = keyboard.nextInt();
////        switch(opcoes){
////            case 1:
////                System.out.println("Insira o ID, custo e o periodo do processo");
////                int custo = keyboard.nextInt();
////                int periodo = keyboard.nextInt();
////                int id = keyboard.nextInt();
////                Processo p = new Processo(custo, periodo, id);
////                processos.add(p);
////                System.out.println("Processo " + p.getID()+ ", C = " + p.getC() +  " T = " + p.getT() + " foi adicionado");
////                break;
////                
////            case 2:
////                OrganizaProcessos(processos);
////                escalonaRM(processos);
////                break;
////            case 3:
////                //Jobs pra debugar
////                Processo proc1 = new Processo(2, 7, 1);
////                processos.add(proc1);
////                Processo proc2 = new Processo(2, 5, 2);
////                processos.add(proc2);
////                Processo proc3 = new Processo(1, 9, 3);
////                processos.add(proc3);
////                System.out.println(processos.get(0).getC());
////        }
////    }
////    }
//        public static void OrganizaProcessos(ArrayList<Processo> processos)
//        {
//            Processo aux = new Processo(0,0,0);
//            for(int i = 0 ; i<processos.size();i++)
//            {
//                for(int j=i;j<processos.size();j++)
//                {
//                    if(processos.get(i).getT()>processos.get(j).getT())
//                    {
//                        aux = processos.get(j);
//                        processos.set(j, processos.get(i));
//                        processos.set(i, aux);
//                    }
//                }
//            }   
//        }
//        public static int MMC(int a, int b)
//        {
//            int max=a>b?a:b;
//            int min=a<b?a:b;
//            for(int i=1;i<=min;i++)
//               {
//                int mmc = max*i; 
//                if(mmc%min==0) 
//                 {
//                  return mmc;
//                 }
//                }
//            return 1;
//        }
//            
//        public static boolean escalonaRM(ArrayList<Processo> processos)
//        {
//            //colocar os processos em ordem de prioridade:
//            
//            //
//            int estado = 0;
//            int termino = 1;
//            for(int i =0 ; i<processos.size(); i++){
//            termino = termino * processos.get(i).getT();
//            }
//            
//            while(termino != estado){
//                
//                //Atualiza os deadlines
//                for(int k = 0 ; k<processos.size(); k++)
//                {
//                    processos.get(k).NovoDeadline(estado);// ele so vai executar se um novo deadline precisar ser criado, ver metodo em processos
//                }
//                
//                
//                //Seta os Deadlines Finalizados para Finalizados
//                for(int a =0 ; a<processos.size(); a++)
//                {
//                    for(int b=0; b<processos.get(a).deadlines.size();b++){
//                    processos.get(a).AtualizaDeadLines();
//                    }
//                }
//                                
//                //A cada estado:
//                for(int i =0 ; i<processos.size(); i++){
//                    int aux = processos.get(i).deadlines.size() - 1;
//                        if(processos.get(i).deadlines.get(aux).AdicionarJobaEsseDeadLine(estado)){
//                        break;
//                        }
//                    }
//                estado++;
//                }
//            return true;
//        }
//    }
//    
