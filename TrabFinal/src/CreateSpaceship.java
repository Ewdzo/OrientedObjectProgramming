import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;


public class CreateSpaceship extends JFrame {
    TextField nomeTextField, modeloTextField, aparicaoTextField;
    Label tituloLabel, nomeLabel, modeloLabel, aparicaoLabel;
    JButton createSpaceshipButton;
    
    CreateSpaceship(ArrayList<Spaceship> list){
        CreateSpaceship frame = this;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        tituloLabel = new Label("Cadastrar Nova Nave");
        tituloLabel.setBounds(70, 10, 250, 15);
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
        modeloTextField.setBounds(10, 120, 250, 30);
        this.add(modeloTextField);

        aparicaoLabel = new Label("Primeira Aparição");
        aparicaoLabel.setBounds(10, 170, 250, 15);
        this.add(aparicaoLabel);

        aparicaoTextField = new TextField();
        aparicaoTextField.setBounds(10, 190, 250, 30);
        this.add(aparicaoTextField);

        createSpaceshipButton = new JButton("Criar Nave");
        createSpaceshipButton.setBounds(60, 250, 150, 30);
        createSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nome = nomeTextField.getText();
                String modelo = modeloTextField.getText();
                String aparicao = aparicaoTextField.getText();

                if(nome.isEmpty() || modelo.isEmpty() || aparicao.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Existem Campos Vazios");
                }
                else {
                    Spaceship novaNave = new Spaceship();
                    novaNave.setNome(nome);
                    novaNave.setModelo(modelo);
                    novaNave.setAparicao(aparicao);

                    list.add(novaNave);
                    JOptionPane.showMessageDialog(frame, String.format("Nave %s Criada e Adicionado a Lista", nome));
                }
            }
        }); 
        this.add(createSpaceshipButton);


        this.setPreferredSize( new Dimension(300, 350) );
        this.pack();
		this.setVisible(true);
    }
}
