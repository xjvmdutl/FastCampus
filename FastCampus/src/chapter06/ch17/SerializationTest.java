package chapter06.ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Person implements Serializable{//마크 인터페이스
	//해당 인터페이스를 구현해야지 클래스 정보를 저장한다.
	//만약 직렬화할수 없는 맴버변수를 클래스가 가지고 있을경우 transient를 써주어야한다.
class Person implements Externalizable{	//직접 프로그래머가 객체를 읽고 쓰는 코드를 구현하고 싶을때 쓰는 인터페이스
	String name; 
	//transient String job;//직렬화 할수 없어서 저장이 안된다.
	String job;//직렬화 할수 없어서 저장이 안된다.
	
	public Person() {}
	public Person(String name,String job) {
		this.name = name;
		this.job = job;
	}
	public String toString() {
		return name + ", " +job;
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		//직접 구현해야한다
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
		//원하는 데이터만 읽고 쓰고 할수가 있다.
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신","대표이사");
		Person personKim = new Person("김유신","상무이사");
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);//객체형식으로 파일에 쓴다
			//직렬환는 네트워크에 많이 사용한다.
			//클래스 정보, 생성자 정보가 같이 들어간다.
			//java.io.NotSerializableException: chapter06.ch17.Person
			//java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: chapter06.ch17.Person
			//해당 에러가 나는데 Serializable 되지 않았기 때문이다.
			oos.writeObject(personKim);
		}catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person pLee = (Person)ois.readObject();
			//읽을떄 class를 리턴하게 되는데 클래스가 없을수도 있기떄문에 classnotFoundException처리 해줘야 한다
			Person pKim = (Person)ois.readObject();
			System.out.println(pLee);
			System.out.println(pKim);
		}catch (IOException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
