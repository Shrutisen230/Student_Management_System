import java.util.Scanner;

class StudentManagementSystem
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		StudentManagement sm= new StudentManagement(50);
		
		while(true)
		{
			System.out.println("---------Student Management Menu ----------");
			System.out.println("1. Add Student ");
			System.out.println("2. View All Student :");
			System.out.println("3. Search Student By ID :");
			System.out.println("4. Delete Student By ID :");
			System.out.println("5. EXIT ");
			System.out.println("Enter your choice :");
			
			int choice =sc.nextInt();
			sc.nextLine();
			
			try
			{
				switch(choice)
				{
					case 1:
					System.out.println("Enter ID :");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name :");
					String name= sc.nextLine();
					System.out.println("Enter Age :");
					int age= sc.nextInt();
					sm.add(new Student(id, name, age));
					break;
					
					case 2:
					sm.view();
					break;
					
					case 3:
					System.out.println("Enter ID to Search :");
					int searchID = sc.nextInt();
					Student s=sm.searchById(searchID);
					System.out.println("Found :" +s);
					break;
					
					case 4:
					System.out.println("Enter ID to Delete :");
					int delete=sc.nextInt();
					sm.deleteById(delete);
					break;
					
					case 5:
					System.out.println("EXITTTT !!!!");
					sc.close();
			
					default:
					System.out.println("Invalid Choice ");
				}
			}
			
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("ERROR :"+ e.getMessage());
			}
		}
	}
}