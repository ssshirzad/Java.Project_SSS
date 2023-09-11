package tek.dragons.week.ten.day_two;

public enum WaitTime {
	//Enum is Special class with constants variable (final variable)
	//Enum can have parameters with using encapsulation concept. 
	
	SHORT_WAIT(1000), 
	LONG_WAIT(60000);
	
	private long timeout; 
	
	WaitTime(long timeout) {
		this.timeout = timeout;
	}
	
	public long getTimeout() {
		return this.timeout;
	}
}
