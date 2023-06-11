import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;


public class CreateSpaceship extends JFrame {
    TextField nomeTextField, modeloTextField, aparicaoTextField;
    Label tituloLabel, nomeLabel, modeloLabel, aparicaoLabel;
    JButton createSpaceshipButton;
    
    CreateSpaceship(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        tituloLabel = new Label("Cadastrar Nova Nave");
        tituloLabel.setBounds(70, 0, 250, 15);
        this.add(tituloLabel);

        nomeLabel = new Label("Nome da Nave");
        nomeLabel.setBounds(10, 30, 250, 15);
        this.add(nomeLabel);

        nomeTextField = new TextField();
        nomeTextField.setBounds(10, 50, 250, 30);
        this.add(nomeTextField);

        modeloLabel = new Label("Modelo da Nave");
        modeloLabel.setBounds(10, 100, 250, 15);
        this.add(modeloLabel);

        modeloTextField = new TextField();
        modeloTextField.setBounds(10, 120, 250, 100);
        this.add(modeloTextField);

        aparicaoLabel = new Label("Primeira Aparição da Nave");
        aparicaoLabel.setBounds(10, 235, 250, 15);
        this.add(aparicaoLabel);

        aparicaoTextField = new TextField();
        aparicaoTextField.setBounds(10, 255, 250, 30);
        this.add(aparicaoTextField);

        createSpaceshipButton = new JButton("Criar Nave");
        createSpaceshipButton.setBounds(60, 300, 150, 30);
        createSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Hi");
            }
        }); 
        this.add(createSpaceshipButton);


        this.setPreferredSize( new Dimension(300, 400) );
        this.pack();
		this.setVisible(true);
    }
}
