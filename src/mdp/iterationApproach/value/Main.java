package mdp.iterationApproach.value;
import java.awt.font.FontRenderContext;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            FileReader arq = new FileReader("C:\\Users\\horte\\IdeaProjects\\MarkovDecisionProcesses\\src\\mdp\\iterationApproach\\value\\navigation_1.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            String REGEX = "(\\B\\d*)";
            Pattern posestado = Pattern.compile(REGEX);
            int max = -1;
            Matcher s;
            List<String> pos = new LinkedList<String>();
            if(linha.equals("states")) {
                linha = lerArq.readLine();
                    s = posestado.matcher(linha);
                    while (s.find()) {
                        if (!s.group(1).isEmpty()) {
                            if (max < Integer.parseInt(s.group(1))) max = Integer.parseInt(s.group(1));
                            System.out.println(s.group(1));
                            pos.add(s.group(1));
                        }
                    }
            }

            float[][] estados = new float[max][max];
            for (int r = 0; r < estados.length; r++){
                for (int c = 0; c <estados.length; c++){

                }
            }

            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            System.out.println();

            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }
}
