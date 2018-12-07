import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.Font;
import java.awt.Color;


public class Level1 extends JPanel implements KeyListener{
  private JFrame window = new JFrame("PACMAN");
  private ImageIcon background = new ImageIcon("images//background.jpg");
  private Player player = new Player(3,20,20,"images//pacman.png",true);
  Random ran1 = new Random(1);
  private Food food = new Food(ran1.nextInt(900),ran1.nextInt(500),"images//food.png");
  private int speed = 20;
  public int score=0;
  public Level1()
  {
    this.setFocusable(true);
    this.addKeyListener(this);
    window.add(this);
    window.setSize(1000, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
  public void refreshFood(){
    food.setxAxis(ran1.nextInt(900));
    food.setyAxis(ran1.nextInt(500));
  }
  private void drawScore(Graphics2D g2d){
    String s;
    g2d.setFont(new Font("Serif", Font.BOLD, 32));
    g2d.setColor(new Color(255,255,255));
    s="Score:"+score;
    g2d.drawString(s,10,20);
  }
  public void paint(Graphics g)
  {
     Graphics2D g2d = (Graphics2D) g;
    g.drawImage(background.getImage(), 0, 0, null);
    player.drawPlayer(g);
    food.drawFood(g);
    drawScore(g2d);
  }
  @Override
  public void keyPressed(KeyEvent ke){
    if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
    {
        player.setImagePath("images//pacman.png");
        player.setxAxis(player.getxAxis()+speed);

        this.repaint();
    }
    else if (ke.getKeyCode() == KeyEvent.VK_LEFT)
    {
      player.setImagePath("images//pacmanleft.png");
      player.setxAxis(player.getxAxis()-speed);
      this.repaint();
    }
    else if (ke.getKeyCode() == KeyEvent.VK_UP)
    {
      player.setImagePath("images//pacmanup.png");
      player.setyAxis(player.getyAxis()-speed);
      this.repaint();
    }
    else if (ke.getKeyCode() == KeyEvent.VK_DOWN)
    {
      player.setImagePath("images//pacmandown.png");
      player.setyAxis(player.getyAxis()+speed);
      this.repaint();
    }
    if(Math.abs(player.getxAxis()-food.getxAxis())<=50&&Math.abs(player.getyAxis()-food.getyAxis())<=50){
      score++;
    refreshFood();
    this.repaint();
    }
  }
  @Override
  public void keyReleased(KeyEvent e){

    }
  @Override
  public void keyTyped(KeyEvent e){

  }


}
