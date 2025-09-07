import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class CatchTheBallGame extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private int paddleX = 200;
    private final int paddleWidth = 100;
    private final int paddleHeight = 15;
    private final int panelWidth = 500;
    private final int panelHeight = 600;
    private final int ballDiameter = 20;
    private ArrayList<Ball> balls;
    private int score = 0;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private Random random;

    public CatchTheBallGame() {
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.BLACK);
        balls = new ArrayList<>();
        random = new Random();

        timer = new Timer(15, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        // Add initial ball
        balls.add(new Ball(random.nextInt(panelWidth - ballDiameter), 0, 3 + random.nextInt(3)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw paddle
        g.setColor(Color.GREEN);
        g.fillRect(paddleX, panelHeight - paddleHeight - 10, paddleWidth, paddleHeight);

        // Draw balls
        g.setColor(Color.RED);
        for (Ball ball : balls) {
            g.fillOval(ball.x, ball.y, ballDiameter, ballDiameter);
        }

        // Draw score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move paddle
        if (leftPressed && paddleX > 0) {
            paddleX -= 7;
        }
        if (rightPressed && paddleX < panelWidth - paddleWidth) {
            paddleX += 7;
        }

        // Move balls
        Iterator<Ball> iterator = balls.iterator();
        while (iterator.hasNext()) {
            Ball ball = iterator.next();
            ball.y += ball.speed;

            // Check if ball caught by paddle
            if (ball.y + ballDiameter >= panelHeight - paddleHeight - 10 &&
                    ball.x + ballDiameter >= paddleX &&
                    ball.x <= paddleX + paddleWidth) {
                score++;
                iterator.remove();
            } else if (ball.y > panelHeight) {
                // Ball missed, game over
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over! Your score: " + score);
                System.exit(0);
            }
        }

        // Occasionally add new balls
        if (random.nextInt(100) < 3) {
            balls.add(new Ball(random.nextInt(panelWidth - ballDiameter), 0, 3 + random.nextInt(3)));
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (key == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }
        if (key == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    private static class Ball {
        int x, y, speed;

        public Ball(int x, int y, int speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Catch The Ball Game");
        CatchTheBallGame gamePanel = new CatchTheBallGame();
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
