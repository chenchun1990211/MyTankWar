package com.tank.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.tank.constants.SheDing;
import com.tank.entity.Tank;

public class Jiemian extends JFrame {

	private Image imgleft = null;
	private Image imgright = null;
	private Image imgup = null;
	private Image imgdown = null;

	private Image imgnow = new ImageIcon(SheDing.RES_IMG_TANK_UP).getImage();;
	private Tank tk;

	private int speed = SheDing.SPEED_NOR_TANK;

//	public Jiemian(String title) throws HeadlessException {
//		super(title);
//		// TODO Auto-generated constructor stub
//
////		initImages();
//
//		
//
//		setSize(800, 600);
//
//		Container cp = getContentPane();
//
//		
//		
//		
//		cp.setFocusable(true);
//		cp.addKeyListener(new KeyListener() {
//
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//				int direction = tk.getDirection();
//				switch (e.getKeyChar()) {
//				case 'a':
//					direction = SheDing.DIRECTION_LEFT;
//					imgnow = imgleft;
//					break;
//				case 's':
//					direction = SheDing.DIRECTION_DOWN;
//					imgnow = imgdown;
//					break;
//				case 'd':
//					direction = SheDing.DIRECTION_RIGHT;
//					imgnow = imgright;
//					break;
//				case 'w':
//					direction = SheDing.DIRECTION_UP;
//					imgnow = imgup;
//					break;
//				default:
//					break;
//				}
//				tk.move(direction, speed);
//
//				System.out.println(e.getKeyChar());
//				repaint();
//			}
//		});
//		setResizable(false);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		setVisible(true);
//		tk = new Tank((int)cp.getSize().getWidth(),(int)cp.getSize().getHeight(),imgnow.getWidth(null),imgnow.getHeight(null));
//	}

	

	public Jiemian(String title,Image imgleft, Image imgright, Image imgup, Image imgdown) throws HeadlessException {
		super(title);
		this.imgleft = imgleft;
		this.imgright = imgright;
		this.imgup = imgup;
		this.imgdown = imgdown;
		
		
		setSize(800, 600);

		Container cp = getContentPane();

		if(cp == null) {
			System.out.println("hello");
		}
		
		
		
		cp.setFocusable(true);
		cp.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

				int direction = tk.getDirection();
				switch (e.getKeyChar()) {
				case 'a':
					direction = SheDing.DIRECTION_LEFT;
					imgnow = imgleft;
					break;
				case 's':
					direction = SheDing.DIRECTION_DOWN;
					imgnow = imgdown;
					break;
				case 'd':
					direction = SheDing.DIRECTION_RIGHT;
					imgnow = imgright;
					break;
				case 'w':
					direction = SheDing.DIRECTION_UP;
					imgnow = imgup;
					break;
				default:
					break;
				}
				tk.move(direction, speed);

				System.out.println(e.getKeyChar());
				
				repaint();
				
			}
		});
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
		
		if(cp == null) {
			System.out.println("hello");
		}
		
		System.out.println((int)cp.getSize().getWidth()+"---"+(int)cp.getSize().getHeight());
		tk = new Tank((int)cp.getSize().getWidth(),(int)cp.getSize().getHeight(),imgnow.getWidth(null),imgnow.getHeight(null));
	}



//	private void initImages() {
//		// TODO Auto-generated method stub
//		if (imgup == null) {
//			imgup = getToolkit().getImage(SheDing.RES_IMG_TANK_UP);
//			
//		}
//		if (imgdown == null) {
//			imgdown = getToolkit().getImage(SheDing.RES_IMG_TANK_DOWN);
//		}
//		if (imgleft == null) {
//			imgleft = getToolkit().getImage(SheDing.RES_IMG_TANK_LEFT);
//		}
//		if (imgright == null) {
//			imgright = getToolkit().getImage(SheDing.RES_IMG_TANK_RIGHT);
//		}
//	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Container cp = getContentPane();
		cp.validate();
		Graphics g2 = cp.getGraphics();
		cp.setBackground(Color.GREEN);
		if(imgnow == null) {
			System.out.println("is null");
		}else {
			System.out.println("is not ***"+imgnow.getWidth(cp));
		}
		g2.drawImage(imgnow, tk.getPointX(), tk.getPointY(), null);

	}

}
