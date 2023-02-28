import com.sun.source.tree.WhileLoopTree;

import java.security.PublicKey;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void systemCls(){
        for(int i = 0; i < 30;i++){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        boolean run = true;
        while (run) {
            System.out.println("Qual filme voce quer assistir\n1-VINGADORES -13" +
                    "\n2-WAKANDA FOREVER - 15\n3-DETONA RALPH -10\n4-SAIR");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    systemCls();
                    System.out.println("FILME ESCOLHIDO = VINGADORES");
                    System.out.println("Para proseguir digite sua idade");
                    int idade = scanner.nextInt();
                    usuario.setIdade(idade);
                    if (usuario.getIdade() < 13) {
                        int resul = 13 - usuario.getIdade();
                        System.out.println("Compra não permitida!\nVoce tem apenas " + usuario.getIdade() + " anos" +
                                " Aguarde " + resul + " anos para assistir");

                    } else {
                        System.out.println("Compra permitida");
                        System.out.println("Desejar efetua outra compra?\n1-SIM\n2-NÃO");
                        int op1 = scanner.nextInt();
                        if(op1 == 1){
                            continue;
                        } else if (op1 == 2) {
                            run = false;
                            System.out.println("PROGRAMA ENCERRADO");
                        }
                    }
                    break;
                case 2:
                    systemCls();
                    System.out.println("FILME ESCOLHIDO = WAKANDA FOREVER");
                    System.out.println("Para proseguir digite sua idade:");
                    int idade1 = scanner.nextInt();
                    usuario.setIdade(idade1);
                    if(idade1 < 15){
                        int resul = 15 - usuario.getIdade();
                        System.out.println("Compra não permitida!\nVoce tem apenas "+usuario.getIdade()+
                                " anos aguarde "+resul+" anos para assistir");

                    }else {
                        System.out.println("Compra permitida");
                        System.out.println("Deseja efetua outra compra?\n1-SIM\n2-NÃO");
                        int op1 = scanner.nextInt();
                        if(op1 == 1 ){
                            continue;
                        }else if(op1 == 2){
                            run = false;
                            System.out.println("PROGRAMA ENCERRADO");
                        }
                    }
                    break;
                case 3:
                    systemCls();
                    System.out.println("FILME ESCOLHIDO = DETONA RALPH");
                    System.out.println("Para prosseguir digite sua idade:");
                    int idade2 = scanner.nextInt();
                    usuario.setIdade(idade2);
                    if(idade2 < 10){
                        int resul = 10 - usuario.getIdade();
                        System.out.println("Compra não permitida!\nVoce tem apenas "+usuario.getIdade()+
                                " anos aguarde "+resul+ "anos para assistir");
                    } else {
                        System.out.println("COMPRA PERMITIRA!\nDeseja efetua outra compra?\n1-SIM\n2-NÃO");
                        int op1 = scanner.nextInt();
                        if(op1 == 1 ){
                            continue;
                        }else if(op1 == 2){
                            run = false;
                            System.out.println("PROGRAMA ENCERRADO");
                        }
                    }
                    break;
                case 4:
                    run =false;
                    systemCls();
                    System.out.println("PROGRAMA ENCERRADO");
                    break;
                default:
                    systemCls();
                    System.out.println("Voce digitou " + op +" e " + op +" nao é uma opcao correta");
                    break;
            }

        }
    }
}