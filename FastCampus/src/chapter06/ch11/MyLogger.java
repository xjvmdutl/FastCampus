package chapter06.ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	//항상 같은 인스턴스가 반환된다.
	//싱글톤 패턴, 식별자에 해당되는 놈을 메핑해서 가지고 온다.
	private static MyLogger instance = new MyLogger();//myLogger또한 싱글톤 패턴
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		try {
			logFile = new FileHandler(errorLog,true);//(file이름, true : append, false : overWrite)
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
		
		logger.setLevel(Level.ALL);//logger는 LogLevel에 있는 모든걸 다 찍겠다는 말
		//내 log는 LogLevel을 다 찍겠다(전체 로그에 대한 레벨)
		//logFile은 파일 핸들러 로그레벨을 지정하지 않았기 때문에 logger을 레벨을 따라간다.
		//logger.setLevel(Level.INFO);
		//전체 LEVEL이 더 높은것을 따라간다.
		//Logger을 LEVEL이 더 높기 때문에 fineFile은 Fine부터가 아닌 INFO부터이다.
		//Logging.properties에서 Log레벨을 변경하여 원하는 레벨부터 뽑을수도 있다.
		
		fineFile.setLevel(Level.FINE);// 파일 핸들러 마다 로그 레벨을 다르게 줄 수 있다.
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
	}
	
	public static MyLogger getLogger() {
		//logger.finest("logger Start");
		//보통 생성자나 이런데서 함수가 호출됬는지를 확이하기 위해 finest 레벨 로그를 호출한다.
		//초기 시스템을 개발할때는 모든 로그를 다 찍다가 후에 운영할때는 로그 레벨에 맞게 정의하여 필수 로그만 찍는다(overHead 감소)
		return instance;
	}
	public void log(String msg) {//log 함수가 호출시 msg를 logger에 찍겠다
		//모든 logger에 로그를 다 찍겠다
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
