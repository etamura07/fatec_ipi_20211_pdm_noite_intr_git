import javax.swing.JOptionPane;

public class EntregaGit{
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    // System.out.println("Entregando tarefas com o git na linha de comando.");
    JOptionPane.showMessageDialog(null, String.format("Bem vindo, %s", nome));
  }
}