package com.github.hairless.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangyangting
 * @date 2020-06-15
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class BookingService {
    private final JdbcTemplate jdbcTemplate;

    @Transactional()
    public void book(String... persons) {
        Arrays.stream(persons).forEach(person -> {
            log.info("Booking " + person + " in a seat...");
            jdbcTemplate.update("insert into BOOKINGS(FIRST_NAME) values (?)", person);
        });
    }

    public List<String> findAllBookings() {
        return jdbcTemplate.query("select FIRST_NAME from BOOKINGS",
                (rs, rowNum) -> rs.getString("FIRST_NAME"));
    }
}
