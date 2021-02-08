package Assignment2;

public class Question3 {

	public static void main(String[] args) {
		int a[]= {1,5,3,8,7,12,15,21,32,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

	}
	
	}
	
}

