class F
{
	void fun(int arr[])
	{
		for(int  i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
public class Sort {

	public static void main(String[] args) {
		
		F obj =new F();
		
		int[] arr= {1,1,1,1,0,0,1,0};
		
		obj.fun(arr);
		
		
		
		
		
	}

}