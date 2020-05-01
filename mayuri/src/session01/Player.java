package session01;

public class Player {
	String PlayerName,PlayerCountry;
	
	public Player() //default constructor
	{
		//this(); this only execute ones only as default constructor
		PlayerCountry = "India";
		
	}
	public Player(String playerName)
	{
		this();
		this.PlayerName = playerName;
	}
	public void display()
	{
		System.out.println(PlayerName +" " +PlayerCountry);
	}
	public static void main(String[] args) 
	{
		Player p = new Player("Rohit") ;
		p.display();

	}

}
