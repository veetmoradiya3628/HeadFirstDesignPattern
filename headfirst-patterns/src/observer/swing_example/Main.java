package observer.swing_example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}

class ObserverLabel extends JLabel implements Observer {
    private int count = 0;
    private final String name;

    public ObserverLabel(String name) {
        this.name = name;
        setText(name + ": " + count);
        setFont(new Font("Arial", Font.BOLD, 16));
    }

    @Override
    public void update() {
        count++;
        setText(name + ": " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::go);
    }

    public static void go() {
        JFrame frame = new JFrame("Observer Pattern Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JButton notifyButton = new JButton("Notify Observers");
        Subject subject = new Subject();

        ObserverLabel observer1 = new ObserverLabel("Observer A");
        ObserverLabel observer2 = new ObserverLabel("Observer B");
        ObserverLabel observer3 = new ObserverLabel("Observer C");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        notifyButton.addActionListener(e -> subject.notifyObservers());

        JPanel observersPanel = new JPanel(new GridLayout(3, 1));
        observersPanel.add(observer1);
        observersPanel.add(observer2);
        observersPanel.add(observer3);

        frame.add(notifyButton, BorderLayout.NORTH);
        frame.add(observersPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
