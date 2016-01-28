# Week-Three-Lab
A romantic Date class and methods
Using Java classes in classes

For our next lab, we will take one interpretation of the "Date" class and implement it using a separate "Person" class.

You will need to create 2 classes. 

Class **Person**

*properties*:		

Name : String
Age : int  (I know this is derived data, but bear with me)
Gender : String
	
*constructor:*		

**Person(String name, int age, String gender)**  
(use the appropriate private methods)

*public methods:*

getAge() : int  
getName() : String  
getGender() : String  
toString() : String  
(this method should return a string giving all the information about the person)  
printInfo() : void  
(same information as toString(), only output to the console. Remember!  Keep your code DRY)

*private methods:*
(These are used by the constructor)

setName(String name) : void  
(assure name != "")  
setAge(int age) : void  
(assure age > 0)  
setGender(String gender) : void  
(assure gender == "male" || gender == "female")    
(hint: Is there a String method you can use to convert the user input to lower case?)  

Question.  Why did we use a private method to set the age and gender, rather than creating these data checks in the constructor?  
Put your answer in the comments for the constructor  

class **RDate** 

*properties*:

when : Calendar  
where : String  
person1 : Person  
person2 : Person  

*constructors:	*	

**RDate()**  
(sets Calendar to today, where to "Here", person1 and person2 to null)

**RDate(Calendar when, String where)**  
(sets when and where, leaves person1 & person 2 null)  
**RDate(Calendar when, String where, Person person1, Person person2)**
(Remember to keep your code DRY)

*public methods*:	

getWhen() : String  
getWhere() : String  
getPerson1() : Person  
getPerson2() : Person  
toString() : String  		
(return a string containing all information about the date, including the information for person1 and person2. DRY code only!)  
printInfo() : void  
(same as toString only output to the console.  again, DRY code only!)  
setWhen(Calendar when) : void  
setWhere(String where) : void  
setPerson1(Person person) : void  
(assure thisIsIWU == true)  
setPerson2(Person person) : void  
(assure thisIsIWU == true)  
	
*private methods*:	

thisIsIWU(Person person1, Person person2) : boolean  

(Return true if and only if person1 and person2 are opposite genders)  

Once you have both classes created, test them out in BlueJ.  Create several instances of Person. Can you set parameters and return parameters?  Does the constructor work?   Now create several instances of Date, using your instances of Person.  Do your constructors work? How about the setters and getters?  And of course, most importantly, does you thisIsIWU function work?

