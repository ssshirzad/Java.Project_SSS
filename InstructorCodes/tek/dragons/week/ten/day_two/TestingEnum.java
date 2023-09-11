package tek.dragons.week.ten.day_two;

public class TestingEnum {
	public static final long SHORT_WAIT = 1000;

	public static void main(String[] args) throws InterruptedException {

		System.out.println(WaitTime.SHORT_WAIT.getTimeout());
		Thread.sleep(WaitTime.SHORT_WAIT.getTimeout());

		StatusCode code = StatusCode.REJECTED;

		switch (code) {
		case APPROVED:
			System.out.println("Approved");
			break;
		case DENIED:
			System.out.println("Denied");
			break;
		case SUBMITTED:
			System.out.println("submitted");
			break;
		case REJECTED:
			System.out.println("Rejected");
			break;
		default:
			System.out.println("Wrong Code");
			break;
		}

//		System.out.println(StatusCode.APPROVED);
//		
//		System.out.println(StatusCode.DENIED);
	}
}
