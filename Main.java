public class ButtonAdder {

    private JFrame frame;
    private JButton button;
    private AddButtonListener listener;

    public ButtonAdder(){
        frame = new JFrame("ButtonAdder");
        button = new JButton("Add new button");
        frame.setLayout(new BorderLayout()); 
        listener = new AddButtonListener();

        frame.add(button, BorderLayout.NORTH);
        button.addActionListener(listener);

        frame.setSize(300, 200);
        frame.setLocation(500, 500);
        frame.setResizable(false); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public void execute() {
        frame.setVisible(true);
    }
}


public class AddButtonListener implements ActionListener  {
private JFrame frame;
    private JButton button;
    private AddButtonListener listener;
     int current_button_number = 1;  

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) {
                // Create a new button:
                JButton newButton = new JButton("Button " + current_button_number++);

                // Change the appearance of the button:
                newButton.setForeground(Color.GREEN);
                newButton.setBackground(Color.BLACK);

                newButton.addActionListener(this);
                frame.add(newButton);      
            } else {
                // The source of the event is the button that was pressed 
                // and that we should remove:
                JButton button_pressed = (JButton) e.getSource();

                // We remove the button from the content pane:
                frame.remove(button_pressed);                               

                // Ask the content pane to eventually redraw itself:
                frame.repaint();                                
            }
            // validate() causes the content pane to re-layout the buttons:
            frame.validate();      
        }

}

public class Main {

public static void main(String[] args) {
    ButtonAdder button = new ButtonAdder();
    button.execute();

}

}