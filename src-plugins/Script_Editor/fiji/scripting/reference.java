

public class reference {


	public static void main(String args[]) {

		String[] arr = {"sumit", "dubey", "tanmay", "mogra", "saini"};
		for (String s : arr) {
			if (s.startsWith(""))
				System.out.println(s);
		}

	}

	static class Package {
		String key;

		public Package(String key) {
			key = key;
		}
	}

}