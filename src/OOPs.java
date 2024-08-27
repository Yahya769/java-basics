

class student {
    int StudentId;
    String StudentName;
    String StudentCity;

    public student(){
        System.out.println("creating object");
    }

    public student(int id,String name, String city){
        System.out.println("Creating parametrized constructor");
        StudentId=id;
        StudentName=name;
        StudentCity=city;

    }


    public void study(){
        System.out.println(StudentName + "is studying ");
     }

     public void ShowFullDetail(){
         System.out.println("My name is "+ StudentName);
         System.out.println("My Id is "+ StudentId);
         System.out.println("My City is "+ StudentCity);
     }


}
