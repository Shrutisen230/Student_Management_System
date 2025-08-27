class StudentManagement implements Operation
{
	Student[] st;
	int count;
	
	StudentManagement(int size)
	{
		st=new Student[size];
		count=0;
	}
	
	@Override
	public void add(Student s)
	{
		if(count<st.length)
		{
			st[count++]=s;
			System.out.println("Student added succesfully !!!");
		}
		else
		{
			System.out.println("Student List is full . Can't add more !");
		}
	}
	
	@Override
	public void view()
	{
		if(count==0)
		{
			System.out.println("No Students Available !!");
			return ;
		}
		else
		{
			System.out.println("---Student List ---");
			for(int i=0;i<count;i++)
			{
				System.out.println(st[i]);
			}
		}
	}
	
	@Override 
	public Student searchById(int id) throws StudentNotFoundException
	{
		for(int i=0;i<count;i++)
		{
			if(st[i].id==id)
				return st[i];
		}
		throw new StudentNotFoundException("Student with ID :"+ id +" not found");
	}
	
	@Override 
	public void deleteById(int id) throws StudentNotFoundException
	{
		for(int i=0;i<count;i++)
		{
			if(st[i].id==id){
				System.out.println("Deleted : " +st[i]);
				for(int j=i;i<count-1;j++)
				{
					st[j]=st[j+1];
				}
				st[count-1]=null;
				count--;
				return;
			}
		}
		throw new StudentNotFoundException("Can't delete becuase Student with ID :"+ id +" not found !!!");
	}
	
}