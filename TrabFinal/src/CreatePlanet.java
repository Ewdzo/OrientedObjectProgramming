import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Label;


public class CreatePlanet extends JFrame {
    TextField nomeTextField, descricaoTextField, aparicaoTextField;
    Label tituloLabel, nomeLabel, descricaoLabel, aparicaoLabel;
    
    CreatePlanet(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        tituloLabel = new Label("Cadastrar Novo Planeta");
        tituloLabel.setBounds(60, 0, 250, 15);
        this.add(tituloLabel);

        nomeLabel = new Label();
		nomeLabel.setText("Nome do Planeta");
        nomeLabel.setBounds(10, 30, 250, 15);
        this.add(nomeLabel);

        nomeTextField = new TextField();
        nomeTextField.setBounds(10, 50, 250, 30);
        this.add(nomeTextField);

        descricaoLabel = new Label();
		descricaoLabel.setText("Descrição do Planeta");
        descricaoLabel.setBounds(10, 100, 250, 15);
        this.add(descricaoLabel);

        descricaoTextField = new TextField();
        descricaoTextField.setBounds(10, 120, 250, 100);
        this.add(descricaoTextField);

        aparicaoLabel = new Label();
		aparicaoLabel.setText("Primeira Aparição do Planeta");
        aparicaoLabel.setBounds(10, 235, 250, 15);
        this.add(aparicaoLabel);

        aparicaoTextField = new TextField();
        aparicaoTextField.setBounds(10, 255, 250, 30);
        this.add(aparicaoTextField);

        this.setPreferredSize( new Dimension(300, 350) );
        this.pack();
		this.setVisible(true);
    }
}
