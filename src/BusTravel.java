
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;





public class BusTravel {
	private int noWorkers;
	private int noSeats;
	
	List<List<Integer>> workerSeatList;
	
	BusTravel(){
		noWorkers = 0;
		noSeats = 0;
		workerSeatList = new ArrayList<List<Integer>>();
		
		
	}
	
	private void SetWorkersSeats(int w, int s){
		noWorkers = w;
		noSeats = s;
	}
	private void SetWSConfig(){
		List<Object> maxList = new ArrayList<Object>();
		int sum = 0;
		try{
			
		
		for (int i = 0; i < noWorkers; i++) {
			
			//Create a new list for each worker and add it to th elist of workerseatlist
			List<Integer> list = new ArrayList<Integer>();
			workerSeatList.add(list);
			
			//Fetch input of worker-seat possibilities
			//Scanner input = new Scanner(System.in);
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			Scanner input = new Scanner(line);
			
			if(!input.hasNext()){
				System.out.println("I have nothing to do");
			}
			else{
				
			
			for (int j = 0; j < noSeats; j++) {
				if(input.hasNext()){
					System.out.println("Still stuck");
					list.add(Integer.parseInt(input.next()));
				}
				else
				{
					System.out.println("If didn't let me enter ");
				}
			}
			if(list != null && list.size() > 0){
				maxList.add(Collections.max(list));
			}
			}
			
		}
		
		Object[] temparray = new Object[maxList.size()];
		temparray = maxList.toArray();
		
		for (int k = 0; k < temparray.length; k++) {
			sum = sum + Integer.parseInt(temparray[k].toString()) ;
		}
		
		System.out.println(sum);
		}
		
		catch (IOException ex){
	    	System.out.println("IO Error. Program will exit!");
	    	System.exit(0);
	      }
		catch(NoSuchElementException ex){
			System.out.println("NO Such element exception and exception details are "+ex);
			System.exit(0);
		}
		 
	}

	
	public static void main(String[] args){
		BusTravel BT1 = new BusTravel();
		
		int tempW = 0;
		int tempS = 0;
			Scanner s = new Scanner(System.in);
			//tempW = Integer.parseInt(s.next()); 
			tempW =	s.nextInt();
			tempS = s.nextInt();
			//tempS = Integer.parseInt(s.next());
			
			BT1.SetWorkersSeats(tempW, tempS);
			BT1.SetWSConfig();
			
			
		
	}
}
