interface Forest{
    public void sound();
    public void leg();
}

class Lion implements Forest{
    public void sound(){
        System.out.println("roar");
    }
    
    public void leg(){
        System.out.println("4");
    }
}

public class Interfaces
{
	public static void main(String[] args) {
		Lion l = new Lion();
		l.sound();
		l.leg();
	}
}