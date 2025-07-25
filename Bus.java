package Busrev;

public class Bus {
	private int Busno;
	private boolean AC;
	private int capacity;
	
	Bus(int Busno,boolean AC,int capacity){
		this.Busno=Busno;
		this.AC=AC;
		this.capacity=capacity;
	}
	public boolean isAc() {
		return AC;
	}
	public int getBusno() {
		return Busno;
	}
	public int getCapacity() { //accessor method
		return capacity;
	}
	public void setAC(boolean val) {
		AC=val;
		
	}
	public void setCapacity(int capicity) { // mutator
		this.capacity=capicity;
		
	}
	public void displayBusInfo() {
		System.out.println("Busno:"+Busno+"Ac:"+AC+" Total Capicity:"+capacity);
	}

}
