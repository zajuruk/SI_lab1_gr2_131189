class Student {
	String index;
	String firstName;
	String lastName;
	static int grades[] = {5, 6, 6, 8, 9, 7, 10};

	public Student(String index, String name, String lName){

		this.index=index;
		this.firstName=name;
		this.lastName=lName;
}	

	public void setName(String name){
this.firstName=name;
}
	public void setlName(String lname){
this.lastName=lname;
}
	public String getName(){
return this.firstName;
}
	public String getlName(){
return this.lastName;
}
	public String getIndex(){
return this.index;
}


	public double getAverage() {
		//TODO
		int sum=0;
		int brojOceni=this.grades.length;
		for(int i=0;i<i++){
		sum+=this.grades[i];
		}
		return sum/brojOceni;
	}

	public int ECTSCredits() {
		//TODO
		int polozeni=0;
		int brojOceni=this.grades.length;
		for(int i=0;i<i++){
		if(this.grades[i]>5&&this.grades[i]<11)
		polozeni++;
		}
		return polozeni*6;
	}
}
