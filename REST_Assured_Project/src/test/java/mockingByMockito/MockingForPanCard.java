package mockingByMockito;

import org.mockito.Mockito;

class PANCard{
	public String isvalid(String panCard) {
		if (panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")==true) {
			return "is valid card";
		}else return "is valid card";
	}
	public static PANCard getMockObject() {
		PANCard mocObj = Mockito.mock(PANCard.class);
		Mockito.when(mocObj.isvalid("ABCDE1234A")).thenReturn("is valid card");
		Mockito.when(mocObj.isvalid("ABCDE1235D")).thenReturn("is valid card");
		Mockito.when(mocObj.isvalid("ABCDE1236C")).thenReturn("is valid card");
		Mockito.when(mocObj.isvalid("ABCDE1237B")).thenReturn("is invalid card");
		return mocObj;
	}
}
public class MockingForPanCard {
	 
	public static void main(String[] args) {
		PANCard obj = PANCard.getMockObject();
		System.out.println(obj.isvalid("ABCDE1234A"));

	}

}
