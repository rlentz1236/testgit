import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	public static void main(String[] args)  {

		//Format needed MM/dd/yy
		String input = "220ed/10/01";

		String output;
		
		
		try {
			output = formatDate(input);
			
			System.out.println(output);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String formatDate(String dateString) throws ParseException  {
		
		SimpleDateFormat currentFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yy");
				
		Date dateObject = currentFormat.parse(dateString);
				
		dateString = newFormat.format(dateObject);
			
		return dateString;
	}

}
