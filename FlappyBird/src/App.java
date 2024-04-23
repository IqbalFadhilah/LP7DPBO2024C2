import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Membuat JFrame untuk GUI Form
        JFrame startFrame = new JFrame("Start Game");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(300, 200);
        startFrame.setLocationRelativeTo(null);

        // Membuat instance dari FBird
        FBird startForm = new FBird();

        // Menambahkan panel1 dari FBird ke startFrame
        startFrame.add(startForm.getPanel1());

        // Menampilkan startFrame
        startFrame.setVisible(true);

        // Mendapatkan button1 dari FBird dan menambahkan ActionListener
        startForm.getButton1().addActionListener(e -> {
            // Menutup startFrame
            startFrame.dispose();

            // Membuat dan menampilkan JFrame untuk FlappyBird
            JFrame frame = new JFrame("Flappy Bird");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(360, 640);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);

            FlappyBird flappyBird = new FlappyBird();
            frame.add(flappyBird);
            frame.pack();
            flappyBird.requestFocus();
            frame.setVisible(true);
        });
    }
}
