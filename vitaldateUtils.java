/*
     fEMR - fast Electronic Medical Records
     Copyright (C) 2014  Team fEMR

     fEMR is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     fEMR is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with fEMR.  If not, see <http://www.gnu.org/licenses/>. If
     you have any questions, contact <info@teamfemr.org>.
*/
package femr.util.calculations;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import play.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains utilities for manipulating dates. If you add something here, please clearly document the
 * format of both the input and output.
 */
public class vitaldateUtils {

    public static String getCurrentDateTimeString(){
        DateTimeFormatter dateFormat = DateTimeFormat
                .forPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime localDateTime = new LocalDateTime();
        dateFormat.print(localDateTime);
        String dt = localDateTime.toString();
        return dt;
    }

}

