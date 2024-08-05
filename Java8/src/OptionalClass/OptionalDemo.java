package OptionalClass;


import java.util.Optional;

public class OptionalDemo {
	
		
		public static void main(String[] args) {
			
			String name=null;
			String name2="uniq";
			//Optional <String> op =Optional.of(name);
			Optional<String> ch=Optional.ofNullable(name2);
			
			//System.out.println(op);
			System.out.println(ch);
			System.out.println(Optional.empty());
			System.out.println(ch.equals(Optional.empty()));
		
			//System.out.println(ch.get());// This method shows an error if the Optional box has null value
			
			//System.out.println(ch.isPresent());
			
		     ch.ifPresent((c) -> System.out.println("Hello "+c));		
			
			//System.out.println(ch.orElse("10"+"10"));
			
			//System.out.println(ch.orElseGet(() -> {String name3="hello value is not present"; return name3;}));
			
			//System.out.println(ch.orElseThrow(ArithmeticException :: new));
			
		

	

}
}
