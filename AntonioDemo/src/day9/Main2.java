package day9;

public class Main2 {

	public static void main(String[] args) {
		GameMahine ps5 = new PS5();
		Nintendo nintendo = new Nintendo();
		XBox xbox = new XBox();		
		
		YoungPeople Antonio = new YoungPeople();
		Antonio.haveFun(ps5);
		System.out.println();
		Antonio.haveFun(nintendo);
		System.out.println();
		Antonio.haveFun(xbox);
	}

}

//we young people usually do 2 things in our free time
//1.have fun，if we want to have fun,we need game machine, we use game machine to play games
class YoungPeople{
	public void haveFun(GameMahine machine) {  //GameMahine mahine <- GameMahine ps5 = new PS5();
											   //GameMahine mahine <- XBox xbox = new XBox();
		System.out.println("time to have fun");
		machine.playGames();
	}
}



//we have game machine in this world, we can play games with it. but how to do it, that depends on what kind of game machine we are using.
class GameMahine{
	public void playGames() {
		System.out.println("play games");
	}
}

//a. PS5，it's a game machine, and how to play games with it？"buy a game CD，connect with TV，there we go!"
class PS5 extends GameMahine{
	@Override
	public void playGames() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go!");
	}
}
//b. Nintendo，it's a game machine, and how to play games with it？"turn it on，choose a game，playing alone，so nice"
class Nintendo extends GameMahine{
	@Override
	public void playGames() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}
//c. XBox，it's a game machine, and how to play games with it？"connect with TV,choose a game from game store, then play"
class XBox extends GameMahine{
	@Override
	public void playGames() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}














