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

//class Person implements Serializable{//��ũ �������̽�
	//�ش� �������̽��� �����ؾ��� Ŭ���� ������ �����Ѵ�.
	//���� ����ȭ�Ҽ� ���� �ɹ������� Ŭ������ ������ ������� transient�� ���־���Ѵ�.
class Person implements Externalizable{	//���� ���α׷��Ӱ� ��ü�� �а� ���� �ڵ带 �����ϰ� ������ ���� �������̽�
	String name; 
	//transient String job;//����ȭ �Ҽ� ��� ������ �ȵȴ�.
	String job;//����ȭ �Ҽ� ��� ������ �ȵȴ�.
	
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
		//���� �����ؾ��Ѵ�
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
		//���ϴ� �����͸� �а� ���� �Ҽ��� �ִ�.
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("�̼���","��ǥ�̻�");
		Person personKim = new Person("������","���̻�");
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);//��ü�������� ���Ͽ� ����
			//����ȯ�� ��Ʈ��ũ�� ���� ����Ѵ�.
			//Ŭ���� ����, ������ ������ ���� ����.
			//java.io.NotSerializableException: chapter06.ch17.Person
			//java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: chapter06.ch17.Person
			//�ش� ������ ���µ� Serializable ���� �ʾұ� �����̴�.
			oos.writeObject(personKim);
		}catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person pLee = (Person)ois.readObject();
			//������ class�� �����ϰ� �Ǵµ� Ŭ������ �������� �ֱ⋚���� classnotFoundExceptionó�� ����� �Ѵ�
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
