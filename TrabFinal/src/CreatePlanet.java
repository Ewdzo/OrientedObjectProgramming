import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;


public class CreatePlanet extends JFrame {
    TextField nomeTextField, descricaoTextField, aparicaoTextField, nativoTextField;
    Label tituloLabel, nomeLabel, descricaoLabel, aparicaoLabel, nativoLabel;
    JButton createPlanetButton, addNativoButton, removeNativoButton, removeNativosButton;
    ArrayList<String> nativos = new ArrayList<String>();
    
    CreatePlanet(){
        CreatePlanet frame = this;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        tituloLabel = new Label("Cadastrar Novo Planeta");
        tituloLabel.setBounds(70, 5, 250, 15);
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

        nativoLabel = new Label("Adicionar Personagem Nativo");
        nativoLabel .setBounds(10, 300, 250, 15);
        this.add(nativoLabel);

        nativoTextField = new TextField();
        nativoTextField.setBounds(10, 320, 250, 30);
        this.add(nativoTextField);

        addNativoButton = new JButton("Adicionar");
        addNativoButton.setBounds(30, 350, 100, 30);
        addNativoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nativo = nativoTextField.getText();

                if(nativo != null && !nativo.trim().isEmpty()){
                    nativos.add(nativo);
                    JOptionPane.showMessageDialog(frame, String.format("Adicionado %s aos Nativos do Planeta", nativo));
                }
                else JOptionPane.showMessageDialog(frame, "O campo Personagem Nativo não pode estar vazio.");
            }
        }); 
        this.add(addNativoButton);

        removeNativoButton = new JButton("Remover");
        removeNativoButton.setBounds(130, 350, 100, 30);
        removeNativoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nativo = nativoTextField.getText();

                if(nativo != null && !nativo.trim().isEmpty()){
                    if(nativos.remove(nativo)){ JOptionPane.showMessageDialog(frame, String.format("Removido %s aos Nativos do Planeta", nativo)); }
                    else { JOptionPane.showMessageDialog(frame, "O Personagem não foi encontrado."); }
                }
                else JOptionPane.showMessageDialog(frame, "O campo Personagem Nativo não pode estar vazio.");
            }
        }); 
        this.add(removeNativoButton);

        removeNativosButton = new JButton("Remover Todos os Nativos");
        removeNativosButton.setBounds(30, 380, 200, 30);
        removeNativosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                nativos.clear();
                JOptionPane.showMessageDialog(frame, "Todos os Nativos Foram Excluídos.");
            }
        }); 
        this.add(removeNativosButton);


        createPlanetButton = new JButton("Criar Planeta");
        createPlanetButton.setBounds(60, 425, 150, 30);
        createPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Hi");
            }
        }); 
        this.add(createPlanetButton);


        this.setPreferredSize( new Dimension(300, 500) );
        this.pack();
		this.setVisible(true);
    }
}
