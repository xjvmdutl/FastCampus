package chapter06.ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	//�׻� ���� �ν��Ͻ��� ��ȯ�ȴ�.
	//�̱��� ����, �ĺ��ڿ� �ش�Ǵ� ���� �����ؼ� ������ �´�.
	private static MyLogger instance = new MyLogger();//myLogger���� �̱��� ����
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		try {
			logFile = new FileHandler(errorLog,true);//(file�̸�, true : append, false : overWrite)
			warningFile = new FileHandler(warningLog,true);
			fineFile = new FileHandler(fineLog,true);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL);//logger�� LogLevel�� �ִ� ���� �� ��ڴٴ� ��
		//�� log�� LogLevel�� �� ��ڴ�(��ü �α׿� ���� ����)
		//logFile�� ���� �ڵ鷯 �α׷����� �������� �ʾұ� ������ logger�� ������ ���󰣴�.
		//logger.setLevel(Level.INFO);
		//��ü LEVEL�� �� �������� ���󰣴�.
		//Logger�� LEVEL�� �� ���� ������ fineFile�� Fine���Ͱ� �ƴ� INFO�����̴�.
		//Logging.properties���� Log������ �����Ͽ� ���ϴ� �������� �������� �ִ�.
		
		fineFile.setLevel(Level.FINE);// ���� �ڵ鷯 ���� �α� ������ �ٸ��� �� �� �ִ�.
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
	}
	
	public static MyLogger getLogger() {
		//logger.finest("logger Start");
		//���� �����ڳ� �̷����� �Լ��� ȣ�������� Ȯ���ϱ� ���� finest ���� �α׸� ȣ���Ѵ�.
		//�ʱ� �ý����� �����Ҷ��� ��� �α׸� �� ��ٰ� �Ŀ� ��Ҷ��� �α� ������ �°� �����Ͽ� �ʼ� �α׸� ��´�(overHead ����)
		return instance;
	}
	public void log(String msg) {//log �Լ��� ȣ��� msg�� logger�� ��ڴ�
		//��� logger�� �α׸� �� ��ڴ�
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);	
		logger.severe(msg);
	}
	public void fine(String msg) {
		logger.fine(msg);
	}
	public void warning(String msg) {
		logger.warning(msg);
	}
}
