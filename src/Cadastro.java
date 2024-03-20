import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public  class Cadastro {
    public static void main(String[] args)  {

     ArrayList<String> ListHomem = new ArrayList<>();
     ArrayList<String> ListMulher = new ArrayList<>();

     Scanner scan = new Scanner(System.in);
     while(true) {
            System.out.println("Digite seu nome e 'M/F' para genero ou 'sair' para finalizar: ");

            String entrada = scan.nextLine();
                if (entrada.equalsIgnoreCase("Sair")) {
                    break;
                } else {
                    String[] partes = entrada.split(" ");
                    if (partes.length == 2 ) {
                        String nome = partes [0];
                        String genero = partes [1];
                        if (genero.equalsIgnoreCase("M")) {
                            ListHomem.add(nome);
                        } else if (genero.equalsIgnoreCase("F")) {
                            ListMulher.add(nome);
                        } else {
                            System.out.println("Genero Invalido");
                        }
                    } else { 
                    System.out.println("Digite novamente");
                    System.out.println("Lista masculina: " + ListHomem);
                    Collections.sort(ListHomem);
                    System.out.println("Genero Femenino: " + ListMulher);
                    Collections.sort(ListMulher);
                    scan.close();
                }
             }
        }
    }
}

