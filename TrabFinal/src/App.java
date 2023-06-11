import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame{
    ArrayList<Planet> planets = new ArrayList<Planet>();
    ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();

    App(){
        App frame = this;
        JButton createSpaceshipButton, createPlanetButton, showPlanetsButton, showSpaceshipsButton;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        createPlanetButton = new JButton("Adicionar Planeta");
        createPlanetButton.setBounds(15, 15, 250, 50);
        createPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new CreatePlanet(planets);
            }
        }); 
        this.add(createPlanetButton);
        
        createSpaceshipButton = new JButton("Adicionar Nave");
        createSpaceshipButton.setBounds(15, 75, 250, 50);
        createSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new CreateSpaceship(spaceships);
            }
        }); 
        this.add(createSpaceshipButton);

        showPlanetsButton = new JButton("Mostrar Planetas");
        showPlanetsButton.setBounds(15, 135, 250, 50);
        showPlanetsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(planets.size() > 0){ new PlanetCard(planets, 0, 0); }
                else JOptionPane.showMessageDialog(frame, "Não existem Planetas Cadastrados");
            }
        }); 
        this.add(showPlanetsButton);

        showSpaceshipsButton = new JButton("Mostrar Naves");
        showSpaceshipsButton.setBounds(15, 195, 250, 50);
        showSpaceshipsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(spaceships.size() > 0){ new SpaceshipCard(spaceships, 0); }
                else JOptionPane.showMessageDialog(frame, "Não existem Naves Cadastradas");
            }
        }); 
        this.add(showSpaceshipsButton);

        this.setPreferredSize( new Dimension(300, 600) );
        this.pack();
		this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
