package com.kosta.exam31;


//숙제 새를 만들고 새 싸움까지 가능하게 만들어 볼 요량 
// 좌표로 변수 추가해서 서로 어느정도 영역안에 있으면 인식하는 경우도 고려해보자
public class Bird {
	private String name;
	private int hp;
	private int hitPoint;
	private int wingSize;
	private int height;
	private int weight;
	private int maxSpeed;
	
	boolean canFly = true;
	
	public void move(int x, int y, int h) {
		if(canFly) {
			System.out.printf("%s가(이) x좌표:%d  y좌표:%d h좌표:%d로 날아서 이동합니다. \n", name, x, y, h);
		}else {
			System.out.printf("%s가(이) x좌표:%d  y좌표:%d h좌표:%d로 뛰어서 이동합니다. \n", name, x, y, h);
		}
	}
	
	public void attack(Bird b) {
		b.hp -= hitPoint;
		System.out.printf("%s에게 %s가 데미지를 %d만큼 입혔고 잔여 체력은 %d입니다. \n",b.getName(), name, hitPoint,b.getHp());
		if(b.hp < 0) {
			System.out.printf("방금 %s의 일격으로 %s가(이) 죽었습니다.\n",name,b.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public int getWingSize() {
		return wingSize;
	}

	public void setWingSize(int wingSize) {
		this.wingSize = wingSize;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	
	
	
	public Bird(String name, int hp, int hitPoint, int wingSize, int height, int weight, int maxSpeed, boolean canFly) {
		super();
		System.out.println("커스텀 새를 생성합니다.");
		this.name = name;
		this.hp = hp;
		this.hitPoint = hitPoint;
		this.wingSize = wingSize;
		this.height = height;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.canFly = canFly;
	}

	public Bird() {
		super();
		System.out.println("그냥 새를 생성합니다.");
		this.name = "그냥새";
		this.hp = 60;
		this.hitPoint = 25;
		this.wingSize = 100;
		this.height = 66;
		this.weight = 20;
		this.maxSpeed = 75;
		this.canFly = true;
	}
	
	public Bird(String name) {
		super();
		System.out.println(name+"를 생성합니다.");
		this.name = name;
		this.hp = 60;
		this.hitPoint = 25;
		this.wingSize = 100;
		this.height = 66;
		this.weight = 20;
		this.maxSpeed = 75;
		this.canFly = true;
	}
	
	
}
