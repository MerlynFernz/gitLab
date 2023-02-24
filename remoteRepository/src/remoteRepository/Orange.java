package remoteRepository;

public class Orange {
	String color;
	
	Orange(String color)
	{
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange greenaApple= new Orange("green");
		String color=greenApple.getcolor();
		System.out.println("color of apple is "+color);

	}

}
