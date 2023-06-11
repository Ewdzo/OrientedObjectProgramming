import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame{
    ArrayList<Planet> planets = new ArrayList<Planet>();
    ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();

    App(){
        App frame = this;
        JButton createSpaceshipButton, createPlanetButton, showPlanetsButton, showSpaceshipsButton, savePlanetsButton, saveSpaceshipsButton, loadPlanetsButton, loadSpaceshipsButton;
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

        savePlanetsButton = new JButton("Salvar Planetas");
        savePlanetsButton.setBounds(15, 255, 250, 50);
        savePlanetsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(planets.size() > 0){ 
                    try{
                        FileOutputStream fs = new FileOutputStream("Planets.ser");
                        ObjectOutputStream os = new ObjectOutputStream(fs);
                        planets.forEach((planet) -> {
                            try { os.writeObject(planet); }
                            catch (IOException e1) { e1.printStackTrace(); } 
                        });
                        os.close();
                        JOptionPane.showMessageDialog(frame, "Planetas Salvos com Sucesso");
                    } 
                    catch (IOException e2) { e2.printStackTrace(); }
                }
                else JOptionPane.showMessageDialog(frame, "Não existem Planetas Cadastrados");
            }
        }); 
        this.add(savePlanetsButton);

        saveSpaceshipsButton = new JButton("Salvar Naves");
        saveSpaceshipsButton.setBounds(15, 315, 250, 50);
        saveSpaceshipsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(spaceships.size() > 0){ 
                    try{
                        FileOutputStream fs = new FileOutputStream("Spaceships.ser");
                        ObjectOutputStream os = new ObjectOutputStream(fs);
                        spaceships.forEach((planet) -> {
                            try { os.writeObject(planet); }
                            catch (IOException e1) { e1.printStackTrace(); } 
                        });
                        os.close();
                        JOptionPane.showMessageDialog(frame, "Naves Salvas com Sucesso");
                    } 
                    catch (IOException e2) { e2.printStackTrace(); }
                }
                else JOptionPane.showMessageDialog(frame, "Não existem Naves Cadastrados");
            }
        }); 
        this.add(saveSpaceshipsButton);

        loadPlanetsButton = new JButton("Carregar Planetas");
        loadPlanetsButton.setBounds(15, 375, 250, 50);
        loadPlanetsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    FileInputStream fs = new FileInputStream("Planets.ser");
                    ObjectInputStream os = new ObjectInputStream(fs);
                    
                    while(true){
                        try {
                            Object restoredObject = os.readObject();
                            Planet restoredPlanet = (Planet) restoredObject;
                            planets.add(restoredPlanet);
                        } 
                        catch (EOFException e1){ os.close(); }
                        catch (Exception e2){ e2.printStackTrace(); }
                    }
                
                }
                catch (IOException e3) { e3.printStackTrace(); }
            }
        }); 
        this.add(loadPlanetsButton);

        this.setPreferredSize( new Dimension(300, 600) );
        this.pack();
		this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
