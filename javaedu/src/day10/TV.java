package day10;

public class TV {
	private String model;
	private int size;
	private int channel;
	
	public TV() {
		
	}
	public TV(String model,int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}	
	public void channelUp() {
		if(getChannel() >= 10) {
			setChannel(1);
		}else {
			setChannel(getChannel()+1);
		}
	}
	public void channelDown() {
		if(getChannel() <= 1) {
			setChannel(10);
		}else {
			setChannel(getChannel()-1);
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
