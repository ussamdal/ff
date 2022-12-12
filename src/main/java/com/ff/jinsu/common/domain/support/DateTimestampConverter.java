package com.ff.jinsu.common.domain.support;

import java.sql.Timestamp;
import java.time.LocalDate;

public class DateTimestampConverter {
    public static LocalDate timestampToLocalDate(Timestamp timestamp) {
        return timestamp.toLocalDateTime().toLocalDate();
    }

    public static Timestamp localDateToTimestamp(LocalDate localDate) {
        return Timestamp.valueOf(localDate.atStartOfDay());
    }
}
