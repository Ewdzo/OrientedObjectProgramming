import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;
import java.awt.TextArea;


public class PlanetCard extends JFrame {
    Label nomeLabel, descricaoLabel, aparicaoLabel, populacaoLabel;
    TextArea descricaoTextArea;
    JButton nextPlanetButton, previousPlanetButton;
    ArrayList<String> nativos = new ArrayList<String>();

    PlanetCard(ArrayList<Planet> list, int index, int nativoIndex){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        PlanetCard frame = this;

        String nome = list.get(index).getNome();
        String descricao = list.get(index).getDescricao();
        String aparicao = list.get(index).getAparicao();
        int populacao = list.get(index).getPopulacao();

        nomeLabel = new Label(String.format("Nome do Planeta: %s", nome));
        nomeLabel.setBounds(10, 10, 250, 15);
        this.add(nomeLabel);

        descricaoLabel = new Label("Descrição do Planeta:");
        descricaoLabel.setBounds(10, 30, 250, 15);
        this.add(descricaoLabel);

        descricaoTextArea = new TextArea(String.format("%s", descricao));
        descricaoTextArea.setBounds(10, 50, 250, 190);
        descricaoTextArea.setEditable(false);
        this.add(descricaoTextArea);

        aparicaoLabel = new Label(String.format("Primeira Aparicao do Planeta: %s", aparicao));
        aparicaoLabel.setBounds(10, 250, 250, 15);
        this.add(aparicaoLabel);
        
        populacaoLabel = new Label(String.format("Populacao do Planeta: %s", populacao));
        populacaoLabel.setBounds(10, 270, 250, 15);
        this.add(populacaoLabel);
        
        if(list.get(index).getNativos().size() > 0){
            String nativo = list.get(index).getNativos().get(nativoIndex);

            Label nativosLabel = new Label(String.format("Nativos: %s", nativo));
            nativosLabel.setBounds(10, 300, 250, 15);
            this.add(nativosLabel);
            
            JButton previousNativeButton = new JButton("<");
            previousNativeButton.setBounds(30, 325, 50, 30);
            previousNativeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    frame.dispose();
                    if(nativoIndex > 0) new PlanetCard(list, index, (nativoIndex - 1));
                    else new PlanetCard(list, index, nativoIndex);
                }
            }); 
            this.add(previousNativeButton);

            JButton nextNativeButton = new JButton(">");
            nextNativeButton.setBounds(100, 325, 50, 30);
            nextNativeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    frame.dispose();
                    if(nativoIndex < (list.get(index).getNativos().size() - 1)) new PlanetCard(list, index, (nativoIndex + 1));
                    else new PlanetCard(list, index, nativoIndex);
                }
            }); 
            this.add(nextNativeButton);
        }

        previousPlanetButton = new JButton("<<");
        previousPlanetButton.setBounds(30, 370, 100, 30);
        previousPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                if(index > 0) new PlanetCard(list, (index-1), 0);
                else new PlanetCard(list, index, 0);
            }
        }); 
        this.add(previousPlanetButton);

        nextPlanetButton = new JButton(">>");
        nextPlanetButton.setBounds(145, 370, 100, 30);
        nextPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                if(index < (list.size() - 1)) new PlanetCard(list, (index+1), 0);
                else new PlanetCard(list, index, 0);
            }
        }); 
        this.add(nextPlanetButton);

        this.setPreferredSize( new Dimension(300, 450) );
        this.pack();
		this.setVisible(true);
    }
}
