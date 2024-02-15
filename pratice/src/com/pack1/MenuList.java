package com.pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuList 
{
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	static Scanner sc=new Scanner(System.in);
	final String[]items= {"* Tiffin","* Soups","* Biryani","* Mandi","* Ice-Cream","* Exit"};
	
	final String[]Tiffin= {"Dosa","Idli","Poori","Vada","Bonda"};
	
	final String[]dosa= {"1.Plain Rava Dosa","2.Masala Dosa","3.Pizza Dosa","4.Corn Dosa","5.Raggi Dosa","6.Plain Dosa","7.Onion Dosa"};
	double[]Dprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Idli= {"1.Plain Idli","2.Rava Idli","3.Poha Idli","4.Oats Idli","5.Thalipith","6.Ragi Idli","7.Mallige Idli"};
	double[]Iprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Poori= {"1.Plain Poori","2.Aloo Poori","3.Palak Poori","4.Methi Poori","5.Malasa Poori","6.Panner Poori","7.Sweet Poori"};
	double[]Pprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Vada= {"1.Medu Vada","2.Masala Vada","3.Rava Vada","4.Keerai Vada","5.Ulundu Vada","6.Maddur Vada","7.Dal Vada"};
	double[]Vprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Bonda= {"1.Aloo Bonda","2.Mysore Bonda","3.Batata Bonda","4.Kara Bonda","5.Onion Bonda","6.Pav Baji  Bonda","7.Ulli Theeyal Bonda"};
	double[]Bprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Soups= {"1.Chicken Noodle Soup","2.Tomato Soup","3.French Onion Soup ","4.Gazpacho","5.Miso Soup"};
	double[]Sprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Veg= {"1.Plain Poori","2.Aloo Poori","3.Palak Poori","4.Methi Poori","5.Malasa Poori","6.Panner Poori","7.Sweet Poori"};
	double[]VBprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]NonVeg= {"1.Plain Poori","2.Aloo Poori","3.Palak Poori","4.Methi Poori","5.Malasa Poori","6.Panner Poori","7.Sweet Poori"};
	double[]NVBprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]Mandi= {"1.Chicken Mandi","2.Lamb Mandi","3.Fish Mandi ","4.Mutton Mandi","5.Vegetable Mandi"};
	double[]Mprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	final String[]cream= {"1.Vanilla","2.Chocolate","3.Frozen Yogutri ","4.Butterscotch","5.Strawberry"};
	double[]Cprices= {30.00,40.00,50.00,60.00,70.00,80.00,90.00};
	
	public void meth1()
	{
		
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]+"\t");
		}
		System.out.println("-------------------------");
		System.out.print("Enter the Item you Like:");
		String s=sc.next();
		if(s.equalsIgnoreCase("Tiffin"))
		{
			this.meth3();
			System.out.println("-------------------------");
			System.out.println("----Any thing you want----");
			
		}
		else if(s.equalsIgnoreCase("Soups"))
		{
			System.out.println("-------------------------");
			this.meth4();
			System.out.println("-------------------------");
			System.out.println("----Any thing you want----");
			
		}
		else if(s.equalsIgnoreCase("Biryani"))
		{
			System.out.println("-------------------------");
			this.meth5();
			System.out.println("-------------------------");
			System.out.println("----Any thing you want----");
			
		}
		else if(s.equalsIgnoreCase("Mandi"))
		{
			System.out.println("-------------------------");
			this.meth7();
			System.out.println("-------------------------");
			System.out.println("----Any thing you want----");
			
		}
		else if(s.equalsIgnoreCase("Ice-Cream"))
		{
			System.out.println("-------------------------");
			this.meth8();
			System.out.println("-------------------------");
			System.out.println("----Any thing you want----");
			
		}
		else if(s.equalsIgnoreCase("Exit"))
		{
			System.out.println("------THANK YOU-------");
			System.out.println("-----Visit Again-------");
		}

		else 
		{
			System.out.println("Sorry we do not have that Dish!!!! Please enter the "+"\n"+"Try again");
			System.out.println("-------------------------");
			this.meth1();
		}
	}
	public void meth3()
	{
		System.out.println("----------Tiffin's-----------");
		
		for(int j=0;j<Tiffin.length;j++)
		{
			System.out.println(Tiffin[j]+"\t");
		}
		System.out.println("-------------------------");
		this.meth2();
	}
	public void meth2()
	{
		System.out.print("Enter the Item you Like:");
		
		String input=sc.next().toLowerCase();//changes User inout to lower case
		
		System.out.println("-------");
			
				switch(input)
				{
				case "dosa":
					for(int i=0;i<dosa.length;i++)
					{
						System.out.println(dosa[i]+" ------> "+Dprices[i]);
					}
//					for present class methods outside the static area this keyword in present in method call
//					this.selectingItem(); // below and this line are same outside the static area we can use it 
					selectingItem();
					break;
				case "idli":
					
					for(int i=0;i<Idli.length;i++)
					{
						System.out.println(Idli[i]+" ------> "+Iprices[i]);
					}
					break;
				case "poori":
					
					for(int i=0;i<Poori.length;i++)
					{
						System.out.println(Poori[i]+" ------> "+Pprices[i]);
					}
					break;
				case "vada":
					for(int i=0;i<Vada.length;i++)
					{
						System.out.println(Vada[i]+" ------> "+Vprices[i]);
					}
					break;
				case "bonda":
					
					for(int i=0;i<Bonda.length;i++)
					{
						System.out.println(Bonda[i]+" ------> "+Bprices[i]);
					}
					break;
				
				default:
				{
					System.out.println("Sorry we do not have that Dish!!!! "+"\n"+"Try again");
					System.out.println("-------------------------");
					this.meth3();
				}

			}
		}
	public void meth4()
	{
		System.out.println("----------Soup's-----------");
		
		for(int i=0;i<Soups.length;i++)
		{
			System.out.println(Soups[i]+" ------> "+Sprices[i]);
		}
	}
	private void meth5() 
	{
		System.out.println("----------Biryani-----------");
		System.out.println("1.Veg-Biryani"+"\n"+"2.Non-Veg Biryani");
		System.out.print("Enter the what you want:");
		String input=sc.next();
		if(input.equalsIgnoreCase("Veg-Biryani")) 
		{
			
			for(int i=0;i<Veg.length;i++)
			{
				System.out.println(Veg[i]+" ------> "+VBprices[i]);
			}
			
		}
		else if(input.equalsIgnoreCase("Non-Veg-Biryani")) 
		{
			
			for(int i=0;i<NonVeg.length;i++)
			{
				System.out.println(NonVeg[i]+" ------> "+NVBprices[i]);
			}
		}
		else
		{
			System.out.println("Sorry we do not have that Dish!!!! "+"\n"+"Try again");
			System.out.println("-------------------------");
			this.meth5();
		}
	}
	
	private void meth7() 
	{
		System.out.println("----------Mandi-----------");
		
		for(int i=0;i<Mandi.length;i++)
		{
			System.out.println(Mandi[i]+" ------> "+Mprices[i]);
		}
		
	}
	private void meth8() 
	{
		System.out.println("----------Ice-Cream-----------");
		
		for(int i=0;i<cream.length;i++)
		{
			System.out.println(cream[i]+" ------> "+Cprices[i]);
		}
		
	}
	
	//method to select which item customer need and storing the item for printing the bill
	public void selectingItem()
	{
		System.out.println("-------------------------\n");
		System.out.println("Choose the Item Number: ");
//		int item = sc.nextInt();
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		MenuList aobj=new MenuList();
		System.out.println("----------WHAT'S ON YOUR MIND-----------");
		aobj.meth1();	
		
		
	}
}
