import java.awt.Image;

import javax.swing.ImageIcon;

import com.tank.constants.SheDing;
import com.tank.ui.Jiemian;

public class Test {

	
	public static void main(String[] args) {
		
		Image imgleft = null;
		Image imgright = null;
		Image imgup = null;
		Image imgdown = null;
		
		imgleft = new ImageIcon(SheDing.RES_IMG_TANK_LEFT).getImage();
		imgright = new ImageIcon(SheDing.RES_IMG_TANK_RIGHT).getImage();
		imgup = new ImageIcon(SheDing.RES_IMG_TANK_UP).getImage();
		imgdown = new ImageIcon(SheDing.RES_IMG_TANK_DOWN).getImage();
		System.out.println(imgleft.getWidth(null));
		
		Jiemian jeJiemian = new Jiemian("tank", imgleft, imgright, imgup, imgdown);
		
	}
}
