package mapping.converter;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import org.apache.commons.lang.Validate;

// TODO 05: Create a JPA 2.1 converter for java.time.LocalDate 

// TODO 05c: Mark this as a converter
@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate localDate) {
		Validate.notNull(localDate);
		// TODO 05a: Convert java.time.LocalDate to java.sql.Date
		// Hint: Use static java.sql.Date#valueOf(LocalDate) factory method
		// Run LocalDateConverterTests to see that it is working
		return Date.valueOf(localDate);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		Validate.notNull(date);
		// TODO 05b: Convert java.sql.Date to java.time.LocalDate
		// Hint: Use static java.sql.Date#toLocalDate() factory method
		// Run LocalDateConverterTests to see that it is working
		return date.toLocalDate();
	}
}
