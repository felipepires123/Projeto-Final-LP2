import java.util.Scanner;

public class Jovem implements MenuAluno {

    private int numRegistro;
    private String nome;
    private int idade;
    private String ramo;



    public Jovem(int numRegistro, String nome, int idade) {
        this.numRegistro = numRegistro;
        this.nome = nome;
        this.setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        this.setRamo("");
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;

        if (this.getIdade() < 6 ){
            this.ramo = "Invalido";
        } else if (this.getIdade() < 11) {
            this.ramo = "Lobinho";
        } else if (this.getIdade() < 15) {
            this.ramo = "Escoteiro";
        } else if (this.getIdade() < 18) {
            this.ramo = "Senior";
        } else if (this.getIdade() < 21) {
            this.ramo = "Pioneiro";
        } else {
            this.ramo = "Escotista";
        }
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void terminalJovem() {
        Scanner ler = new Scanner(System.in);
        int opc;


        System.out.println("Olá " + this.getNome() + " seja bem vindo ao seu mapa de progressão online");
        do {

            System.out.println("Escolha sua opção\n\n\t1 - Menu de Itens\n\n\t2 - Insignia Atual\n\n\t3 - Informações pessoais\n\n\t0 - Sair\n");
            opc = ler.nextInt();

            switch (opc){
                case 0:{
                    System.out.println("\nTchau e sempre alerta\n\n");

                    break;
                }
                case 1:{
                    //Mostrar lista de Itens
                    System.out.println("\nMenu de Itens\n\n");
                    break;
                }
                case 2:{
                    //Mostra insignia atual
                    System.out.println("\nInsignia atual\n\n");
                    break;
                }
                case 3:{
                    System.out.println("+----------------------------------------------------------");
                    System.out.println("|Informações Pessoais:");
                    System.out.println("|\tNome completo: " + this.getNome());
                    System.out.println("|\tIdade: " + getIdade());
                    System.out.println("|\tRamo: " + getRamo());
                    System.out.println("+----------------------------------------------------------");
                    break;
                }
                default:{
                    System.out.println("\nOpção inexistente\n\n");
                }
            }

        }while (opc != 0);
    }
}
