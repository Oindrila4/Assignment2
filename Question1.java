package Assignment2;

public class Question1 {

	public static void main(String[] args) {
		
		
		int a[]= {1,5,3,8,7,6,10,15};
		
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
		System.out.println("smallest numbers="+a[0]+" "+a[1]);
		for(int b=0;b<a.length;b++)
		{
			for(int c=b+1;c<a.length;c++)
			{
				if(a[b]<a[c])
				{
					int t=a[b];
					a[b]=a[c];
					a[c]=t;
				}
			}
		}
		System.out.println("largest numbers="+a[0]+" "+a[1]);
	}

}
