import javax.swing.JOptionPane;
public class GUIintro {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog("Como se chama?");
        JOptionPane.showMessageDialog(null, "Olá, "+nome);

        int idade =Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos");

        double altura =Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
        JOptionPane.showMessageDialog(null, "Você tem "+altura+" cm de altura");
    }
}