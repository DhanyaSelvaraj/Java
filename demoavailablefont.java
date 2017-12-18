import java.awt.*;

public class demoavailablefont
{
	public static void main(String args[])
	{
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts=ge.getAllFonts();
		for(Font f:fonts)
		{
			System.out.println(f.getFontName());
		}
	}
}