//Q) There is one running race between different participants. So in that race two partners need to finish the race. 
//There is four rounds of race in that each lane length is 100m.So in that one participant will cover 30% of the lane length and another partner will cover remaining length of lane.
//So print each participant covers distance in that race.
import java.util.Scanner;
class example7
{
	public static void main(String[] args)
	{
		int lanelen = 100;
		int rounds = 4;
		int firstparticipant = 30;
		int firstparticipantcover = lanelen*rounds*firstparticipant/100;
		int secondparticipantcovered = lanelen*rounds-firstparticipantcover;
		System.out.println("The distance covered by firstperson ="+firstparticipantcover);
		System.out.println("The distance covered by secondperson ="+ secondparticipantcovered);
		
	}	
}

