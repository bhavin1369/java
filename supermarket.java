import javax.swing.*;

class Electronics {
    void sh() {
        System.out.println("Welcome to Electronics Section");
    }
}

class Stationary extends Electronics {
    void sh() {
        System.out.println("Welcome to Stationary Section");
    }
}

class Clothes extends Electronics {
    void sh() {
        System.out.println("Welcome to Clothes Section");
    }
}

class Food extends Electronics {
    void sh() {
        System.out.println("Welcome to Food Court");
    }
}

public class supermarket {
    public static void main(String[] args) {
        Electronics e = new Electronics();
        e.sh();

        Stationary s = new Stationary();
        s.sh();

        Clothes c = new Clothes();
        c.sh();

        Food f = new Food();
        f.sh();

        // GUI
        JFrame frame = new JFrame("Supermarket Sections");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Select a Section:");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);

        JButton electronicsBtn = new JButton("Electronics");
        electronicsBtn.setBounds(10, 50, 120, 25);
        panel.add(electronicsBtn);

        JButton stationaryBtn = new JButton("Stationary");
        stationaryBtn.setBounds(140, 50, 120, 25);
        panel.add(stationaryBtn);

        JButton clothesBtn = new JButton("Clothes");
        clothesBtn.setBounds(10, 80, 120, 25);
        panel.add(clothesBtn);

        JButton foodBtn = new JButton("Food Court");
        foodBtn.setBounds(140, 80, 120, 25);
        panel.add(foodBtn);

        electronicsBtn.addActionListener(e1 -> e.sh());
        stationaryBtn.addActionListener(e1 -> s.sh());
        clothesBtn.addActionListener(e1 -> c.sh());
        foodBtn.addActionListener(e1 -> f.sh());

        frame.setVisible(true);
    }
}
class electronics{
    void sh(){
        System.out.println("welcome to electronic section:");
    }
}
class stationary extends electronics {
   void sh(){
    System.out.println("welcome to stationary section:");
   }

}
class clothes extends electronics{
    void sh(){
        System.out.println("welcome to clothes section:");
        
    }
}
class food extends electronics{
    void sh(){
        System.out.println("welcome to food court:");
    }
}
public class supermarket  {
    public static void main(String[] args) {
        electronics e=new electronics();
        e.sh();
        stationary s=new stationary();
        s.sh();
        clothes c=new clothes();
        c.sh();
        food f=new food();
        f.sh();
    }   
}