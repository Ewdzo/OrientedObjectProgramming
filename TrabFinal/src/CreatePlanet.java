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
    TextField nomeTextField, descricaoTextField, aparicaoTextField, nativoTextField, populacaoTextField;
    Label tituloLabel, nomeLabel, descricaoLabel, aparicaoLabel, nativoLabel, populacaoLabel;
    JButton createPlanetButton, addNativoButton, removeNativoButton, removeNativosButton;
    ArrayList<String> nativos = new ArrayList<String>();
    
    CreatePlanet(ArrayList<Planet> list){
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
        addNativoButton.setBounds(25, 355, 100, 30);
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
        removeNativoButton.setBounds(135, 355, 100, 30);
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
        removeNativosButton.setBounds(30, 390, 200, 30);
        removeNativosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                nativos.clear();
                JOptionPane.showMessageDialog(frame, "Todos os Nativos Foram Excluídos.");
            }
        }); 
        this.add(removeNativosButton);

        populacaoLabel = new Label("Populacao do Planeta");
        populacaoLabel.setBounds(10, 430, 250, 15);
        this.add(populacaoLabel);

        populacaoTextField = new TextField();
        populacaoTextField.setBounds(10, 450, 250, 30);
        this.add(populacaoTextField);

        createPlanetButton = new JButton("Criar Planeta");
        createPlanetButton.setBounds(60, 500, 150, 30);
        createPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nome = nomeTextField.getText();
                String descricao = descricaoTextField.getText();
                String aparicao = aparicaoTextField.getText();
                String populacao = populacaoTextField.getText();

                if(nome.isEmpty() || descricao.isEmpty() || aparicao.isEmpty() || populacao.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Existem Campos Vazios");
                }
                else {
                    Planet novoPlaneta = new Planet();
                    novoPlaneta.setNome(nome);
                    novoPlaneta.setDescricao(descricao);
                    novoPlaneta.setAparicao(aparicao);
                    novoPlaneta.setNativos(nativos);
                    novoPlaneta.setPopulacao( Integer.parseInt( populacao ) );

                    list.add(novoPlaneta);
                    JOptionPane.showMessageDialog(frame, String.format("Planeta %s Criado e Adicionado a Lista", nome));
                }
            }
        }); 
        this.add(createPlanetButton);


        this.setPreferredSize( new Dimension(300, 600) );
        this.pack();
		this.setVisible(true);
    }
}
