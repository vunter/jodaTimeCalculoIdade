package calculoIdadeJodaTime;

import org.joda.time.*;
import org.joda.time.format.*;

public class CalculoIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	DateTime start = new DateTime(1980, 7, 20, 0, 0, 0, 0);
	    	DateTime end = new DateTime(2008, 2, 13, 0, 0, 0, 0);
	            Period per = new Period (start, end);
	            
	            // Isto imprime "27 years, 6 months, 3 weeks and 3 days"
	            System.out.println (PeriodFormat.getDefault().print (per));
	            
	            
	            // Isto imprime "27 anos, 6 meses, 3 semanas e 3 dias"
	            PeriodFormatter pf = new PeriodFormatterBuilder()
	    		    .appendYears()
	    			.appendSuffix (" ano, ", " anos, ")
	                .appendMonths() 
	                .appendSuffix (" mês, ", " meses, ")
	                .appendWeeks() 
	                .appendSuffix (" semana e ", " semanas e ")
	                .appendDays()
	                .appendSuffix (" dia ", " dias ")
	                .toFormatter();
	            System.out.println (pf.print (per));
	}

}
