import java.util.Scanner;
abstract class player    //The abstract class player (for Q.1)
{
    final String team="IND";    //using 'final' team name (for Q.5)
    String player_name;
    static int player_id;       //using 'static' for the player id (for Q.5)
    int score,wickets_taken;    //declaring score of a batsman and wickets taken by bowler here in player so that through Comp_stats() method, a player instance can access respective data of batsman and bowler
    abstract void print_info();
}
interface Records      //interface Records (for Q.3)
{
    void print_stats();
    player Comp_stats(player ob1,player ob2);
}
class Batsman extends player implements Records   //child class of player (for Q.2)
{
    int innings_played;
    float runrate;
    Batsman()
    {
        player_id=100;
    }
    Batsman(int i)
    {
        this();    //Using 'this' for constructor chaining (for Q.5)
        player_id=player_id+i;
    }
    public void print_stats()
    {
        System.out.println("Innings Played:"+innings_played);
        System.out.println("Score:"+score);
        System.out.println("Run Rate:"+runrate);
    }
    void print_info()
    {
        System.out.println("Player Name:"+player_name);
        System.out.println("Team:" + team);
        print_stats();
    }
    public player Comp_stats(player ob1,player ob2)
    {
        if(ob1.score>ob2.score)
            return ob1;
        else
            return ob2;
    }
}
class Bowler extends player implements Records   //child class of player (for Q.2)
{
    int innings_played;
    Bowler()
    {
        player_id=200;
    }
    Bowler(int i)
    {
        this();    //Using 'this' for Constructor Chaining (for Q.5)
        player_id=player_id+i;
    }
    public void print_stats()
    {
        System.out.println("Innings Played:"+innings_played);
        System.out.println("Wickets Taken:"+wickets_taken);
    }
    void print_info()
    {
        System.out.println("Player Name:"+player_name);
        System.out.println("Team:" + team);
        print_stats();
    }
    public player Comp_stats(player ob1,player ob2)
    {
        if(ob1.wickets_taken>ob2.wickets_taken)
            return ob1;
        else
            return ob2;
    }
}
class player_info
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        player maxbat,maxbowl;
        Batsman[] bat=new Batsman[3]; //Declaring array of objects(Batsmen) (for Q.6)
        Bowler[] bowl=new Bowler[3];  //Declaring array of objects(Bowlers) (for Q.6)
        for(int i=0;i<3;i++)          //Taking Inputs for Batsmen Details
        {
            System.out.println("\nEnter the details for Batsman "+(i+1)+":");   
            bat[i]=new Batsman(i+1);
            System.out.println("Enter name:");
            bat[i].player_name=sc.nextLine();
            System.out.println("Enter innings played:");
            bat[i].innings_played=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter score:");
            bat[i].score=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter runrate:");
            bat[i].runrate=sc.nextFloat();
            sc.nextLine();
        }
        for(int i=0;i<3;i++)    //Taking inputs for Bowler Details
        {
            System.out.println("\nEnter the details for Bowler "+(i+1)+":");
            bowl[i]=new Bowler(i+1);
            System.out.println("Enter name:");
            bowl[i].player_name=sc.nextLine();
            System.out.println("Enter innings played:");
            bowl[i].innings_played=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter No. of wickets taken:");
            bowl[i].wickets_taken=sc.nextInt();
            sc.nextLine();
        }
        maxbat=bat[0];
        maxbowl=bowl[0];
        for(int i=0;i<2;i++)
        {
            maxbat=bat[i].Comp_stats(maxbat,bat[i+1]);   //Using Dynamic Method Dispatch to compare Batsmen and determine the highest scorer (for Q.4)
            maxbowl=bowl[i].Comp_stats(maxbowl,bowl[i+1]);  //Using Dynamic Method Dispatch to compare Bowlers and determine the highest wicket taker (for Q.4)
        }
            System.out.println("\nBatsman with maximum score is:");
            //Printing the info of highest scorer (for Q.6)
            maxbat.print_info();
            System.out.println("\nBowler with maximum wickets is:"); 
            //Printing the info of highest wicket taker(for Q.6)
            maxbowl.print_info();             
    }
}
