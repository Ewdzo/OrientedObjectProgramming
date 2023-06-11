import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;


public class SpaceshipCard extends JFrame {
    Label nomeLabel, modeloLabel, aparicaoLabel, populacaoLabel;
    JButton nextSpaceshipButton, previousSpaceshipButton;
    ArrayList<String> nativos = new ArrayList<String>();

    SpaceshipCard(ArrayList<Spaceship> list, int index){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        SpaceshipCard frame = this;

        String nome = list.get(index).getNome();
        String modelo = list.get(index).getModelo();
        String aparicao = list.get(index).getAparicao();

        nomeLabel = new Label(String.format("Nome da Nave: %s", nome));
        nomeLabel.setBounds(10, 10, 250, 15);
        this.add(nomeLabel);

        modeloLabel = new Label(String.format("Modelo da Nave: %s", modelo));
        modeloLabel.setBounds(10, 30, 250, 15);
        this.add(modeloLabel);

        aparicaoLabel = new Label(String.format("Primeira Aparicao: %s", aparicao));
        aparicaoLabel.setBounds(10, 50, 250, 15);
        this.add(aparicaoLabel);
        
        previousSpaceshipButton = new JButton("<<");
        previousSpaceshipButton.setBounds(30, 110, 100, 30);
        previousSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                if(index > 0) new SpaceshipCard(list, (index-1));
                else new SpaceshipCard(list, index);
            }
        }); 
        this.add(previousSpaceshipButton);

        nextSpaceshipButton = new JButton(">>");
        nextSpaceshipButton.setBounds(145, 110, 100, 30);
        nextSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                if(index < (list.size() - 1)) new SpaceshipCard(list, (index+1));
                else new SpaceshipCard(list, index);
            }
        }); 
        this.add(nextSpaceshipButton);

        this.setPreferredSize( new Dimension(300, 200) );
        this.pack();
		this.setVisible(true);
    }
}
