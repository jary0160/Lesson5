public class Student {
    //Always start with instance variables
    //these make up properties of your object
    //always make them private because...
    //As a class designer you want to dictate
    //property gets set. Typically you force programmers
    //to use punlc methos to set properties of an object
    //This wat, you apply rules in the method that will
    //reject invalid data for a property
    
    private String name;
    private int test1;
    private int test2;
    private int test3;
    
    //step: contructor methd (s)
    //this initializes the objec
    //gives data to the propeeties
    //this code runs when he word "new" is used elsewhere
    //its always public {NameOfClass}
    
    
    
    public Student(){
        name = "";
        test1=0;
        test2=0;
        test3=0;
        //now we can type : Student s= new Student(); in aother class;
    }
    
    //now we can type Student s = new Student(); in another class;
    
    //Step 3 - other methods/ abilities of your object
    
    //3A - Setter Methods. Their jobs is to set a privae property
    //usually void, and always require data to use in setting property
    //typically called set(Property)
    
    public void setName(String n){
        name=n;
    }
    
    public String getName(){
        return name;
    
    }
    
    public void setScore(int i, int score){
        if(i==1) test1=score;
        else if(i==2) test2=score;
        else test3=score;       
}
    
    //3b getter methods - return the value for a property
    //return type is not void, it mathces type of proeprty being returned
    //typically called get (property)
    
    public int getScore (int i){
        if (i==1) return test1;
        else if (i==2) return test2;
        else
            return test3;
    }
    
    //3c - other methods to represent other things the object can do
    public int getAverage(){
        int average; // local variable; not a property of studnts
        average = (int)
                Math.round((test1 + test2 + test3) / 3.0);
        return average;
    }
    
    
    public int getHighScore(){
        int high = Math.max(test1,test2);
        int highScore;
        highScore = test1;
        if (test2> highScore) highScore = test2;
        if (test3> highScore) highScore = test3;
        return highScore;
    }
    
    //3D - to string method
    //runs auto when u perint object
    //optiomal (tbc)
    //always public strig to String()
    
    public String toString(){
        String str;
        str = "Name:    " + name + "\n" +
              "Test1:    " + test1 + "\n" +
              "Test2:    " + test2 + "\n" +
              "Test3:    "+test3 + "\n"+
              "Average: " + getAverage();
        return str;
    }
}


