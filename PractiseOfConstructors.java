package gayatri;

class Book{
	String title;
	String Author;
	double price;
	Book(String title,String Author,double price){
		this.title=title;
		this.Author=Author;
		this.price=price;
	}
		Book(String title,String Author){
			this.title=title;
			this.Author=Author;
			this.price=100;
		}
		Book(){
			this.title="Unknown";
			this.Author="Unknown";
			this.price=0.0;
		}
		void displayinfo() {
			System.out.println("TitleName:  "+title+", AuthorName:  "+Author+", PriceCost: "+price);
		}
	/*String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void displayinfo() {
		System.out.println("Name:"+" "+name+" "+"Age:"+age);
	}*/
}
public class PractiseOfConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Person p1=new Person("Gayatri",22);
  p1.displayinfo();*/
		Book b1=new Book("1984", "George Orwell", 9.99);
		Book b2=new Book("Macbeth","William Shakespeare");
		Book b3=new Book();
		b1.displayinfo();
		b2.displayinfo();
		b3.displayinfo();
	}
}
