import java.util.ArrayList;
import java.util.Scanner;

public class Encryptor
	{
		static Scanner userInput= new Scanner(System.in);
		static String secret;
		static int length;
		static ArrayList <Integer> space = new ArrayList <Integer>();
		public static void encryptor()
		{
			printSentence();
			takeSpace();
			replaceChar();
			printSecret();
		}
		public static void printSentence()
		{
			System.out.println("Write your message here.");
			secret = userInput.nextLine();
			length = secret.length();
		}
		public static ArrayList takeSpace()
		{
			int place = 1;
			while (place != 0)
				{
					space.add(secret.indexOf(" ", place));
					place = secret.indexOf(" ", place)+1;
				}
			space.remove(space.size()-1);
			secret = secret.replace(" ", "");
			return space;
		}
		public static String replaceChar()
		{
			secret = secret.toLowerCase();
			secret = secret.replace("a", "!");
			secret = secret.replace("b", "@");
			secret = secret.replace("c", "#");
			secret = secret.replace("d", "$");
			secret = secret.replace("e", "%");
			secret = secret.replace("f", "^");
			secret = secret.replace("g", "&");
			secret = secret.replace("h", "*");
			secret = secret.replace("i", ",");
			secret = secret.replace("j", "(");
			secret = secret.replace("k", ")");
			secret = secret.replace("l", "{");
			secret = secret.replace("m", "}");
			secret = secret.replace("n", "|");
			secret = secret.replace("o", ":");
			secret = secret.replace("p", "'");
			secret = secret.replace("q", "\"");
			secret = secret.replace("r", "<");
			secret = secret.replace("s", ">");
			secret = secret.replace("t", "?");
			secret = secret.replace("u", "+");
			secret = secret.replace("v", "_");
			secret = secret.replace("w", "=");
			secret = secret.replace("x", "`");
			secret = secret.replace("y", "~");
			secret = secret.replace("z", "/");
			/*for (int i = 0; i < space.size(); i++)
				{
					System.out.println(space.get(i));
				}*/
			return secret;
		}
		public static void printSecret()
		{
			System.out.println(secret);
		}
	}
