import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOPtionPaneIcone{

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Sistema da Vovó", JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
                ExemploJOPtionPaneIcone.class.getResource("/imagens/virus.png")
            )
        
        );

    }
}