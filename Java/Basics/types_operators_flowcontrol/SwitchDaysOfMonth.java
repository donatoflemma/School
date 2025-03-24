package types_operators_flowcontrol;

// ermittelt die Anzahl der Tage in einem
// bestimmten Monat eines bestimmten Jahres
// Monat: 1...12;
// Jahr: beliebige int Zahl

public class SwitchDaysOfMonth {
public static void main(String[] args) {

        
        int month = 2;
        int year  = 2025;

        //Ergebnis
        int numDays = 0;

   switch (month)   {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
              numDays = 31;
              break;


            case 4:
            case 6:
            case 9:
            case 11:
             numDays = 30;
             break;

      //check leap year
      case 2:
      if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
         numDays = 29;
      else
         numDays = 28;
         break;
   }
   System.out.println("Number of Days = " + numDays);
 }
}