package Pack;

public class BubbleSort {

	void Bubble(int [] items){
		int change;
		for(int i =0; i< items.length; i++){
			for(int j= 1; j < items.length-1; j++){
				if(items[i] > items[j])
				{
					change = items[j];
					items[j]=items[i]; 
					items[i]= change;
				}
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {

	}

}
