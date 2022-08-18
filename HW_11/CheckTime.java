package HW_11;

import java.sql.Timestamp;
import java.util.Date;

public class CheckTime {
    public Timestamp CheckTime(){
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        }
    }

