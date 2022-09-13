package curso_programacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula114 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Semana Passada: " + pastWeekLocalDate);
		System.out.println("Próxima Semana: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("Semana Passada: " + pastWeekLocalDateTime);
		System.out.println("Próxima Semana: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana Passada: " + pastWeekInstant);
		System.out.println("Próxima Semana: " + nextWeekInstant);
		
		//Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t1 Dias = " + t1.toDays());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t2 Dias = " + t2.toDays());
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 Dias = " + t3.toDays());
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("t4 Dias = " + t4.toDays());

	}

}
