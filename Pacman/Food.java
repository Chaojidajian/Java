import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
public class Food{
  private int xAxis;
  private int yAxis;
  private String imagePath;

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
  public void drawFood(Graphics g)
  {
    ImageIcon img = new ImageIcon(imagePath);
    g.drawImage(img.getImage(), xAxis, yAxis, null);
  }
	public Food(int xAxis, int yAxis, String imagePath) {
		super();
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
    this.setImagePath(imagePath);
	}
}
