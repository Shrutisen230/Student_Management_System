interface Operation
{
	void add(Student s);
	void view();
	Student searchById(int id) throws StudentNotFoundException;
	void deleteById(int id) throws StudentNotFoundException;
}