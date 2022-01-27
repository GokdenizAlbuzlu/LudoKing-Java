package Game;
//we create a coordinates class, inside we define 4 integer. this coordinates class will be used in list class
public class Coordinates {
	int x;
	int y;
	int length;
	int width;
	
	Coordinates(){		//default constructor
		this.x=0;
		this.y=0;
		this.length=0;
		this.width=0;
	}
	Coordinates(int x, int y, int length, int width){		//constructor with parameters
		this.x=x;
		this.y=y;
		this.length=length;
		this.width=width;
	}
	
	public int getCoordx(){
		return this.x;
	}
	public int getCoordy(){
		return this.y;
	}
    public int getCoordlength(){
		return this.length;
	}
	public int getCoordwidth(){
		return this.width;
	}
	
	void setCoordx(int x){
		this.x=x;
	}
	void setCoordy(int y){
		this.y=y;
	}
	void setCoordlength(int length){
		this.length=length;
	}
	void setCoordwidth(int width){
		this.width=width;
	}
}
