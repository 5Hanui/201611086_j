import java.util.Calendar;

Calendar cal = Calendar.getInstance();
int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH);      // 0 to 11
int day = cal.get(Calendar.DAY_OF_MONTH);
int hour = cal.get(Calendar.HOUR_OF_DAY);
int minute = cal.get(Calendar.MINUTE);
int second = cal.get(Calendar.SECOND);


System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);