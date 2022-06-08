package myOptionalProject;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		Optional<String> gender= Optional.of(("MALE"));
		Optional<String> emptyGender = Optional.empty();
		
//		if(gender.isPresent()) {
//			System.out.println("Value Available");
//		}
//		else {
//			System.out.println("Value not available");
//		}
		
		gender.ifPresent(g-> System.out.println("In gender - Value is available "+ gender));
		emptyGender.ifPresent(g-> System.out.println("In gender - Value is available "+ gender));

	}

}
