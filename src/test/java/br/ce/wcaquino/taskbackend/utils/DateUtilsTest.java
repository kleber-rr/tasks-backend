package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

    @Test
    public void mustReturnTrueToFutureDates(){
        LocalDate date = LocalDate.of(2030, 1, 1);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void mustReturnFalseToPastDates(){
        LocalDate date = LocalDate.of(2010, 1, 1);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void mustReturnTrueToNow(){
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}
