import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;


public class CreatePlanet extends JFrame {
    TextField nomeTextField, descricaoTextField, aparicaoTextField;
    Label tituloLabel, nomeLabel, descricaoLabel, aparicaoLabel;
    JButton createPlanetButton;
    
    CreatePlanet(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        tituloLabel = new Label("Cadastrar Novo Planeta");
        tituloLabel.setBounds(70, 0, 250, 15);
        this.add(tituloLabel);

        nomeLabel = new Label("Nome do Planeta");
        nomeLabel.setBounds(10, 30, 250, 15);
        this.add(nomeLabel);

        nomeTextField = new TextField();
        nomeTextField.setBounds(10, 50, 250, 30);
        this.add(nomeTextField);

        descricaoLabel = new Label("Descrição do Planeta");
        descricaoLabel.setBounds(10, 100, 250, 15);
        this.add(descricaoLabel);

        descricaoTextField = new TextField();
        descricaoTextField.setBounds(10, 120, 250, 100);
        this.add(descricaoTextField);

        aparicaoLabel = new Label("Primeira Aparição do Planeta");
        aparicaoLabel.setBounds(10, 235, 250, 15);
        this.add(aparicaoLabel);

        aparicaoTextField = new TextField();
        aparicaoTextField.setBounds(10, 255, 250, 30);
        this.add(aparicaoTextField);

        createPlanetButton = new JButton("Criar Planeta");
        createPlanetButton.setBounds(60, 300, 150, 30);
        createPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Hi");
            }
        }); 
        this.add(createPlanetButton);


        this.setPreferredSize( new Dimension(300, 400) );
        this.pack();
		this.setVisible(true);
    }
}
