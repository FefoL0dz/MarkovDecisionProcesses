package mdp.iterationApproach.value;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader("C:\\Users\\horte\\IdeaProjects\\MarkovDecisionProcesses\\src\\mdp\\iterationApproach\\value\\navigation_1.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            String REGEX = "(\\B\\d*)";
            Pattern posestado = Pattern.compile(REGEX);
            float Estados[][] = new float [20][2];
            int max = -1;
            int r = -1;
            int c = -1;
            Matcher s;

            if(linha.equals("states")) {
                while (!linha.equals("endstates")) {
                    s = posestado.matcher(linha);
                    while (s.find()){
                        if(!s.group(1).isEmpty()) {
                            if (max < Integer.parseInt(s.group(1))) max = Integer.parseInt(s.group(1));
                            System.out.println("Max so far " + max);
                        }
                    }
                    linha = lerArq.readLine();
                }
            }

            /* Matriz de estados criada */
            List<String> posicoes = new LinkedList<String>();
            Estados = new float[max][max];

            arq = new FileReader("C:\\Users\\horte\\IdeaProjects\\MarkovDecisionProcesses\\src\\mdp\\iterationApproach\\value\\navigation_1.txt");
            lerArq = new BufferedReader(arq);

            linha = lerArq.readLine(); // lê a primeira linha

            linha = lerArq.readLine();
            System.out.printf("%s\n", linha);
            while (linha != null) {
                //System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }
}
