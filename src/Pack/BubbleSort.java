package Pack;

public class BubbleSort {

	 int[] Bubble(int [] items){
		int change;
		for(int i =0; i< items.length; i++){
			for(int j= 1, b = 0; j < items.length; j++, b++){
				if(items[b] > items[j])
				{
					change = items[b];
					items[b]=items[j]; 
					items[j]= change;
				}
			}
		}
		
		return items;
	}
		
	void Print(int [] items)
		{
			for(int i =0; i< items.length; i++)
			{
				System.out.println(items[i]);
			}
		}
	
	public void BinarySearch(int key, int [] items){
		int a0 = 0;
		int a1 = items.length;
		for(int i =0; i< items.length/2; i++)
		{
			
		}
	
	}
	
		
	
	
	
	public static void main(String[] args) {
		BubbleSort s = new BubbleSort();
		int [] b = new int [] {3, 7 ,22 ,9,0 ,8, 4, 3};
		int [] a = s.Bubble(b);
        s.Print(a);
	}

}
