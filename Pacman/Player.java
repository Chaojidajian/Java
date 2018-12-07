
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;

  public class Player {
      private int lives;
      private int xAxis;
      private int yAxis;
      private String imagePath;
      private boolean isAlive;
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}


	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}


	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
    if(imagePath==null)
      JOptionPane.showMessageDialog(null, "Invaid string!");
      else if(imagePath.length()==0)
      JOptionPane.showMessageDialog(null, "String Empty");
      else
    	this.imagePath = imagePath;
	}

	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
  public void drawPlayer(Graphics g)
  {
    ImageIcon img = new ImageIcon(imagePath);
    g.drawImage(img.getImage(), xAxis, yAxis, null);
  }

	public Player(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive) {
		super();
		this.setLives(lives);
		this.setAlive(isAlive);
		this.setyAxis(yAxis);
		this.setImagePath(imagePath);
		this.setxAxis(xAxis);
	}

}
