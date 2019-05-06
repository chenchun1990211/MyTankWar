package com.tank.entity;

import com.tank.constants.SheDing;

public class Tank {

	private int pointX = 0;
	private int pointY = 0;
	
	int maxX;
	int maxY;
	
	int imgX;
	int imgY;

	public Tank(int maxX, int maxY, int imgX, int imgY) {
		super();
		this.maxX = maxX;
		this.maxY = maxY;
		this.imgX = imgX;
		this.imgY = imgY;
	}

	public Tank(int maxX, int maxY) {
		super();
		this.maxX = maxX;
		this.maxY = maxY;
	}

	private int direction = SheDing.DIRECTION_UP;

	public void move(int direction, int speedMode) {
		switch (direction) {
		case SheDing.DIRECTION_UP:
              pointY -= speedMode;
			break;
		case SheDing.DIRECTION_LEFT:
			pointX -= speedMode;
			break;
		case SheDing.DIRECTION_RIGHT:
			pointX += speedMode;
			break;
		case SheDing.DIRECTION_DOWN:
			pointY += speedMode;
			break;
		default:
			break;
		}
		
		//¼ì²é±ß½ç
		if(pointX <0) {
			pointX = 0;
		}
		if(pointY <0) {
			pointY = 0;
		}
		
		if(pointX >=(maxX-imgX)) {
			pointX = maxX-imgX ;
		}
		if(pointY >=(maxY-imgY)) {
			pointY = maxY-imgY;
		}
		
		System.out.println("pointX"+pointX+"pointY"+pointY+"---"+maxX+"--"+maxY);
		setDirection(direction);
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
