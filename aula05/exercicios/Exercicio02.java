package exercicios;

import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int QTDE_ALUNOS = 20; // final = constante, não muda de valor
        final int QTDE_TURMAS = 5;

        // QTDE_ALUNOS = 20; // não pode ser feito , pois a constante não pode mudar de valor

        mediaGeral = 0;
        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {

            System.out.println("Turma: " + turma);

            mediaTurma = 0;
            for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
                System.out.printf("Digite a média do %d° aluno: ", aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno; // mediaTurma += mediaAluno;
            }

            mediaTurma = mediaTurma / QTDE_ALUNOS; // mediaTurma /= 3;
            mediaGeral = mediaGeral + mediaTurma;
            System.out.println("Média da turma: " + mediaTurma);
        }

        mediaGeral = mediaGeral / QTDE_TURMAS;
        System.out.println("Média Geral: " + mediaGeral);
        
        entrada.close();;
    }
}
