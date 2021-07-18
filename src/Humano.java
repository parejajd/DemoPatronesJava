
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Humano {
    public JTextArea textField;
    public String clipboard; 

    private Patojen patojen;

    public void init() {
        
        JFrame frame = new JFrame("Soy el cuerpo humano");
        JPanel content = new JPanel();
      

        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);

        JScrollPane scroll = new JScrollPane(textField); 
        //this.add(textArea); // get rid of this 
        content.add(scroll); 

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton infectHuman = new JButton("Infectar Humano");
        JButton initializeAtack = new JButton("Inicializar Virus");
        JButton executeAtack = new JButton("Ejecutar ataque");
        JButton replicateVirus = new JButton("Replicar Virus");

        Humano editor = this;

        infectHuman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editor.printMessage("Infectando");
                patojen = new VirusActivator(editor);
            }
        });
        initializeAtack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (patojen != null) {
                    patojen.initializeVirus(6);
                }
            }
        });
        executeAtack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (patojen != null) {
                    patojen.executeVirus();
                }
            }
        });
        replicateVirus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (patojen != null) {
                    patojen.cloneVirus();
                }
            }
        });

        buttons.add(infectHuman);
        buttons.add(initializeAtack);
        buttons.add(executeAtack);
        buttons.add(replicateVirus);
        content.add(buttons);
        
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void printMessage(String message)
    {
        textField.append(message);
        textField.append("\n");
    } 
}