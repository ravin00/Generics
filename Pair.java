package June2023Q2;

//import java.util.HashMap;

public class Pair <T,U> {

		private T first;
		private U second;
		
//		HashMap<T,U> p1 = new HashMap<>();
		
		public Pair(T first, U second) {
			super();
			this.first = first;
			this.second = second;
		}


		public T getFirst() {
			return first;
		}


		public void setFirst(T first) {
			this.first = first;
		}


		public U getSecond() {
			return second;
		}		
		
}
