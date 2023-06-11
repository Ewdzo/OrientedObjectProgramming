import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App extends JFrame{
    ArrayList<Planet> planets = new ArrayList<Planet>();
    ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();

    App(){
        JButton createSpaceshipButton, createPlanetButton;
        App frame = this;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        createSpaceshipButton = new JButton("Adicionar Nave");
        createSpaceshipButton.setBounds(15, 15, 250, 50);
        createSpaceshipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new CreateSpaceship(spaceships);
            }
        }); 
        this.add(createSpaceshipButton);

        createPlanetButton = new JButton("Adicionar Planeta");
        createPlanetButton.setBounds(15, 75, 250, 50);
        createPlanetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new CreatePlanet(planets);
            }
        }); 
        this.add(createPlanetButton);

        this.setPreferredSize( new Dimension(300, 600) );
        this.pack();
		this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
